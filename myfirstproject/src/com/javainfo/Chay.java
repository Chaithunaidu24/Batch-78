package com.javainfo;

public class Chay {
	static String name;
	int age;
	String college;
	
	void display () {
		name = "chaithu";
		age = 20;
		college = "tkr";
		
	System.out.println("name :"+name);
	System.out.println("age:"+age);
	System.out.println("college:"+college);
		
				
	}

	public static void main(String[] args) {
	Chay c1 = new Chay();
     c1.display ();
	}

}
