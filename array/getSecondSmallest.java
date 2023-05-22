package com.array;

import java.util.Arrays;

public class getSecondSmallest {

	public static void main(String[] args) {
		//Get the second smallest element in the array 
		int arr[]= {7,8,9,4};
		Arrays.sort(arr);
		System.out.println("New Array" +Arrays.toString(arr));
		// Finding Second Smallest :
		System.out.println("Second smallest"+arr[1]);
		System.out.println("smallest "+arr[0]);
		}

}
