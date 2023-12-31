package com.bilgeadam.week4.lecture002;

public class Question48 {

	public static void main(String[] args) {
		/**
		 * Dizideki elemanlar arasındaki farkın en küçük olduğu değer nedir?
		 * 
		 * int[] array = { 1, 5, -4, 3 };
		 * 
		 */

		int[] array = { 1, 5, -4, 3 };
		Math.abs(-4); // absolute value --> Mutlak değer
		int fark;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {

				fark = Math.abs(array[i] - array[j]);
				if (fark < min) {
					min = fark;
				}
			}
		}
		System.out.println(min);
	}

}
