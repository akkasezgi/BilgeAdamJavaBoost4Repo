package week02.lesson002;

import java.util.Scanner;



public class Examples {

	public static void main(String[] args) {
				
		double deger;
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Lutfen sicakligi giriniz: ");
		deger = scan1.nextDouble();
		System.out.println((deger-32)/1.8 + " " + "celcius");
		
		
		
		
		double sayi;
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen urunun satis fiyatini giriniz: ");
		sayi = scan.nextDouble();
		
		double KDVsizFiyat;
		KDVsizFiyat = (sayi*100)/(100+18);
		
		double HamFiyat;
		HamFiyat = (KDVsizFiyat * 100)/(100+15);
		
		System.out.println("Urunun ham fiyati: " + " " + HamFiyat );
		
		
		
		
		

		
	}

}
