package com.bilgeadam.boost.week02.lesson004;

import java.util.Scanner;

public class Examples {

	
	public static void main(String[] args) {
		
		String name;
		int a;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen isminizi giriniz: ");
		name=scan.next();
		System.out.println("Lütfen yaşınızı giriniz: ");
		a= scan.nextInt();
		
		System.out.println("Merhaba " +a+ "yaşındaki "+ name );
		
	}

}
