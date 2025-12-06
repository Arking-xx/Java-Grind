package com.studentsInformation.service;

import com.studentsInformation.dao.StudentDAO;
import com.studentsInformation.implement.StudentDAOImplement;
import com.studentsInformation.model.Student;

import java.sql.SQLException;
import java.util.List;

public class StudentService {
    private StudentDAO studentDAO;
    public StudentService(){
        // why this?
        // and not this?
        // this.studentDAOImplements = new StudentDAOImplements()?
        // if doing that from example at the top is tightly couples to the specific implementation
        // then why that?? it's saying you follow contract studentDAO contract.

        //scenario, imagine you have multiple database
        // if we follow the example from the top then it's not flexible if we scale it.
        // this.studentDAO = new StudentDAOMySQLImplement();
        // this.studentDAO = new StudentDAOPostgreSQLImplement();
        this.studentDAO = new StudentDAOImplement();
    }

    public Student getStudentById(int rollNumber) throws SQLException {

        Student student = studentDAO.get(rollNumber);
        if(student == null){
            throw new SQLException("Student with roll number" + rollNumber + " not found");
        }
        return student;
    }

    public void AllStudentsRecord()throws SQLException{

        List<Student> student = studentDAO.getAll();
        System.out.println(student.toString());

    }


    public Student addNewStudent(String name, double percentage, String address)throws  SQLException{
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }

        if(percentage < 0 || percentage > 100){
            throw new IllegalArgumentException("Percentage must be between 0 and 100");
        }


        if(address == null || address.trim().isEmpty()){
            throw new IllegalArgumentException("Address cannot be empty");
        }
        Student student = new Student();

        student.setName(name.trim());
        student.setPercentage(percentage);
        student.setAddress(address.trim());

        boolean success = studentDAO.insert(student);

        if(!success){
            throw new SQLException("Failed to insert student record");
        }

        return student;
    }

    public Student updateStudentRecord(String name, double percentage, String address, int rollNumber)throws SQLException{

        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }

        if(percentage < 0 || percentage > 100){
            throw new IllegalArgumentException("Percentage must be between 0 and 100");
        }


        if(address == null || address.trim().isEmpty()){
            throw new IllegalArgumentException("Address cannot be empty");
        }

        Student student = new Student();

        student.setName(name.trim());
        student.setPercentage(percentage);
        student.setAddress(address.trim());
        student.setId(rollNumber);

        studentDAO.update(student);

        return student;
    }

    public Student deleteStudentRecord(int rollNumber)throws SQLException{

        Student student = studentDAO.get(rollNumber);
        if (student == null) {
            throw new SQLException("Student with roll number " + rollNumber + " not found");
        }
        int result = studentDAO.delete(student);

        if(result == 0){
            throw new SQLException("Failed to delete student");
        }

        return student;
    };

}

