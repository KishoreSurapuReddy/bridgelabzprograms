package com.bridgelabz.algorithmsproblems;

import java.util.Scanner;

public class AnagramDetection {

	public static void find(String str, String str2) {
		int count=0;
		if (str.length() == str2.length()) {
			for (int i = 0; i < str.length(); i++) {
				//int count = 0;
				for (int j = 0; j < str2.length(); j++) {
					if (str.charAt(i)==str2.charAt(j)) {
						
						count++;

					}
				}
			}
			if(count == str.length()) {
				System.out.println("given string was anagram");
			}else {
				System.out.println("given string was not anagram!");
			}
		}
		else {
			System.out.println("length should be equal!");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the  two strings :");
		String str = sc.next();
		String str2 = sc.next();
		find(str, str2);

	}

}
