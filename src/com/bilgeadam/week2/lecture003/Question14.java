package com.bilgeadam.week2.lecture003;

public class Question14 {

	/**
	 * a dan z ye alfabeyi yazdıralım
	 * 
	 */

	public static void main(String[] args) {

		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i + " ");
		}

		// ***** do...while çözümü *****//

		char degisken = 'a';

		do {
			System.out.print(degisken + " ");
			degisken++;

		} while (degisken <= 'z');

	}

}
