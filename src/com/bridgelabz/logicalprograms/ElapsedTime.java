package com.bridgelabz.logicalprograms;

import java.util.concurrent.TimeUnit;

public class ElapsedTime {

	public static void main(String[] args) throws InterruptedException {
		
		long starttime = System.currentTimeMillis();
		
		TimeUnit.MILLISECONDS.sleep(5000);
		
		long endtime = System.currentTimeMillis();
		
		long elapsedtime =  endtime - starttime ; 
		  
		System.out.println("time duration :"+elapsedtime);
	}

}
