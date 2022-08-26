package com.bilgeadam.boost.week03.lesson004;

import java.util.Scanner;

public class Atm {

	private  Scanner scan;
	public static void main(String[] args) {

		Atm atm = new Atm();
		atm.scan = new Scanner(System.in);
		System.out.println();
		atm.menu();
		
	}
	

	private void userProsess() {
		
		String userName;
		int password;
		
		this.scan = new Scanner(System.in);
		System.out.println("Please enter your username");
		userName = this.scan.next();
		scan.next();
		System.out.println("Please enter your password");
		password = this.scan.nextInt();
		
		
		
		
	}

	public void menu() {
		
		 System.out.println("==========================");
		 System.out.println("Welcome to Ezgi's Bank ATM");
		 System.out.println("==========================");
		
		 System.out.println("1.withdraw money");
		 System.out.println("2.to deposit money");
		 System.out.println("3.credit cart transactions");
		 System.out.println("4.other");
		 System.out.println("5.exit");
		 
		 System.out.println("Please enter your selection");
		 int selection = this.scan.nextInt();
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
