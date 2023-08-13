package com.bilgeadam.week2.lecture002;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// int integerSayi = sc.nextInt();

//		System.out.println("Lütfen bir sayı giriniz: ");
//		double doubleSayi = sc.nextDouble();
//		System.out.println(doubleSayi + ikinciSayi);

		String ikinciSayiString = "5";
		String ucuncuSayiString = "77";
		System.out.println("Lütfen adınızı giriniz: ");
		String isim = sc.nextLine();
		System.out.println("Merhaba " + isim);
		System.out.println(ikinciSayiString + ucuncuSayiString); // 5 ve 77yi yan yana yazdırır çünkü "" string
		/**
		 * Scanner ile sayısal bir değer okuduktan sonra String bir değer okumak
		 * istiyorsak mutlaka bir tane boş sc.netxLine(); kullanmamız gerekir
		 */
		sc.nextLine();
		double ikinciSayi = 7;

		System.out.println("Lütfen adınızı giriniz: ");
		String isim1 = sc.nextLine();
	}

}
