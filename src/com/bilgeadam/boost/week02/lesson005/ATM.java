package com.bilgeadam.boost.week02.lesson005;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
	
		
		String userName = "user";
		String password = "123";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your username : ");
		userName = sc.next();
		System.out.println("Please enter your password : ");
		password = sc.next();
		
		
		if (userName.equalsIgnoreCase("user") && password.equalsIgnoreCase("123")) {
			
			System.out.println("1.to deposit money");
			System.out.println("2.withdraw money");
			System.out.println("3.money balance inquiry");
			System.out.println("4.exit");
			
			int answer = sc.nextInt();			
			int key=0;
			
			switch (key) {
			case 1:
				System.out.println("to deposit money");
				break;
			case 2:
				System.out.println("withdraw money");
				break;
			case 3:
				System.out.println("money balance inquiry");
				break;
			case 4:
				System.out.println("exit");
				break;

			default:
				break;
			}
			
		}else {
			System.err.println("Wrong username or password. Please try again!");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
