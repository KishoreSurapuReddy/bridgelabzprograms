package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class powerOfTwo {

	public static void main(String[] args) {
		int a1=1;
		int p=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num:");
		int num = sc.nextInt();
		System.out.println("Enter the power :");
		int n = sc.nextInt();
		/*
		 * for(int i=4;i>=1;i--) { p *=num;
		 * 
		 * }System.out.println(p);
		 */
		
		for(int j=1;j<=n;j++) {
			a1 = a1*num;
			System.out.println(a1);
		}

	}

}
