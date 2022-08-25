package com.bilgeadam.boost.week02.lesson003;

import java.util.Scanner;

public class Polygon {

	public static void main(String[] args) {
	
		
		int n;
		double s;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter polygon edge: ");
		n = scan.nextInt();
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Please enter polygon edge length: ");
		s = scan1.nextDouble();
		
		double alan;
		final double PI=3.14;
	
		
		alan = (n*(Math.pow(s, 2)))/(4*(Math.tan(PI/n)));

		
		System.out.println(alan);
		
	}

}
