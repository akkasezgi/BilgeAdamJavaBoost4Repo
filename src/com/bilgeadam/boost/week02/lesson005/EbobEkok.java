package com.bilgeadam.boost.week02.lesson005;

import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int temp;
		int hcf=1;
		int lcm=1;
		System.out.print("Please enter first number: ");
		int a = sc.nextInt();
		System.out.print("Please enter second number: ");
		int b = sc.nextInt();
		sc.close();
		
		if (a>b){
			temp = b;
		 
		}else {
			temp = a;
		}
	
	     while (temp>0) {
	    	if(a%temp==0 && b%temp==0) {
	    		 hcf = temp;
	    		break;
	    	} 	
	    	temp--;
	    }
	
	    temp=1;
	     while(temp<=a*b) {
	    	 temp++;
	    	 if (temp%a==0 && temp%b==0) {
	    		  lcm = temp;
	    	 }
	     }
	     
	     System.out.println(a+ " "+b+" "+"lcm: "+ lcm);
	     System.out.println(a+ " "+b+" "+"hcf: "+ hcf);
	     
	     
	     
	
	}

}
