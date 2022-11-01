package com.bl;

public class AccendingSort {
	public static void printArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

	public static void main(String[] args) {
		System.out.println("sort the elements of an array in ascending order : ");
		int array[] = { 5, 9, 3, 7, 2, 6, 1, 4, 8 };
		int temp;
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					// swap
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}

		}

		printArray(array);

	}
}
