package com.bilgeadam.week2.lecture003;

import java.util.Scanner;

public class Question12_do_while_cozum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int toplam = 0;
		int sayac = 0;
		int sayi;
		System.out.println("Lütfen bir sayı giriniz: ");
		sayi = sc.nextInt();
		do {
			toplam += sayi % 10;
			sayi /= 10;
			sayac++;
		} while (sayi != 0);
		System.out.println("Basamaklar toplamı: " + toplam);
		System.out.println("Basamak sayısı: " + sayac);
	}

}
