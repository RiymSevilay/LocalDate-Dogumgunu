package com.bilgeadam.week2.lecture002;

public class Question4 {
	/*
	 * 1- İki tane String değişken oluşturalım. İsim ve soyisim olsun. sonra da
	 * değişkenleri ekrana yazdıralım.
	 * 
	 * NOT: \n -> alt satır kırılım. \n kullanılırken her zaman "" içinde kullanılır
	 * 
	 * \t ->TAB girişi kullanıldığı yerdeki ifadenin başına boşluk atar
	 * 
	 * 2- a ve b karakterlerinin değerlerini yazdıran kod
	 * 
	 * ctrl + shift + 7 -> her şeyi yorum satırına alabiliriz
	 */

	public static void main(String[] args) {

		String isim = "Sevilay";
		String soyisim = "Biçer Uçar";
		String isimSoyisim = "isim: " + isim + ", soyisim: " + soyisim;

		System.out.println(isimSoyisim);
		// System.out.println("isim: " + isim);
		// System.out.print("soyisim: " + soyisim);
		System.out.println("***Alt satır kırılımı***");
		System.out.println("isim: " + isim + "\nsoyisim: " + soyisim);
		System.out.println("***tab girişi***");
		System.out.println("isim:\t" + isim + "soyisim:\t" + soyisim);

		int i = 5;
		int j = 7;
		int toplam = i + j;
		int carpim = i * j;
		System.out.println("TOPLAM: \n" + toplam);
		System.out.println(toplam + "\n" + carpim); // toplam ve carpim alt alta yazdırılır

		char a = 'a';
		char b = 'b';
		System.out.println("ASCII a:" + (int) a + "\nASCII b:" + (int) b);
		System.out.println(a + b);
		System.out.println('a' + 'b');
	}

}
