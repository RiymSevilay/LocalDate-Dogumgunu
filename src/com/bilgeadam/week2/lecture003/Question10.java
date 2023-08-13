package com.bilgeadam.week2.lecture003;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		/**
		 * 1 den başlayarak kullanıcının dışarıdan giridiği sayıya kadar olan (sayı
		 * dahil) sayıların 1 fazlasını yazdıran kod
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz: ");
		int sayi = sc.nextInt();
		int toplam = 0;

		for (int i = 1; i <= sayi; i++) {
			toplam += (i + 1);
		}
		System.out.println(toplam);

	}

}
