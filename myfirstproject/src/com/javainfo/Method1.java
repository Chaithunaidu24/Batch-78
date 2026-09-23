package com.javainfo;

public class Method1 {


	public static void main(String[] args) {

		
		System.out.println("main method called");
		
		Method1 m1= new Method1();
		m1.addition(10, 20);

		System.out.println("main method ended ");
	}

	 void addition(int a, int b) {
		 int c=a+b;
		System.out.println("addition method called ");// sum
		System.out.println(c);
		subtraction(100,c);
	}

	 void subtraction(int a, int b) {
		 int d=a-b;
		System.out.println("subtraction method called ");// Difference
		System.out.println(d);
		multiplication(20,d);
	}

	 void multiplication(int a, int b) {
		 int e=a*b;
		System.out.println("multiplication method called ");// Product
		System.out.println(e);
		division(500,e);
	
		
	}

	 void division(int a, int b) {
		 int f=a/b;
		System.out.println("Division method called ");// Quotient
		System.out.println(f);//19
	}
		
}
	


