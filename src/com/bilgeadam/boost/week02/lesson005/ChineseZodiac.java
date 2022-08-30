package com.bilgeadam.boost.week02.lesson005;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[] args) {
		
		
			
		
		
		Scanner sc = new Scanner(System.in);
		
	    int year;
		String answer=null;
		
		
		do {
			
		System.out.print("Please enter a birth year: ");
		year = sc.nextInt();
		int result = year % 12 ;
		

			
		
		switch (result) {
					
		case 0:
			System.out.print("MONKEY");
			break;
		case 1:
			System.out.print("ROOST");
		    break;
		case 2:
			System.out.print("DOG");
			break;
		case 3: 
			System.out.print("PIG");
			break;
		case 4: 
			System.out.print("MOUSE");
			break;
		case 5: 
			System.out.print("OX");
			break;
		case 6: 
			System.out.print("TIGER");
			break;
		case 7: 
			System.out.print("RABBIT");
			break;
		case 8: 
			System.out.print("DRAGON");
			break;
		case 9: 
			System.out.print("SNEAKE");
			break;
		case 10: 
			System.out.print("HORSE");
			break;
		case 11: 
			System.out.print("SHIP");
			break;
		

		default:System.out.print("ERROR!!!"); 
		
		System.out.println("Do you wanna try again? Y/N" );}
		}
		
			
		while
		
		
		
		
		
		
		
		
	
	
		
		}
	}
	


