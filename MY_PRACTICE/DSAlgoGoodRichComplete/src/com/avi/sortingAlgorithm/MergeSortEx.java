package com.avi.sortingAlgorithm;

import java.util.Scanner;

public class MergeSortEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int [] arr = new int[x];
		for (int i = 0; i<x; i++){
			arr[i]=sc.nextInt();  //20, 35, -15, 7, 55, 1, -22
		}
		
		
		
		
		for (int i = 0; i<x; i++){
			System.out.println(arr[i]+"\t");
		}

	}
	
	public static void mergeSort (int [] arr, int start, int end){
		
		if(end-start <2){
			return;
		}
		int mid = start+end/2;
		mergeSort(arr, start, mid);
		mergeSort(arr, mid, end);
		merge(arr, start, mid, end);
	}
	public static void merge(int [] arr, int start, int mid, int end){
		
		if(arr[mid-1] <= arr[mid]){
			return;
		}
		
		int i=start;
		int j=mid;
		int tempInx = 0;
		int [] tempArr = new int [end-start];
		
	}

}
