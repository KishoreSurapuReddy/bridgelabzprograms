package com.bridgelabz.algorithmsproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleSort {
	
	public static void sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("sorted elements :"+arr[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = {2,3,1,5,8,4,15,1,22,20,16};
		sort(arr);

}
}