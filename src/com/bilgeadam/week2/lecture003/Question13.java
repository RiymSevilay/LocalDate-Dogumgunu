package com.bilgeadam.week2.lecture003;

import java.util.Scanner;

public class Question13 {
	/**
	 * Dışarıdan taban değeri ve üs isimli 2 tane değişken alınacak (2 üzeri 5 gbi)
	 * tabanın kuvvetını hesaplayacağız
	 * 
	 * Kullanıcıya isim sorulacak, alınan isim değişkeniyle birlikte sonuç
	 * yazdırılacak
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lütfen bir taban değeri giriniz:");
		int tabanDegeri = sc.nextInt();
		System.out.print("Lütfen bir üs değeri giriniz:");
		int us = sc.nextInt();
		sc.nextLine();

		int i = 1;
		int sonuc = 1;
		while (i <= us) {
			sonuc *= tabanDegeri;
			i++;

		}
		System.out.print("Lütfen isminizi girin:");
		String isim = sc.nextLine();

		System.out.println(isim + "Girilen taban: " + tabanDegeri + " Girilen üs :" + us + "sonuc : " + sonuc);

	}

}
