package com.bridgelabz.algorithmsproblems;

public class InsertionSort {
	
	public static void insertion(String[] arr) {
		
		for(int i=1;i<arr.length-1;i++) {
			String key = arr[i];
			int j = i;
			while(j>0 && arr[j-1].compareTo(key)>1) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=key;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("sorted elements are :"+arr[i]);
		}
	}

	public static void main(String[] args) {
		String[] str = {"abc","kishore","ram","abhi","susi","sai","reddy"};
		insertion(str);
		

	}

}
