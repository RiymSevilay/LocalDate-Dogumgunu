package com.bilgeadam.week4.lecture002;

import java.util.Scanner;

public class Question46 {
	/**
	 * Kullanıcıya kaç sayı alacağını soralım (2 ya da 3 sayı) 2 gelirse topla
	 * ()methodu içinde iki değerimizi alıp toplayalım eğer 3 gelirse aynı methodu
	 * overload şeklinde yazalım Aldığımız 3 değeri methoda geçelim main de
	 * dışarıdan kaç sayı alacağımızı belirtiyoruz, o sayılara göre koşullarımızı
	 * belirleyip o konularda yazdığımız 2 methodtan birisini çağıracağız
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen sayı adedi giriniz: ");
		int sayiAdedi = sc.nextInt();

		switch (sayiAdedi) {
		case 2:
			System.out.println("TOPLAM = " + topla());
			break;
		case 3:

			System.out.println("Lütfen 1.sayıyı giriniz: ");
			int sayi1 = sc.nextInt();
			System.out.println("Lütfen 2.sayıyı giriniz: ");
			int sayi2 = sc.nextInt();
			System.out.println("Lütfen 3.sayıyı giriniz: ");
			int sayi3 = sc.nextInt();
			System.out.println("TOPLAM = " + topla(sayi1, sayi2, sayi3));
			break;
		default:
			System.out.println("Çıkış Yaptınız");
		}

	}

	private static int topla() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen 1.sayıyı giriniz: ");
		int sayi1 = sc.nextInt();
		System.out.println("Lütfen 2.sayıyı giriniz: ");
		int sayi2 = sc.nextInt();

		return sayi1 + sayi2;

	}

	private static int topla(int sayi1, int sayi2, int sayi3) {

		return sayi1 + sayi2 + sayi3;

	}

}
