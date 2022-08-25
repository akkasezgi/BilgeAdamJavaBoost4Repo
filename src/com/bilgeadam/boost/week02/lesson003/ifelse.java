package com.bilgeadam.boost.week02.lesson003;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		
		
		double a;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		a = scan.nextDouble();
		
		if (a>0) {
			System.out.println(a + " " + "is a positive. ");
			
		}else if (a==0) {
			System.out.println(a +" " + "is notr.");
		}
		else {
			System.out.println(a + " " + "is a negative. ");
		}
	}

}
