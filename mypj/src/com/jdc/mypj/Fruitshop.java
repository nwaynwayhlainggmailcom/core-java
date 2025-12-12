package com.jdc.mypj;
import java.util.Scanner;


public class Fruitshop {
	
	public static Scanner sc = new Scanner(System.in);
    //static String name = "";
    
	//static int amount = 0 ;
	static int i = 0;
	static String name[] = {"Apple", "Banana", "Orange", "Mango"};
	static int stock[] = {30,30,30,30} ;
	static String price[] = new String[10];
	static String[] ordername = new String[10]; 
	static int[] amount = new int[10];  
	
	
	public static void main(String[] args) {
	 		
		    Fruitshop  buy = new Fruitshop();
		    //Fruitshop  check = new Fruitshop();
		    buy.buyFruit();
		    Fruitshop.price(name,amount);
		   checkstock();
		
		
	}


public static void buyFruit() {
	
	String ask = "";
	
	boolean b = true;
	
	
	while(b){
		System.out.println("+--------------------------+");
		System.out.println("|Current Stock Fruits      |");
		System.out.println("+--------------------------+");
		System.out.println("|Fruits  | Price  |  Stock |");
		System.out.println("|--------------------------|");
		System.out.println("| Apple  | 2000   |   30   |");
		System.out.println("| Orange | 2000   |   30   |");
		System.out.println("| Banana | 2000   |   30   |");
		System.out.println("| Mango  | 2000   |   30   |");
		System.out.println("+--------------------------+");
		
		System.out.print("\nType what fruit you want ::");
		name[i] = sc.nextLine();
		
		
		System.out.print("\nType your order amount (maximum 30) ::");
		
		amount[i] = Integer.parseInt(sc.nextLine());
		
		i++;
		checkstock();

		
		
		System.out.print("\nDo you want another fruits: Y/N :" );
		ask = new Scanner(System.in).nextLine();
		if(ask .equals ("Y")) {
			b = true;

		}else{
			System.out.println("\nConfirm your order ::");
			for(int  j= 0 ; j<i ; j++) {
				
				System.out.println("\nYour order is :: " +name[j] + "-" + amount[j]);
				
			}
			int payment = price(name,amount);
			System.out.print("\nYour payment  :: " );
			System.out.println("Total - " + payment);
			b = false;
			
//			
			
		}
		
	}
	
}

public static int price(String[] name,int[] amount) {
	int totalprice = 0 ;
	int unitprice = 2000;
	
	
	
	for(int j=0 ; j<i ;j++) {
		if(name[j]!=null) {
			if (name[j].equals("Apple") ||
		            name[j].equals("Banana") ||
		            name[j].equals("Orange") ||
		            name[j].equals("Mango")) {
		             totalprice += unitprice * amount[j];
             
		        }else {
		        	System.out.println("Sorry, we don't have that fruit.");
		        	
		        }           	
		}
			
	}
	return totalprice;
	     
}
public static void checkstock() {
	
	for(int i=0 ; i<ordername.length ; i++) {
		if(ordername[i] == null) continue;
		for(int j=0 ; j<name.length ; j++) {
			if (name[j] !=null && name[j].equals(ordername[i])) {
				if(stock[j] >= amount[i]) {
					stock[j] -= amount[i];
					System.out.println("Stock updated: " + name[j] + " = " + stock[j]);
				}else {
					System.out.println("Out of stock !!" + name[j]);
					
				}
				break;
			}
		}//end inner if
	}
	
}

}




