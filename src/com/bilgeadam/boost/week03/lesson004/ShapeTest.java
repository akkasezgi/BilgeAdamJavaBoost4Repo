package com.bilgeadam.boost.week03.lesson004;

import java.util.Scanner;

public class ShapeTest {
	private Scanner scan;
	private int deger;
	
	
	
	public static void main(String[] args) {
		ShapeTest shapeTest = new ShapeTest();
		shapeTest.readInput();		
		System.out.println("byeeeee.....");
	}

	private void readInput() {
		Scanner scan = new Scanner(System.in);
		int[] kenarlar = new int[4];
		
		while (true) {
			System.out.println("Lutfen 1. kenar uzunlugunu giriniz (0 ile sonlandir) : ");
			kenarlar[0] = scan.nextInt();
			if (kenarlar[0] == 0) {
				System.out.println("0 kenarli sekil olamaz");
				return;
			} else if (kenarlar[0] == -1) {
				return;
			}
			
			System.out.println("Lutfen 2. kenar uzunlugunu giriniz (0 ile sonlandir) : ");
			kenarlar[1] = scan.nextInt();
			if (kenarlar[1] == 0) {
				System.out.println("1 kenarli sekil olamaz");
				return;
			} else if (kenarlar[1] == -1) {
				return;
			}
			
			System.out.println("Lutfen 3. kenar uzunlugunu giriniz (0 ile sonlandir) : ");
			kenarlar[2] = scan.nextInt();
			if (kenarlar[2] == 0) {
				System.out.println("2 kenarli sekil olamaz");
				return;
			} else if (kenarlar[2] == -1) {
				return;
			}
			
			System.out.println("Lutfen 4. kenar uzunlugunu giriniz (0 ile sonlandir) : ");
			kenarlar[3] = scan.nextInt();
			if (kenarlar[3] == -1) {
				return;
			} else {
			 	int cevreHesabi = cevreHesapla(kenarlar);
			 	double alanHesabi = alanHesapla(kenarlar);
			 	System.out.println("Cevre : " + cevreHesabi);
			 	System.out.println("Alan : " + cevreHesabi);
			}
			
		}
	}
	
	private int cevreHesapla(int[] kenarlar) {
		int sum = 0;
		for (int i = 0; i < kenarlar.length; i++) {
			sum += kenarlar[i];
		}
		return sum;
	}
	
	private double alanHesapla(int[] kenarlar) {
		if (kenarlar.length == 3) {
			double u = cevreHesapla(kenarlar) / 2;
		  	return Math.sqrt(u * (u - kenarlar[0]) * (u - kenarlar[1]) * (u - kenarlar[2]));
		} else {
			
			return 0;
		}
	}
	
}
