package com.bilgeadam.boost.week02.lesson003;
import java.util.Scanner;

public class BMIHesaplama {

	public static void main(String[] args) {
		
		double height,weight,bmi;
		String gender;
				
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter your weight: ");
		weight = scan.nextDouble();
			
		System.out.print("Please enter your length: ");
		height = scan.nextDouble();
		
		System.out.print("Please enter (W/M) your gender: ");
		gender = scan.next();
		
		
		
		
		bmı = (weight * 10000) / Math.pow(height, 2);
						
		
		
		if (gender.equalsIgnoreCase("W") ) {
			 if (bmi < 19) {
				 System.out.print("You are THIN ");
				 else if (bmi<24) {
					 System.out.print("You are NORMAL ");
				 }else if (bmi<30) {
					 System.out.print("You are FAT ");
				 }else {
					 System.out.print("You are OBESE ");
				 }
			 }

			
		 else if (gender.equalsIgnoreCase("M")) {
			 if (bmi < 20) {
				 System.out.print("You are THIN ")
				 else if (bmi<25) {
					 System.out.print("You are NORMAL ");
				 }else if (bmi<30) {
					 System.out.print("You are FAT ");
				 }else {
					 System.out.print("You are OBESE ");
		 }
			
		
		
		
		scan.close();
		System.out.println("bye.....");
			
	}

		 }
}	