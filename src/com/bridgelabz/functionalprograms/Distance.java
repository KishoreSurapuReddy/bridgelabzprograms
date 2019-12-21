package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Distance {
	
	public static double distance(double x,double y) {
		
		double res = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		return res;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of x and y :");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		System.out.println("distance from ("+x+","+y+") to (0,0) " +distance(x, y));

	}

}
