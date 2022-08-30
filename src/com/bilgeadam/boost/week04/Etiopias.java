package com.bilgeadam.boost.week04;

import java.util.Scanner;

public class Etiopias {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);				
		System.out.println("enter a first number: ");
		int a = scan.nextInt();
		System.out.println("enter a second number: ");
		int b = scan.nextInt();
		int leftProsess;
		int rightProsess;
		int total = 0;
	
		System.out.println(a+ "*" +b );
		 total = b;
			
			
		 while (a>1) {
			 
			 leftProsess = a/2;
		     rightProsess = b*2;
	         
		if (leftProsess % 2 != 0 ) {
			System.out.println(+leftProsess+ "*" +rightProsess);		    		 
		      total = total + rightProsess;
		}
		     else{
			System.out.println(leftProsess+ "*" +rightProsess+"---"); 
		}
		
		a = leftProsess; 
		b = rightProsess;
		 continue;
		 
		 }
		
		 System.out.println(total);	
		
			
	}

}
