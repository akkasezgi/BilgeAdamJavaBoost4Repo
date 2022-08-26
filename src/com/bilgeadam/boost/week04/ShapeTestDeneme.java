package com.bilgeadam.boost.week04;

import java.util.Scanner;

public class ShapeTestDeneme {
	private Scanner scan;

	public static void main(String[] args) {

		ShapeTestDeneme shapeTest = new ShapeTestDeneme();
		shapeTest.readInput();
		System.out.println("byeeee....."); 
		
		int value;
	
	}

	private  void readInput() {
		
		this.scan = new Scanner(System.in);
		
		while(true) {
		System.out.println("Lutfen hesaplamak istediginiz seklin(en fazla 4 kenar) kenar uzunluklarini giriniz(-1 ile cikis): ");
		System.out.print("Lutfen 1.kenar uzunlugunu giriniz: ");
		int side1 = scan.nextInt();
		System.out.print("Lutfen 2.kenar uzunlugunu giriniz: ");
		int side2 = scan.nextInt();
		System.out.print("Lutfen 3.kenar uzunlugunu giriniz: ");
		int side3 = scan.nextInt();
		System.out.print("Lutfen 4.kenar uzunlugunu giriniz: ");
		int side4 = scan.nextInt();
	
		int selection = scan.nextInt();
		
		if ( side1 == -1 )  {
			System.out.println("Lutfen sayi girdiginizden emin olunuz.");
			break;
		}
				
			
	    }

		scan.close();
		
		
	}
	
	
	private boolean prosesSelection(int selection) {
		
		boolean returnValue = true;
		
			
		
		return false;
	}

	
	private void situation() {
	
		
	}

}
