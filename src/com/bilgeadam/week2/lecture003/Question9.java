package com.bilgeadam.week2.lecture003;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		/**
		 * Kullanıcıdan girilen 1-10 arasındaki sayıların çarpım tablosunu yazdıran kod.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen 1 ile 10 arasında bir sayı giriniz: ");
		int sayi = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			int carpim = sayi * i;
			System.out.println(sayi + "x" + i + " = " + carpim);

		}

	}

}
