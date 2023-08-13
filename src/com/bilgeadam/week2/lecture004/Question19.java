package com.bilgeadam.week2.lecture004;

import java.util.Scanner;

public class Question19 {

	/**
	 * Dışarıdan girilen bir sayının asal olup olmadığını bulan ve buna göre çıktı
	 * veren kod 1 asal sayı değildir bu durumu ayrıca değerlendirmemiz gerekiyor
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int sayi = sc.nextInt();
		if (sayi == 2) {
			System.out.println("Asal sayıdır.");
		} else if (sayi < 2 || sayi % 2 == 0) {
			System.out.println("Asal sayı değildir");
		} else {
			boolean asal = true;
			for (int i = 3; i <= sayi; i++) {
				if (sayi % i == 0) {
					asal = false;
					break;
				}
			}
			if (asal) {
				System.out.println("Asal sayıdır");
			} else {
				System.out.println("Asal sayı değildir");
			}

		}
		sc.close();
	}
}
