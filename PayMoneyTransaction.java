package com.greatlearning.lab2;

import java.util.Scanner;
 

public class PayMoneyTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array");
		int size=sc.nextInt();
		
		int[] transaction =new int[size];
		System.out.println("Enter the transactions of the array");
		
		for(int i=0;i<size;i++) {
			transaction[i]=sc.nextInt();
		}
		
		System.out.println("Enter the number of targets to acheive");
		int numOfTargets=sc.nextInt();
		
		while (numOfTargets--!=0) {
						long sum=0;
			
						System.out.println("Enter the target");
						long target=sc.nextInt();
						
						
						for(int j=0;j<size;j++) {
							sum=sum+transaction[j];
							if (sum > target) {
								System.out.printf("Target acheived after %d transactions",j+1);
								System.out.println("");
								break;
							}
						}
						
						if (sum< target) {
							System.out.println("Target is not acheived");
						}
				
					}
	}
}	
