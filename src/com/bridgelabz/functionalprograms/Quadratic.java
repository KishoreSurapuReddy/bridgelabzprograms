package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the elements of a , b , c :");
		double a= sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double delta = b * b - 4.0* a * c;
		
		if(delta>0) {
			double root1 =  (-b + Math.sqrt(delta))/(2*a);
			double root2 =  (-b-Math.sqrt(delta)/(2*a));
			System.out.println("the roots are : "+root1+"and "+root2 );
			
		}else if(delta==0) {
			double root1 = -b/(2*a);
			System.out.println("the roots are :"+root1);
			
		}else {
			System.out.println("there were no roots ");
		}

	}

}
