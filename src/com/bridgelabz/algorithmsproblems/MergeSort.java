package com.bridgelabz.algorithmsproblems;

public class MergeSort {
	
	private void sort(int[] arr, int l, int r) {
		if(l < r) {
		int m = (l+r)/2;
		
		sort(arr,l,m);
		sort(arr,m+1,r);
		
		merge(arr,l,m,r);
		}
	}

	private void merge(int[] arr, int l, int m, int r) {
		int n1 = m-l+1;
		int n2 = r-m;
		
		int L[] =  new int[n1];
		int R[] = new int[n2];
		
		for(int i=0;i<n1;i++) {
			L[i] = arr[l+i];
		}
		for(int j=0;j<n2;j++) {
			R[j] = arr[m+1+j];
		}
		int i = 0;
		int j = 0;
		int k = l;
		while(i < n1 && j < n2) {
			if(L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while(j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
		
	}

	public static void main(String[] args) {
		int[] arr = {5,2,16,25,42,35,12,3,6,18};
		int l =0;
		System.out.print("array elements are :");
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		MergeSort ms = new MergeSort();
		ms.sort(arr, l,arr.length-1);
		System.out.print("after sorting :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
}
