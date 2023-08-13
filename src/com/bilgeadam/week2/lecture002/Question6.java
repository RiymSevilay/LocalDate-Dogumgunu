package com.bilgeadam.week2.lecture002;

import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		/**
		 * Dairenin alanını ve çevresini hesaplayalım yarıçap dışarıdan input olarak
		 * girilecek
		 * 
		 * pi = 3.14
		 */

		Scanner sc = new Scanner(System.in);

		// double pi = Math.PI; (bunu daha sonra öğreneceğiz)
		// System.out.println(pi);

		double pi = 3.14;

		System.out.println("Lütfen yarıcap giriniz:");
		double r = sc.nextDouble();

		double alan = pi * r * r;
		double cevre = 2 * pi * r;

		System.out.println("Alan = " + alan + "\nCevre =" + cevre);
		sc.close();
	}

}
