package com.bl;

public class LargestAmongArray {
	public static void main(String[] args) {
		int array[] = { 4, 3, 5, 6, 7, 9, 8 };
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("Lagrgest Number : " + max);
	}
}
