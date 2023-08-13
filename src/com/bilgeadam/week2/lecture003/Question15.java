package com.bilgeadam.week2.lecture003;

import java.util.Scanner;

public class Question15 {

	/**
	 * Klavyeden 0 (sıfır) girilinceye kadar sayı okumaya devam edeceğiz. 0
	 * giridiğinde sayıların toplamı ve ortalamalarını ekrana ayazdıran kod
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number;
		int toplam = 0;
		int sayac = 1;
		double ortalama = 0;
		System.out.print("Lütfen bir sayı giriniz: ");

		number = sc.nextInt();

		while (number != 0) {
			toplam += number;
			ortalama = toplam / (double) sayac; // toplam ya da sayac ikisinden birine double yapmam lazım
			System.out.print("Lütfen bir sayı giriniz: ");
			number = sc.nextInt();
			sayac++;

		}
		System.out.println("Toplam : " + toplam + "\nOrtalama : " + ortalama);

//**********************      for çözümü      ******************************************//
//		
//		
//		for (; number != 0; sayac++) {
//			toplam += number;
//			ortalama = toplam / (double) sayac;
//			System.out.print("Lütfen bir sayı giriniz: ");
//			number = sc.nextInt();
//
//		}
//		System.out.print("Toplam: " + toplam + "\nOrtalama: " + ortalama);

	}

}
