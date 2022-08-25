package com.bilgeadam.boost.week02.lesson004;

import java.util.Scanner;

public class Matriss {

	public static void main(String[] args) {
	
		int i,j;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a number: ");
     	int n = scan.nextInt();
		
		
		for (i=0; i<n; i++) {
			System.out.println("");
			


		
			for (j=0; j<i+1; j++)
			     System.out.print("*");
			    
		}		
		
		
		
		
		
		scan.close();
		System.out.println("");
		System.out.println("byeeeeee......");
		
	
		    
		    
//		for (i=0; i<n; i++) {
//			System.out.println("");
//
//
//		
//			for (j=0; j<n-i; j++)
//			     System.out.print("*");
//			     
//		}		
		
		
		
		

	}

}
