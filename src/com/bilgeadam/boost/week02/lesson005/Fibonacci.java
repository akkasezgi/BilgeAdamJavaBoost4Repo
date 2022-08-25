package com.bilgeadam.boost.week02.lesson005;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int n1=1;
		int n2=1;
		int n3;
		int n;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		n = scanner.nextInt();
		
		System.out.print(n1 + " "+ n2);
		
		for (int i = 2; i <n; i++) {
			n3=n2+n1;
			System.out.print(" " + n3);
			n1=n2;
			n2=n3;
			
					
		}
		
	}

}
