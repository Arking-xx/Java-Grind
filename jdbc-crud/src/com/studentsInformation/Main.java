package com.studentsInformation;

import com.studentsInformation.model.Student;
import com.studentsInformation.service.StudentService;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentService studentService = new StudentService();
    public static void main(String[] args) throws SQLException {


        displayMenu();
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice){
            case 1:
                queryStudent();
            break;
            case 2:
                addNewStudent();
                break;
            case 3:
                updateStudentRecord();
                break;
            case 4:
                deleteStudentRecord();
                break;
            case 5:
                checkStudentsTable();
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
        }
        private static void displayMenu() {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Search for student");
            System.out.println("2. Add student");
            System.out.println("3. Update student record");
            System.out.println("4. Delete student record");
            System.out.println("5. Check All students record");
            System.out.print("Enter your choice: ");
        }


        private static  void queryStudent()throws SQLException{
            System.out.print("Enter roll number: ");

            int rollNumber = Integer.parseInt(scanner.nextLine());

            Student student = studentService.getStudentById(rollNumber);

            System.out.println("\n=== Student Details ===");
            System.out.println(student.toString());
        }

        private static void addNewStudent() throws SQLException{

        System.out.println("Enter name");
        String name = scanner.nextLine();

        System.out.println("Enter percentage");
        double percentage = Double.parseDouble(scanner.nextLine());


        System.out.println("Enter address");
        String address = scanner.nextLine();

        Student student = studentService.addNewStudent(name, percentage, address);

        System.out.println("Record successfully inserted");
        System.out.println("Generated ID: "+ student.getId());
        System.out.println(student.toString());
        }

        private static void updateStudentRecord() throws SQLException{
            System.out.println("Enter new name");
            String name = scanner.nextLine();

            System.out.println("Enter new percentage");
            double percentage = Double.parseDouble(scanner.nextLine());

            System.out.println("Enter new address");
            String address = scanner.nextLine();


            System.out.println("Enter student ID to update");
            int rollNumber = Integer.parseInt(scanner.nextLine());

            Student student = studentService.updateStudentRecord(name, percentage, address, rollNumber);
            System.out.println("Student record successfully update");
            System.out.println(student.toString());

        }
        private static void deleteStudentRecord()throws SQLException{
            System.out.println("Enter Student ID to delete");
            int rollNumber = Integer.parseInt(scanner.nextLine());

            Student student = studentService.deleteStudentRecord(rollNumber);
            System.out.print("Deleted student: " + student.getName());
        }
        private static void checkStudentsTable()throws SQLException{
        System.out.println("All Students");
        studentService.AllStudentsRecord();
        }
}









