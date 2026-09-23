package com.javaconstructors;

public class Student {
	
	int sid=1001;
	String name="chaithu";
	
	Student(){
		System.out.println("constructor called");
	}

	public static void main(String[] args) {
		
		System.out.println("main method called");
		Student s1 = new Student();
		s1.studentinfo();
		
		
		System.out.println("main method ended");

	}
	void studentinfo() {
		System.out.println("Student id:"+sid);
		System.out.println("student name"+name);
	}

}
