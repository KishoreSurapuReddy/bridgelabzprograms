package com.bridgelabz.logicalprograms;

import java.util.Random;

public class RandomNumber {
	
	public static int generateRandomNum(int min, int max) {
	    Random r = new Random();
	    return r.nextInt((max - min));
	}

	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
		
		System.out.println(generateRandomNum(10000, 99999));
		}

	}

}
