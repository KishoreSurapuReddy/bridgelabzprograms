package com.bridgelabz.basicprograms;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		double a1 = 0;
		int tails = 0;
		int heads = 0;
		Random rand = new Random();
	    Scanner sc = new Scanner(System.in);
	    System.out.println("How many times do you want to flip the coin :");
	    int flip = sc.nextInt();
	    for(int i=0;i<=flip-1;i++) {
	        a1 = rand.nextDouble();
	    	System.out.println(a1);
	    	if(a1<0.5) {
	    		tails++;
	    		
	    	}else {
	    		heads++;
	    		
	    	}
	    }
	    	System.out.println(tails);
	    	System.out.println(heads);
	      double p1 = tails/(double)flip *100;
	      double p2 = heads/(double)flip *100;
	      System.out.println(p1);
	      System.out.println(p2);
	}

}
