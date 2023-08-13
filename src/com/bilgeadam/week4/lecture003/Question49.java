package com.bilgeadam.week4.lecture003;

import java.util.Scanner;

public class Question49 {
	/**
	 * 4777 
	 * 1477 
	 * 1147 
	 * 1114 şu görüntüyü oluşturan kod
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Lütfen bir tek sayı giriniz: ");
		int sayi = sc.nextInt();
		System.out.println("Lütfen satır sayısını giriniz: ");
		int satir = sc.nextInt();
		System.out.println("Lütfen sütun sayısını giriniz: ");
		int sutun = sc.nextInt();

		printArray(sayi, satir, sutun);

	}

	public static void printArray(int max, int satir, int sutun) {
		int min = 1;
		int ortalama = (max + min) / 2;
		int[][] array = new int[satir][sutun]; // i değeri kadar satır j değeri kadar sütun yazdıracağız

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {

				if (i == j) {
					array[i][j] = ortalama;

				} else if (j < i) {
					array[i][j] = min;

				} else if (i < j)
					array[i][j] = max;

				System.out.print(array[i][j]);
			}
			System.out.println();
		}

	}
}
