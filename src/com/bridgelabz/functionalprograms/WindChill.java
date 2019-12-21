package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter the tempareture  and wind speed :");
		double t = sc.nextDouble();
		double v = sc.nextDouble();
		
		if(t<=50 && v>120 || v<3) {
			System.out.println("enter the correct values i.e t<50 and 120>v>3");
		}else {
			 double a = 35.74 + (0.6215*t);
			 double b = ((0.4275*t)-35.75)*Math.pow(v, 0.16);
			 double w = a + b;
			 System.out.println("the effective temareture was :"+w);
		}

	}

}
