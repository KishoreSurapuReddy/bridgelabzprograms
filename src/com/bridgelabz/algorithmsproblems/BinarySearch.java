package com.bridgelabz.algorithmsproblems;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	
	public static void check(String[] str, String toCheck) {
		Arrays.sort(str);
		int find = Arrays.binarySearch(str, toCheck);
		boolean res = find > 0 ? true : false;
		System.out.println(toCheck+" was present on list is :"+res);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the words into the array :");
		String[] str = new String[5] ;
		for(int i = 0 ; i < str.length ; i++) {
			str[i] = sc.next();
		}
		System.out.println("enter the word tocheck in list :");
		String toCheck = sc.next();
		System.out.println("words in list are :"+Arrays.toString(str));
		check(str, toCheck);
	
	}

}
