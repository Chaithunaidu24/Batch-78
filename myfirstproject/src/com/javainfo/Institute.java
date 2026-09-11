package com.javainfo;

public class Institute {

    static String TrainerName1;
    static String TrainerName2;

    int Employeeid;
    String EmployeeName;
    String EmployeeDesignation;

    public static void main(String[] args) {

        System.out.println("**Details of Employee1**");

        Institute t = new Institute();

        t.Employeeid = 101;
        t.EmployeeName = "chay";
        t.EmployeeDesignation = "JFS Developer";
        TrainerName1="Srikanth";

        System.out.println("Employee Id: " + t.Employeeid);
        System.out.println("Employee Name: " + t.EmployeeName);
        System.out.println("Employee Designation: " + t.EmployeeDesignation);
        System.out.println("Trainer Name: " + TrainerName1);
        
        
        System.out.println("**Details of Employee2**");

        Institute sam = new Institute();

        sam.Employeeid = 102;
        sam.EmployeeName = "mintuu";
        sam.EmployeeDesignation = "Devops Developer";

        System.out.println("Employee Id: " + sam.Employeeid);
        System.out.println("Employee Name: " + sam.EmployeeName);
        System.out.println("Employee Designation: " + sam.EmployeeDesignation);
        System.out.println("Trainer Name: " + TrainerName1);
        
        
        System.out.println("**Details of Employee3**");

        Institute b = new Institute();

        b.Employeeid = 103;
        b.EmployeeName = "Uma";
        b.EmployeeDesignation = "PFS";

        System.out.println("Employee Id: " + b.Employeeid);
        System.out.println("Employee Name: " + b.EmployeeName);
        System.out.println("Employee Designation: " + b.EmployeeDesignation);
        System.out.println("Trainer Name: " + TrainerName1);
        
        
        System.out.println("**Details of Employee4**");

        Institute c = new Institute();

        c.Employeeid = 104;
        c.EmployeeName = "Chaithu";
        c.EmployeeDesignation = "AI Developer";
        TrainerName2="vishwanath";

        System.out.println("Employee Id: " + c.Employeeid);
        System.out.println("Employee Name: " + c.EmployeeName);
        System.out.println("Employee Designation: " + c.EmployeeDesignation);
        System.out.println("Trainer Name: " + TrainerName2);
        
        
        
        System.out.println("**Details of Employee5**");

        Institute s = new Institute();

        s.Employeeid = 105;
        s.EmployeeName = "Sathwika";
        s.EmployeeDesignation = "SQL Developer";

        System.out.println("Employee Id: " + s.Employeeid);
        System.out.println("Employee Name: " + s.EmployeeName);
        System.out.println("Employee Designation: " + s.EmployeeDesignation);
        System.out.println("Trainer Name: " + TrainerName2);
        
        
    }
}