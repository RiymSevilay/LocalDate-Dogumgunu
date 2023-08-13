package com.bilgeadam.week2.lecture003;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		/**
		 * Girilen sayının basamak sayısını ve basamak değerleri toplamını yazdıran kod
		 */

		Scanner sc = new Scanner(System.in);

		int sayi, basamak, sayac = 0, toplam = 0;
		System.out.println("Lütfen bir sayı giriniz: ");
		sayi = sc.nextInt();

		while (sayi > 0) {
			basamak = sayi % 10;
			toplam += basamak;
			sayi = sayi / 10;
			sayac++;

		}

		System.out.println("Girdiğiniz sayının basamak değerleri toplamı: " + toplam);
		System.out.println("Girdiğiniz sayının basamak sayısı: " + sayac);

	}

}
