package com.bilgeadam.boost.week02.lesson005;

import java.util.Scanner;

public class RegisterLogin {

	public static void main(String[] args) {
		String userName="";
		String password="";
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter 1 as a signup, Please enter 2 as a signin");
			int msg = sc.nextInt();
			sc.nextLine();
			

			
			switch (msg) {
			case 1:
//				Scanner input = new Scanner(System.in);
				System.out.println("Welcome to register page!!! Please enter a username: ");
				userName = sc.nextLine();
				System.out.println("Please enter a password: ");
				password = sc.nextLine();
				System.out.println("Your account is created. ");
				break;
			case 2:
//				Scanner scan = new Scanner(System.in);
				System.out.println("Please enter your username: ");
				String userNameEntry = sc.nextLine();
				System.out.println("Please enter your password: ");
				String passwordEntry = sc.nextLine();
				
				
				if (userNameEntry.equals(userName)  &&  passwordEntry.equals(password)) {
					System.out.println("Welcome!!!");
				} else {
					System.out.println("Wrong username or password!!!");
				}
				
				break;

			default:
				break;
			} 
			
		} while (true);
		
		
		
		
		
		
		
		
		
	}

}
