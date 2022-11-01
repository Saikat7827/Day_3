package com.bl;

public class ReverseArray {
	public static void main(String[] args) {

		int[] array = { 10, 20, 30, 40, 50, 60 };

		System.out.println("Elements in the given array : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println();

		System.out.println("Elements of array in  reverse  : ");
		for (int i = array.length - 1; i > 0; i--) {
			System.out.print(array[i] + " ");
		}
	}
}
