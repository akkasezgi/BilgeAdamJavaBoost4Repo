package com.bilgeadam.boost.week03.lesson004;

import java.util.Scanner;
     

public class TheBakkal {
	private static final int MAX_ITEMS = 5;
	private Scanner input;
	private Item[] items;
	private int itemCount;

	public static void main(String[] args) {

		
		TheBakkal bakkal = new TheBakkal();
		bakkal.itemCount=0;
		bakkal.items = new Item[MAX_ITEMS];
		
		
		bakkal.menu();
		System.out.println("Bakkalimizi ziyaret ettiginiz icin tesekkurler");	
		
		
	}

	private void menu() {

		this.input = new Scanner(System.in);
		
		while(true) {
			System.out.println("==============");
			System.out.println("Kardesler Gida");
			System.out.println("==============\n");
			System.out.println("1.yeni urun girisi");
			System.out.println("2.urun listele");
			System.out.println("3.Alisveris yap");
			System.out.println("4.eve don");
			System.out.print("Lutfen seciminizi yapiniz : ");
			int selection = this.input.nextInt();
			input.nextLine();
			
			if (selection==4) {
			    break;
			}
			
			if (!this.prosessSelection(selection)) {
				System.err.println("Yanlis secim yaptiniz. lutfen tekrarlayiniz.");
				continue;
			}
				
		}	
		input.close();
		
	}

	
	private boolean prosessSelection(int selection) {
		boolean returnValue = true;
		
		switch (selection) {
		case 1:
			this.createGood();
			System.out.println("yeni urun girisi");
			break;
			
		case 2: 
			this.listGoods();
			
			break;
		case 3:
			this.shopping();
			break;
		default:
			returnValue = false;
			
		}
		
		return returnValue;
	}

	
	private void shopping() {
		boolean continueShopping = true;
		
		if (itemCount==0) {
			System.out.println("bakkal kapali");
			return;
		}
		    System.out.println("Alis Veris");
		    System.out.println("==========\n");
		    double totalPrice = 0.0;
		   do {
			
			   System.out.println("Almak istediginiz urunu belirtiniz: ");
			   String itemName = input.nextLine();
			   
			   if (itemName.equalsIgnoreCase("TAMAM")) {
				   System.out.println("Gule gule");
				   continueShopping = false;
			   }
			   
		  else {
			  Item item = itemExists(itemName);
			   if (item==null) {
				   System.out.println("istediginiz urun depoda bulunmamakta. Baska nasıl yardimci olabilirim?");
				   continue;
			   }   
			   System.out.println("kac" +item.getUnit()+" "+item.getName()+ "almak istiyorsunuz?");
			   double amount = input.nextDouble();
			   input.nextLine();
			   if (amount>item.getAmount()) {
				   System.out.println("istediginiz miktarda " + item.getName()+ "yok. En fazla "
			                                                 + item.getAmount() +" " + item.getUnit() + " alabilirsiniz." );
			   }
			   else {
				   double price = (amount * item.getUnitPrice())*(1+item.getVatRate()/100);
				   System.out.println(amount+ " " +item.getUnit()+ " icin KDV dahil toplam fiyat: " +price);
				   totalPrice+=price;
				   item.setAmount(item.getAmount()-(int)amount);
				   
			   }
			   }
		} while (continueShopping);
				
		   if (totalPrice==0.0) {
			   System.out.println("Alisveris yapmadan ayriliyorsunuz!");
			   
			   
		   }
	}

	private Item itemExists(String itemName) {
	      Item retVal = null;
	      for (int i=0;i<items.length;i++) {
	    	  if (items[i] != null) {
	    		  break;
	    	  }
	    	  if  (items[i].getName().equalsIgnoreCase(itemName) && items[i].getAmount()>0.0) {
	    		  retVal=items[i];
	    		  break;
	    	  }
	      }
		return retVal;
	}

	private void listGoods() {
		if (itemCount==0) {
			System.out.println("Depoda urun yok. ");
			return;
		}
		 for (int i=0; i<items.length;i++) {
			 if (items[i]==null) {
				 break;
			 }
			 System.out.println((i+1)+". ürün: "+items[i]);
		 }
		 
	}

	private void createGood() {
		
		if ( itemCount>=MAX_ITEMS) {
			System.err.println("depoda yer kalmadi");
			return;
		}
		
		System.out.println("yeni urun girisi");
		System.out.println("================\n");
		
		
		System.out.println("urun ismini giriniz: ");
		String itemName = input.nextLine();
		System.out.println("\nurun birimini giriniz: ");
		String unit = input.nextLine();
		System.out.println("\nurun birim fiyati giriniz: ");
		double unitPrice = input.nextDouble();
		input.nextLine();
		System.out.println("\nurun KDV oranini giriniz: ");
		int vat = input.nextInt();
		input.nextLine();
		System.out.println("\nurun miktarini giriniz: ");
		int amount = input.nextInt();
		input.nextLine();

		Item item = new Item();
		item.setName(itemName);
		item.setUnit(unit);
		item.setUnitPrice(unitPrice);
		item.setVatRate(vat);
		item.setAmount(amount);
		
		items[itemCount++]=item;
		 /*itemCount++;
		  * itemCount = itemCount +1 
		  * itemCount += 1
		  * 
		  */
		System.out.println(item);
		
		
		
		
		
	}

}
