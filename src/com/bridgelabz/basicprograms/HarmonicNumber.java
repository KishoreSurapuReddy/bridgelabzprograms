package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		int a=1;
		double sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N number: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			double res = a/i;
			System.out.println(res);
			sum+=res;
			//System.out.println(sum);
		}
		System.out.println(sum);

	}

}
