package com.bl;

public class DuplicateArray {
	public static void main(String[] args) {
		
		int array[] = { 5, 3, 4, 8, 3, 2, 5, 4, 9, 6, 1 };
		
		System.out.println("duplicate elements are : ");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if ((array[i] == array[j]) && (i != j)) {
					System.out.println(array[i] + " ");

				}
			}
		}
	}
}
