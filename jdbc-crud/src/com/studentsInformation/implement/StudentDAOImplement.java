package com.studentsInformation.implement;

import com.studentsInformation.dao.StudentDAO;
import com.studentsInformation.database.DatabaseConnection;
import com.studentsInformation.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImplement implements StudentDAO {
    @Override
    public Student get(int id) throws SQLException {
        Connection con = DatabaseConnection.getConnection();
        Student student = null;
        String sql = "SELECT * FROM students WHERE roll_number = ? ";

        PreparedStatement preparedStatement = con.prepareStatement(sql);

        preparedStatement.setInt(1, id);
        ResultSet rs = preparedStatement.executeQuery();

        if(rs.next()){
            int studentId =  rs.getInt("roll_number");
            double studentPercentage = rs.getDouble("percentage");
            String studentName = rs.getString("name");
            String studentAddress = rs.getString("address");

            student = new Student(studentId , studentName, studentPercentage ,studentAddress);
        }
        return student;
    }

    @Override
    public List<Student> getAll() throws SQLException {
        Connection con = DatabaseConnection.getConnection();

        List<Student> students = new ArrayList<Student>();
        String sql = "SELECT * FROM students";

        PreparedStatement preparedStatement = con.prepareStatement(sql);
        ResultSet rs = preparedStatement.executeQuery();

        while (rs.next()){
            int studentId =  rs.getInt("roll_number");
            String studentName = rs.getString("name");
            double studentPercentage = rs.getDouble("percentage");
            String studentAddress = rs.getString("address");
            Student student = new Student(studentId, studentName, studentPercentage, studentAddress);

            students.add(student);

        }
        return students;
    }

    @Override
    public int save(Student student) throws SQLException {
        return 0;
    }

    @Override
    public boolean insert(Student student) throws SQLException {

        Connection con = DatabaseConnection.getConnection();
        String sql = "INSERT INTO students(name, percentage, address) VALUES (?, ?, ?)";

        PreparedStatement preparedStatement =  con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        preparedStatement.setString(1, student.getName());
        preparedStatement.setDouble(2, student.getPercentage());
        preparedStatement.setString(3, student.getAddress());

        int rowsAffected;
        rowsAffected = preparedStatement.executeUpdate();

        if(rowsAffected> 0) {
            try(ResultSet generatedKeys = preparedStatement.getGeneratedKeys()){
                if(generatedKeys.next()){
                    student.setId(generatedKeys.getInt(1));
                }
            }
        }

        return rowsAffected > 0;
    }

    @Override
    public int update(Student student) throws SQLException {
        Connection con = DatabaseConnection.getConnection();

        String sql = "UPDATE students SET name = ?, percentage = ?, address = ? WHERE roll_number = ?";

        PreparedStatement preparedStatement = con.prepareStatement(sql);

        preparedStatement.setString(1, student.getName());
        preparedStatement.setDouble(2, student.getPercentage());
        preparedStatement.setString(3, student.getAddress());
        preparedStatement.setInt(4 , student.getId());

        int result = preparedStatement.executeUpdate();
        return result;
    }

    @Override
    public int delete(Student student) throws SQLException {
        Connection con = DatabaseConnection.getConnection();

        String sql = "DELETE FROM students WHERE roll_number = ?";

        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setInt(1 , student.getId());

        int result = preparedStatement.executeUpdate();
        return result;

    }
}
