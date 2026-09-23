package com.javainfo;

public class Employee1 {
	
	int empid;
	String empname;
	double empsal;
	void display() {
	    System.out.println("Employee ID: " + empid);
	    System.out.println("Employee Name: " + empname);
	    System.out.println("Employee Salary: " + empsal);
	}

	public static void main(String[] args) {
		Employee1 e2= new Employee1();
		e2.empid=101;
		e2.empname="uma";
		e2.empsal=500000;
		
		Employee1 e3= new Employee1();
		e3.empid=101;
		e3.empname="uma";
		e3.empsal=500000;
		
		Employee1 e4= new Employee1();
		e4.empid=101;
		e4.empname="uma";
		e4.empsal=500000;

		e2.display();
		e3.display();
		e4.display();

			
		}

	}


