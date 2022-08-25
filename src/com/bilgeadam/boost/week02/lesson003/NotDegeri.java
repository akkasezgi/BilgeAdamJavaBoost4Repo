package com.bilgeadam.boost.week02.lesson003;
import java.util.Scanner;

public class NotDegeri {

	public static void main(String[] args) {
		
		int vize1,vize2,fin;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your visa1 point: ");
		vize1 = sc.nextInt();
	
		System.out.print("Please enter your visa2 point: ");
		vize2 = sc.nextInt();
		
		System.out.print("Please enter your final point: ");
		fin = sc.nextInt();
		
		double vizeOrt,total;
		vizeOrt = vize1 + vize2;
		total = (vizeOrt * 0.4)+(fin * 0.6);
		
		if (total<=49) {
			System.out.println("FF");
		}
		else if (total >=50 && total<=59) {
			System.out.println("DD");
		}
		else if (total >=60 && total<=69) {
			System.out.println("CC");
		}
		else if (total>=70 && total<=79) {
			System.out.println("BB");
		}
		else  {
			System.out.println("AA");
		}
		
		
		
		sc.close();
	}

}
