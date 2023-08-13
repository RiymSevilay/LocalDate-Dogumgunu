package com.bilgeadam.week4.lecture003;

public class Question50 {
	/**
	 * 
	 * int[] dizi = { 1, 5, 1, 9, 5, 1, 9, 8, 0, 0 };
	 * 
	 * Yukarıdaki dizide tekrar eden sayıları ve kaç kere tekrar ettiklerini
	 * yazdıralım. ÖRN: int[] dizi = { 1, 5, 1, 9, 5, 1, 9, 8, 0, 0 };
	 * System.out.println(1 + "Sayısı 3 kere tekrar ediyor."); System.out.println(5
	 * + "Sayısı 2 kere tekrar ediyor."); System.out.println(9 + "Sayısı 2 kere
	 * tekrar ediyor."); System.out.println(8 + "Sayısı 1 kere tekrar ediyor.");
	 * System.out.println(0 + "Sayısı 2 kere tekrar ediyor."); gbi bir çıktı alalım
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int[] dizi = { 1, 5, 1, 9, 5, 1, 9, 8, 0, 0 };
		tekrarEdenSayi(dizi);
	}

	public static void tekrarEdenSayi(int[] array) {
		boolean[] kontrol = new boolean[array.length];
		for (int i = 0; i < array.length; i++) {
			if (kontrol[i] == true) { // kontrol true ise döngüden çıktık
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
					kontrol[j] = true;
				}
			}
			System.out.println(array[i] + " sayısı, " + count + " adet bulunmaktadır.");
		}

	}
}
