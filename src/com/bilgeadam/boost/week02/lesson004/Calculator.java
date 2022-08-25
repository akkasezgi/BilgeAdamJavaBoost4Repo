package com.bilgeadam.boost.week02.lesson004;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a,b;
		double sonuc;
		String prosess;
		
		
		System.out.print("Please enter first number: ");
		a= scanner.nextInt();
		System.out.print("Please enter second number: ");
		b= scanner.nextInt();
		System.out.print("Please enter a math operator: ");
		char operator =  scanner.next().charAt(0);
				
		switch (operator) {
		case '+' :
			sonuc= a+b;
		System.out.println("Sonuc: "+ " "+ sonuc);
		   break;
		case '-' :
			sonuc= a-b;
		System.out.println("Sonuc: "+ " "+ sonuc);
		   break;
		case '*': 
			sonuc= a*b;
		System.out.println("Sonuc: "+ " "+ sonuc);
		   break;
		case '/' : 
			sonuc= a/b;
		System.out.println("Sonuc: "+ " "+ sonuc);
		   break;
		
		default: 
		System.out.print("Error! operator is not correct ");
		   
		
		}
		
		scanner.close();
		System.out.println("byeee.....");
	}

}
