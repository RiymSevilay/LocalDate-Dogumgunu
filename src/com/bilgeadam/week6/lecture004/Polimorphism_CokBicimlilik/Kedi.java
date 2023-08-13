package com.bilgeadam.week6.lecture004.Polimorphism_CokBicimlilik;

public class Kedi extends Hayvan implements IMiyavlayabilir {

	@Override
	public void sesCikar() {

		System.out.println("Miyavvv");

	}

	@Override
	public void miyavla() {
		System.out.println("Miyavvv");
	}

	@Override
	public void temizlen() {
		System.out.println("Temizleniyor");
	}
}
