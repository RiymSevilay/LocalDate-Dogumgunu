package com.bilgeadam.week2.lecture004;

import java.util.Scanner;

public class Question21 {

	/**
	 * Kullanıcı 1 ile 7 arasında bir sayı girsin [1,7] Bu sayıya denk gelen
	 * haftanın gününü yazdıran kod
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen bir sayi giriniz:");
		int sayi = sc.nextInt();

		switch (sayi) {

		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Salı");
			break;
		case 3:
			System.out.println("Çarşamba");
			break;
		case 4:
			System.out.println("Perşembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
		default:
			System.err.println("Lütfen geçerli bir değer giriniz!");
		}
		sc.close();
	}

}
