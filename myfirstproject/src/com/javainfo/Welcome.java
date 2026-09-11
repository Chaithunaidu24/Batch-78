package com.javainfo;

public class Welcome {
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main method started");
		System.out.println("Good morning...!Have a nice day..!!");
		
		
        Class.forName("java.lang.System");
	    Class.forName("java.lang.String");
		Class.forName("com.javainfo.Welcome");
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("main method ended");
		

	}

}