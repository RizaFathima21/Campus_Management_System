package com.campus.model;

public class ScholarshipStudent extends Student {
    private double scholarshipPercentage;
    public ScholarshipStudent(int studentid, String studentname, int age, String department, int[] marks, double scholarshipPercentage) {
        super(studentid, studentname, age, department, marks);
        this.scholarshipPercentage = scholarshipPercentage;
    }
    

    @Override
    public void studentType() {
        System.out.println("Scholarship Student");
    }

    @Override
    public void displayStudentInfo() {
        super.displayStudentInfo();
        System.out.println("Scholarship Percentage: " + scholarshipPercentage);
    }

    @Override
    public void displayStudentInfo(boolean showMarks) {
        super.displayStudentInfo(showMarks);
        System.out.println("Scholarship Percentage: " + scholarshipPercentage);
    }
}


