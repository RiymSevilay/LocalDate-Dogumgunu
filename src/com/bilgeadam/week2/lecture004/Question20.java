package com.bilgeadam.week2.lecture004;

import java.util.Scanner;

public class Question20 {

	/**
	 * Girilen sayının 5 in kuvveti olup olmadığını yazdıran kod
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz:");
		int sayi = sc.nextInt();
		boolean kontrol = true;

		if (sayi == 1) {
			System.out.println("Sayı 5'in kuvvetidir.");
			kontrol = false;
		} else if (sayi < 0) {
			System.out.println("Lütfen pozitif bir sayı giriniz:");
			kontrol = false;
		}
		while (kontrol) {
			if (sayi % 5 == 0) {
				sayi /= 5;
				if (sayi == 1) {
					System.out.println("Sayi 5'in kuvvetidir");
					kontrol = false;
				}

			} else {
				System.out.println("Sayi 5'in kuvveti değildir");
				kontrol = false;

			}

		}

	}

}
