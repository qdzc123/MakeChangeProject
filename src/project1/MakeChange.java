package project1;

import java.util.Scanner;
import java.lang.Math;

public class MakeChange {
	public static void main(String[] args) {
		 
		 double amountOfBill;
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the price");
		 double price = sc.nextDouble();
		 
		 System.out.println("Enter the amount you recieve");
		 double money = sc.nextDouble();
		 
		 double change = money - price;
		 
		 if(price > money) {
			 System.out.println("ERROR");
		 }
		 
		 else if(price == money) {
			 System.out.println("No change!");
		 }
		 
		 else if(price < money) {
			 
			amountOfBill = (int)(change / 20);
			change = change % 20;
			System.out.println(Math.round(amountOfBill) + " of $20 are change");
			
			
			if(change % 20 != 0) {
				amountOfBill = (int)(change / 10);
				change = change % 10;
				System.out.println(Math.round(amountOfBill) + " of $10 are change");
			
				if(change % 10 != 0) {
					amountOfBill = (int)(change / 5);
					change = change % 5;
					System.out.println(Math.round(amountOfBill) + " of $5 are change");
					
					if(change % 5 != 0) {
						amountOfBill = (int)(change / 1);
						change = change % 1;
						System.out.println(Math.round(amountOfBill) + " of $1 are change");
						
						if(change % 1 != 0) {
							amountOfBill = (int)(change / 0.25);
							change = change % 0.25;
							System.out.println(Math.round(amountOfBill) + " of 25c are change");
							
							if(change % 0.25 != 0) {
								amountOfBill = (int)(change / 0.10);
								change = change % 0.10;
								System.out.println(Math.round(amountOfBill) + " of 10c are change");
								
								if(change % 0.10 != 0) {
									amountOfBill = (int)(change / 0.05);
									change = change % 0.05;
									System.out.println(Math.round(amountOfBill) + " of 5c are change");
									
									if(change % 0.05 != 0) {
										amountOfBill = (change / 0.01);
										change = change % 0.01;
										System.out.println(Math.round(amountOfBill) + " of 1c are change");
										
									}
								}
							}
						}
					}
				}
			}
		 }
		 sc.close();
	}
}
