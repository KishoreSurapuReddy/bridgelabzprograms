package com.bridgelabz.functionalprograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimentionArray {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of a array :");
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int[][] arr = new int[a1][a2];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println("enter the elements into array :");
				arr[i][j]=sc.nextInt();
			
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println("elements are :"+arr[i][j]);
			}
		}
		
	}

}
