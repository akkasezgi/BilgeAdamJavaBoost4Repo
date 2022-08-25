package com.bilgeadam.boost.week03;

public class TypeCasting {

	public static void main(String[] args) {
	
		// widening
		
		int myInt = 9;
		double myDouble = myInt;
		
		System.out.println(myInt);
		System.out.println(myDouble);
		
		//narrowing
		
		double myDouble2 = 9.78d;
		int myInt2 = (int) myDouble2;
	
		System.out.println(myDouble2);
		System.out.println(myInt2);
		
		
		//////////////////////////
		
		int num = 10;
		System.out.println("The integer value is : " +num);
		String data = String.valueOf(num);
		System.out.println("The String value is: " +data);
//		int result = data +5;
		
		String data2 = "15";
		System.out.println("The string value is: " +data2);
		
		Integer num2 = Integer.parseInt(data2);
		int num3 = 15;
		
		
		
	}

}
