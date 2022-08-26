package com.bilgeadam.boost.week03.lesson004;

import java.util.Scanner;

public class ShapeTest {
	private Scanner scan;
	private int value;
	
	
	
	public static void main(String[] args) {
		ShapeTest shapeTest = new ShapeTest();
		shapeTest.readInput();		
		System.out.println("byeeeee.....");
	}

	private void readInput() {
		Scanner scan = new Scanner(System.in);
		int[] sides = new int[4];
		
		while (true) {
			System.out.println("Lutfen 1. kenar uzunlugunu giriniz (0 ile sonlandir) : ");
			sides[0] = scan.nextInt();
			if (sides[0] == 0) {
				System.out.println("0 kenarli sekil olamaz");
				return;
			} else if (sides[0] == -1) {
				return;
			}
			
			System.out.println("Lutfen 2. kenar uzunlugunu giriniz (0 ile sonlandir) : ");
			sides[1] = scan.nextInt();
			if (sides[1] == 0) {
				System.out.println("1 kenarli sekil olamaz");
				return;
			} else if (sides[1] == -1) {
				return;
			}
			
			System.out.println("Lutfen 3. kenar uzunlugunu giriniz (0 ile sonlandir) : ");
			sides[2] = scan.nextInt();
			if (sides[2] == 0) {
				System.out.println("2 kenarli sekil olamaz");
				return;
			} else if (sides[2] == -1) {
				return;
			}
			
			System.out.println("Lutfen 4. kenar uzunlugunu giriniz (0 ile sonlandir) : ");
			sides[3] = scan.nextInt();
			if (sides[3] == -1) {
				return;
			} else {
			
			 	int perimeter = perimeterTotal(sides);
			 	double area = areaTotal(sides);
			 	System.out.println("Cevre : " + perimeter);
			 	System.out.println("Alan : " + area);
			}
			
		
		}
		
	}
	
	

	private int perimeterTotal(int[] sides) {
		int sum = 0;
		for (int i = 0; i < sides.length; i++) {
			sum += sides[i];
		}
		return sum;
	}
	
	private double areaTotal(int[] sides) {
		if (sides[3]==0) {
			double u = perimeterTotal(sides) / 2;
		  	return Math.sqrt(u * (u - sides[0]) * (u - sides[1]) * (u - sides[2]));
		} else  {
			int shortSide = 0;
			int longSide = 0;
			for (int i = 0; i < sides.length; i++) {
				if (sides[i] >= sides[(i+1) % 4]) {
					longSide = sides[i];
				} else {
					shortSide = sides[i];
				}
			}
			System.out.println("KisaKenar : " + shortSide);
			System.out.println("UzunKenar : " + longSide);
			return shortSide * longSide;
		}
		
	}
	
	
}
