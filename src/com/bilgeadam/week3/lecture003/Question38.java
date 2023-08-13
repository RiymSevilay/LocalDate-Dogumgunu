package com.bilgeadam.week3.lecture003;

public class Question38 {

	public static void main(String[] args) {

		/**
		 * int nums[] = { 1, 13, 13, 13, 5, 1 }; dizide 13 sayısına denk gelene kadar
		 * devam edelim. 13 sayısı bulunduktan sonra ondan bir sonraki gelen sayı 13
		 * değil ise. 13'den sonra gelen sayıyı toplama ekleyelim
		 * 
		 */

		int nums[] = { 1, 13, 13, 13, 5, 1 };
		int toplam = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 13 && nums[i + 1] != 13) {
				toplam += nums[i + 1];

			}
		}

		System.out.println("toplam : " + toplam);

	}

}
