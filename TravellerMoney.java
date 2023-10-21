package com.greatlearning.lab2;

import java.util.Scanner;

public class TravellerMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int size=sc.nextInt();
		
		int[] currency=new int[size];
		System.out.println("Enter the currency denominations value");
		for(int i=0;i<size;i++) {
			currency[i]=sc.nextInt();
		}
		
		System.out.println("Enter the Amount");
		int amount=sc.nextInt();
		
		// Sort the array in descending order
		
		for(int i=0;i<currency.length;i++) {
			for (int j=i+1;j<currency.length;j++) {
				if (currency[i]<currency[j]) {
					int temp=currency[i];
					currency[i]=currency[j];
					currency[j]=temp;
							
				}
			}
			
		}
		
		/* Print the Array
		for(int i=0;i<currency.length;i++) {
			System.out.print(currency[i]+" ");
		}
		*/
		System.out.println(" ");
		
		int[] noteCounter=new int[size];
		
		for(int i=0;i<currency.length;i++) {
			if (amount>=currency[i]) {
				noteCounter[i]=amount/currency[i];
				amount=amount%currency[i];
			}
		}
		
		for(int i=0;i<noteCounter.length;i++) {
			if(noteCounter[i]!=0) {
			System.out.println(currency[i]+":"+noteCounter[i]);
			}
		}
		
		
		
		
		
	}

}
