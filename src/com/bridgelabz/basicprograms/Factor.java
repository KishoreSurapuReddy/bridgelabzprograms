package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class Factor {
	
	public static void primeFactor(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				//System.out.println(i);
				if(isPrime(i)){
					System.out.println(i);
				}
			}
		}
    	
    }
	public static boolean isPrime(int n) {
		int count=0;
		for(int j=1;j<=n;j++) {
			if(n%j==0) {
				count++;
			}
			
		}
		if(count==2) {
			return true;
		}
		return false;	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		primeFactor(n);
	   

	}

}
