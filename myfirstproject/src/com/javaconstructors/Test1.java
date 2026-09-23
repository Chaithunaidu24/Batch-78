package com.javaconstructors;

public class Test1 {
	int id;
	String name;
	double sal;

	
	Test1(int id,String name,double sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
		
	}
	Test1(){
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Test1 t1 = new Test1(24,"chay",200000);
		t1.test1info();
		Test1 t2 = new Test1();


		System.out.println("main method ended");
	}
	
	void test1info(){
	
	System.out.println("id:"+id);
	System.out.println("name:"+name);
	System.out.println("sal:"+sal);

	}
}