package com.bilgeadam.week2.lecture002;

import java.util.Scanner;

public class Question8 {

	/**
	 * Dışarıdan girilen sayının faktöriyelini hesaplayan kod
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Lütfen bir sayı giriniz: ");
		int sayi;
		sayi = sc.nextInt();
		int faktoriyel = 1;
		for (int i = 1; i <= sayi; i++) {
			faktoriyel = faktoriyel * i;

		}

		System.out.println("Sayının faktöriyeli: " + faktoriyel);
	}

}
