package com.bridgelabz.logicalprograms;

import java.util.Random;

public class Gambler {
	
	public static void calculate(int min,int max) {
		int count=0;
		int i;
		int temp = 0;
		int stack = 10;
		int goal = 16;
		Random rand = new Random();
		for( i=1;i<=20;i++) {
			int res = rand.nextInt(max-min);
			//System.out.println(res);
			if(res==0) {
				System.out.println("player has loss everything!..");
			}else if(res>=16) {
				count++;
			}else if(res<16) {
				temp++;
			}
		}
		double win = count/(double)i*100;
		double loss = temp/(double)i*100;
		System.out.println("win % is: "+win);
		System.out.println("loss % is: "+loss);
	}

	public static void main(String[] args) {
		calculate(1, 20);
	}

}
