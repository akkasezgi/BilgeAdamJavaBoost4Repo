package week02.lesson003;

import  java.util.Scanner;

public class CurrencyCalculator {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Gunluk dolar kurunu giriniz: ");
		double rate = input.nextDouble();
		System.out.print("Bozdurmak istediginiz meblagi giriniz: ");
		int amount = input.nextInt();
		System.out.println("Dolar Kuru: " + rate + "bozdurulacak meblag" + amount);
		
		System.out.println(amount + "$==>" + amount*rate + "TL eder");
		
 

	}

}
