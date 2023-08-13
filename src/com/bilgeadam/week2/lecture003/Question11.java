package com.bilgeadam.week2.lecture003;

public class Question11 {

	public static void main(String[] args) {
		/**
		 * 1 den başlayarak gelen bütün sayıları toplayacağız. toplam 50 yi geçene kadar
		 * çalışsın en son toplamı ve bu döngünün kaç kere çalıştığını yazdıran kod
		 */

		int toplam = 0;
		int i = 0;
		int sayac = 0;
		while (toplam <= 50) {
			toplam += i;
			sayac = i;
			i++;
			System.out.println("Toplam--> " + toplam + " Döngü-->" + sayac);
		}
// ************************ for çözümü ****************************************************//

		for (toplam = 0; toplam <= 50; i++) {
			toplam += i;
			System.out.println("Toplam--> " + toplam + " Döngü-->" + i);

		}
	}

}
