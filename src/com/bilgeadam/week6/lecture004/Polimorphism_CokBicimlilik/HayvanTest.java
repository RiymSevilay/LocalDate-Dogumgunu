package com.bilgeadam.week6.lecture004.Polimorphism_CokBicimlilik;

public class HayvanTest {

	public static void main(String[] args) {

		Kedi kedi = new Kedi();
		System.out.println(kedi.getClass().getSimpleName());
		Kopek kopek = new Kopek();

		kedi.setName("Şerafettin");
		System.out.println(kedi.getName());
		kedi.sesCikar();
		kedi.temizlen();

		kopek.setName("Pars");
		System.out.println(kopek.getName());
		kopek.sesCikar();

	}

}
