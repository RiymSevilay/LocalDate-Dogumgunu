package com.bilgeadam.week4.lecture002;

public class Question48_MethodIleCozum {

	/**
	 * Dizideki elemanlar arasındaki farkın en küçük olduğu değer nedir?
	 * 
	 * int[] array = { 1, 5, -4, 3 };
	 * 
	 */

	public static void main(String[] args) {

		int[] array = { 1, 5, -4, 3 };
		Math.abs(-4); // absolute value --> Mutlak değer
		System.out.println(enKucukFark(array));

	}

	public static int enKucukFark(int[] intArray) {
		int fark;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < intArray.length; i++) {
			for (int j = i + 1; j < intArray.length; j++) {

				fark = Math.abs(intArray[i] - intArray[j]);

				if (fark < min) {
					min = fark;
				}
			}
		}
		return min;

	}
}
