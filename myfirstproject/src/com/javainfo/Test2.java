package com.javainfo;

public class Test2 {
	
	static void Method1(){
		System.out.println("Method 1 Called");
		
	}
	static void Method2() {
		Method1();
		System.out.println("Method 2 Called");
		
	}
	
	void Method3() {
		Method2();
		System.out.println("Method 3 Called");
		
	}
	void Method4() {
		Method3();
		System.out.println("Method 4 Called");
		
	}
	
	static {
		System.out.println("Static Block Called");
		new Test2();
		Test2 t1=new Test2();
		t1.Method4();
	}

	
	
	public static void main(String[] args) {
		
		System.out.println("Method Ended");

		

	}

}
