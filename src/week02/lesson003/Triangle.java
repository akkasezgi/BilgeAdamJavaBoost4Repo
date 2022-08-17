package week02.lesson003;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {

		double x,y,z,a,b,c;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen ucgenin verilen birinci acisini giriniz: ");
		x = scan.nextDouble();
		Scanner scan2 = new Scanner(System.in);
		System.out.print("Lutfen ucgenin birinci aci karsisindaki kenarini giriniz: ");
		a = scan.nextDouble();
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Lutfen ucgenin verilen ikinci acisini giriniz: ");
		y = scan.nextDouble();
		Scanner scan3 = new Scanner(System.in);
		System.out.print("Lutfen ucgenin ikinci aci karsisindaki kenarini giriniz: ");
		b = scan.nextDouble();
		
		z = 180 - (x+y);
	
		double zRad = Math.toRadians(c);
		
		
//		
//		Math.pow(k 2)+ (l*l) - (2*a*b(Math.cos(cRad)));
//		Math.pow(temp, 0,5)
//		
//		m = Math.sqrt(temp);
//

	}

}
