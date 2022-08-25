package com.bilgeadam.boost.week02.lesson005;

import java.util.Scanner;

public class Zodiac {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your birth month as a number: ");
		int month = sc.nextInt();
		
		System.out.print("Please enter your birth day as a number: ");
		int day = sc.nextInt();
		
	
			
			
			
			
		 if (month==1) {
			if (day<=21) {
			System.out.print("Your zodiac is: Oglak");
			}else if (day>21) {
			 
			 System.out.println("Your zodiac is: Kova");
		 }
		if (month ==2) {
			if (day<=19) {
			System.out.print("Your zodiac is: Kova");
			} else if (day>19) {
				
			System.out.print("Your zodiac is: Balik");
			}
		
		
			 
			 
			 
			 
			 
		 }		 
		 else {

		}
			
			
		
		
		
		
		
		
		

	}

}
