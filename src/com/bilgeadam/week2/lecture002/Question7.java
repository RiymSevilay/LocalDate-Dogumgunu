package com.bilgeadam.week2.lecture002;

import java.util.Scanner;

public class Question7 {
	/**
	 * Dışarıdan iki tane tam sayısal değer alacağız. iki sayının toplamı çift ise
	 * true, değil ise false yazdıralım
	 * 
	 * bu değerlerin bir de ortalamasını bulalım
	 */
	public static void main(String[] args) {

		int sayi1, sayi2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen 1.sayıyı giriniz: ");
		sayi1 = sc.nextInt();
		System.out.println("Lütfen 2.sayıyı giriniz: ");
		sayi2 = sc.nextInt();

		int toplam = sayi1 + sayi2;
		boolean ciftMi = toplam % 2 == 0;
		System.out.println(ciftMi);
		double ortalama = toplam / 2d;
		System.out.println(ortalama);

//	if (toplam % 2 == 0) {                 
//		System.out.println("Sayıların toplamı çifttir.");
//	} else
//		System.out.println("Sayıların toplamı çift değildir.");
//boolean karar yapısı kullanmasaydık böyle çözebilirdik
	}
}