package com.bilgeadam.boost.week02.lesson004;
import java.util.Scanner;

public class AgeEvaluator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your birth: ");
		int age;
		age = sc.nextInt();
		
		if (age < 18) {
			System.out.println("Child");			
		}			
		
		if (age >= 18 && age<30) { 
			System.out.println("Youth");
		}
		if (age >=30 && age <50) {
			System.out.println("Middle aged");
		}
			
		else {
			if (age >= 50 ) {
			System.out.println("Old");
		}
		}
		sc.close();

	}

}
