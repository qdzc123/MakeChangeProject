package project1;

import java.util.Scanner;
import java.lang.Math;
import java.lang.Math;
import java.lang.Math;

public class MakeChange {
	public static void main(String[] args) {
		 
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
			
		 
			 double twentyDollar = (int)(change / 20);
			 change = change % 20;
			 
			 double tenDollar = (int)(change / 10);
			 change = change % 10;
			 
			 double fiveDollar = (int)(change / 5);
			 change = change % 5;
			 
			 double oneDollar = (int)(change / 1);
			 change = change % 1;
			 
			 double quaters = (int)(change / 0.25);
			 change = change % 0.25;
			 
			 double dimes = (int)(change / 0.1);
			 change = change % 0.1;
			
			 double nickles = (int)(change / 0.05);
			 change = change % 0.05;
			 
			 double pennies = (change / 0.01);
			 change = change % 0.01;
					 
			 if((twentyDollar) != 0) {
				 System.out.print( Math.round(twentyDollar) + " of twenty dollar, ");
			 }
			 
			 if((tenDollar) != 0) {
				 System.out.print(Math.round(tenDollar) + " of ten dollar, ");
			 }
			 
			 if((fiveDollar) != 0) {
				 System.out.print(Math.round(fiveDollar) + " of five dollar, ");
			 }
			 
			 if((oneDollar) != 0) {
				 System.out.print(Math.round(oneDollar) + " of one dollar, ");
			 }
			 
			 if((quaters) != 0) {
				 System.out.print(Math.round(quaters) + " quaters, ");
			 }
			 
			 if((dimes) != 0) {
				 System.out.print(Math.round(dimes) + " dimes, ");
			 }
			 
			 if((nickles) != 0) {
				 System.out.print(Math.round(nickles) + " nickles, ");
			 }
			 
			 if((pennies) != 0) {
				 System.out.print(Math.round(pennies) + " pennies, ");
			 }
			 
		 }
		 sc.close();
	}
}
