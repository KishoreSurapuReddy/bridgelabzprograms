package com.bridgelabz.basicprograms;

public class StringReverse {
	
	public static String reverse(String str) {
		int size = str.length();
		String finalwords = "";
		String[] str1;
		str1 = str.split(" ");
		for(int i=0;i<=str1.length-1;i++) {
		    String reverse = str1[i];
		    String reverseword = "";
			for(int j=reverse.length()-1;j>=0;j--) {
				reverseword = reverseword+reverse.charAt(j);
			}
			finalwords = finalwords+reverseword+" ";
		}
		
		return finalwords;
		
	}

	public static void main(String[] args) {
		System.out.println(reverse("hello world how are you"));

	}

}
