package com.javainfo;

public class Bankaccount {
	int account_number;
	String accountholdername;
	int balance;
	
	static int accountnogenerater=1234567;
	{
		
		accountnogenerater++ ;
		account_number=accountnogenerater;
		
		
	}
	
	public static void main(String[] args) {

		Bankaccount b1 = new Bankaccount();
		b1.accountholdername = "chay";
		b1.balance = 5000000;
		System.out.println("accountnumber"+b1.account_number);
		System.out.println("accountholdername"+b1.accountholdername);
		System.out.println("balance"+b1.balance);
				
        Bankaccount b2 = new Bankaccount();
		b2.accountholdername = "anu";
		b2.balance = 3000000;
		System.out.println("accountnumber"+b2.account_number);
		System.out.println("accountholdername"+b2.accountholdername);
		System.out.println("balance"+b2.balance);
				
		

	}

}
