package com.bilgeadam.week2.lecture004;

public class Question16 {

	/**
	 * 1 den 100 e kadar olan çift sayıların toplamının tek sayıların toplamına
	 * oranını bulalım
	 */

	public static void main(String[] args) {

		int ciftToplam = 0; // double ciftToplam = 0; - bütün değişkenleri double olarak başlatıp cast
							// işlemi yapmadan da sonuç bulabilirdik
		int tekToplam = 0; // double tekToplam = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				ciftToplam += i;

			} else {

				tekToplam += i;

			}
		}

		double oran = ciftToplam / (double) tekToplam; // double oran = ciftToplam / tekToplam;
		System.out.println("Sonuç: " + (oran));
	}

}