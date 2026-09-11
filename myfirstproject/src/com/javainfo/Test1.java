package com.javainfo;

public class Test1 {
		
			
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

			
			public static void main(String[] args) {
				Test1 m1 = new Test1();
				m1.Method4();
				

			}

		

	}


