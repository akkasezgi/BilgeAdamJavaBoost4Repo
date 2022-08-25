package com.bilgeadam.boost.week02.lesson004;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	
		int i,a,count=0; 
		double result;
		a=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		a = scanner.nextInt();
	
	if (a<2) { 
		System.out.print(a + " " + "a not PrimeNumber");
	} else {
		for (i=2; i<a; i++);
		result = a % i;
		     if (result==0) {
		    	 count++;
		    	
		     }if(count==0) {
			        System.out.print(a + " " + "a PrimeNumber");
		}else {
		
			System.out.print(a + " " + "a not PrimeNumber");
		}		
	}
		
	
	
			
		scanner.close();
		
		System.out.println("byeeee....");

	}

}
