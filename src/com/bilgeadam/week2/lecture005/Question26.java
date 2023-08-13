package com.bilgeadam.week2.lecture005;

import java.util.Scanner;

public class Question26 {

	/*
	 * 
	 * Dışarıdan bir String girdisi olsun.
	 * 
	 * bu string'in her bir harfi bulunduğu index ile birlikte alt alta yazdıralım.
	 * 
	 * 
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Lütfen bir kelime giriniz: ");
		String kelime = sc.nextLine();

		for (int i = 0; i < kelime.length(); i++) {
			System.out.println(i + " " + kelime.charAt(i));
		}

	}

}
