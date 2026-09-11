package com.javainfo;

public class College {

    // Static variable
    static String collegeName;

    // Instance variables
    String studentName;
    int studentId;
    int studentMarks;

    public static void main(String[] args) {

        // Assign value to static variable
        collegeName = "ABC College";

        // Create object
        College s1 = new College();

        // Assign values to instance variables
        s1.studentName = "Uma Maheswari";
        s1.studentId = 101;
        s1.studentMarks = 85;

        // Accessing variables
        System.out.println("College Name: " + collegeName);
        System.out.println("Student Name: " + s1.studentName);
        System.out.println("Student ID: " + s1.studentId);
        System.out.println("Student Marks: " + s1.studentMarks);
        
        
    }
}