package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class SumOfInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in );
		System.out.println("enter the size of array :");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the elements :");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					int sum = arr[i]+arr[j]+arr[k];
					//System.out.println("sum is:"+sum);
					if(sum==0) {
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					}
				}
			}
		}
	}

}
