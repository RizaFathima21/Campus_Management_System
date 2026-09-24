package com.campus.app;

import java.util.Scanner;

import com.campus.model.Student;
import com.campus.service.StudentService;

public class Main {

    public static void main(String[] args) {  
        Scanner SC=new Scanner(System.in);
        //inputs from users
        System.out.println("Enter Student id:");
        int studentid=SC.nextInt();
        System.out.println("Enter student name:");
        String studentname=SC.next();
        System.out.println("Enter student age:");
        int  age=SC.nextInt();
        System.out.println("Enter student department:");
        String department=SC.next();
        System.out.println("number of subjects:");
        int n=SC.nextInt();
        int[] marks=new int[n];
        System.out.println("Enter marks of "+n+" subjects:");
        for(int i=0;i<n;i++) {
            System.out.println("Enter marks of subject "+(i+1)+":");
            marks[i]=SC.nextInt();
            SC.nextLine(); // consume the newline character
        }
        Student student=new Student(studentid,studentname,age,department,marks);
        student.displayStudentInfo(true);
        Student.displayStudentCount();
        StudentService studentService = new StudentService();
        studentService.displayReportCard(student);
        SC.close();


    }
}
