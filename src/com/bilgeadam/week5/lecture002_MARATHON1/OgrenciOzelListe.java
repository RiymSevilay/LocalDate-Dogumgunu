package com.bilgeadam.week5.lecture002_MARATHON1;

public class OgrenciOzelListe {

	String[] ogrenciListesi;
	int boyut = 0;

	public void add(String ogrenci) {

		String[] tmp;
		if (ogrenciListesi == null) {
			ogrenciListesi = new String[1];
			ogrenciListesi[0] = ogrenci;
		} else {
			tmp = new String[boyut + 1];
			for (int i = 0; i < boyut; i++)
				tmp[i] = ogrenciListesi[i];
			tmp[boyut] = ogrenci;
			ogrenciListesi = tmp;
		}
		boyut++;
	}

	public void list() {
		System.out.print("[");
		for (int i = 0; i < boyut; i++) {
			System.out.print(ogrenciListesi[i]);
			if (i != boyut - 1)
				System.out.print(",");
		}
		System.out.println("]");
	}

	public String[] getList() {
		return ogrenciListesi;
	}

}
