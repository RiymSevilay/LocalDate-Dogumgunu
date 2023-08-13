package com.bilgeadam.week5.lecture002_MARATHON1;

import java.util.Scanner;

public class Uygulama {

	Scanner sc = new Scanner(System.in);

	OgrenciOzelListe ogrenciOzelListe = new OgrenciOzelListe();

	MaasOzelListe maasOzelListe = new MaasOzelListe();

	boolean[][] hobiListesi;
	String[][] hobiler;

	public void uygulama() {// Adım-1- uygulama methodu yazdık, bunu direkt Runnerda çağıracağız.

		int secim;

		do {// Adım-3- do...while döngümüzü kurduk.(Neden do..while; çünkü 0 ile sistemden
			// çıkış yapacağız inputu içeriden almamız gerekiyor ve 0 girilmediği sürece
			// işlem seçmeye devam etmek istiyoruz, bunun için do...while).
			menu();
			secim = secimYap();
			switch (secim) {
			case 1:
				ogrenciTanimla();
				break;
			case 2:
				hobileriGir();
				break;
			case 3:
				maasBeklentileriniGir();
				// maasOzelListe.list();
				break;
			case 4:
				sinifListesi();
				break;
			case 0:
				System.out.println("Çıkış yapıldı!.");
				break;
			default:

			}

		} while (secim != 0);

	}

	private void sinifListesi() {
		System.out.println("No\t\tAd\tHobiler\t\t\tMaaş Beklentisi");
		for (int i = 0; i < ogrenciOzelListe.boyut; i++) {
			System.out.print((i + 1) + "\t" + ogrenciOzelListe.ogrenciListesi[i] + "\t\t");
			hobileriYazdir(i);
			System.out.println("\t\t" + maasOzelListe.maasListesi[i]);
		}

	}

	private void hobileriTanimla() {
		hobiler = new String[hobiListesi.length][4];

		for (int i = 0; i < hobiler.length; i++) {
			for (int j = 0; j < hobiler[i].length; j++) {
				hobiler[i][j] = "";
			}
		}
		for (int i = 0; i < hobiListesi.length; i++) {
			for (int j = 0; j < hobiListesi[i].length; j++) {
				if (hobiListesi[i][j] == true) {
					if (j == 0) {
						hobiler[i][j] = "Yürümek";
					}
					if (j == 1) {
						hobiler[i][j] = "Kitap Okumak";
					}
					if (j == 2) {
						hobiler[i][j] = "Spor Yapmak";
					}
					if (j == 3) {
						hobiler[i][j] = "Kod Yazmak";
					}
				}
			}
		}
	}

	private void hobileriYazdir(int index) {
		hobileriTanimla();
		for (int j = 0; j < hobiler[index].length; j++) {
			System.out.print(hobiler[index][j]);
			if (j != hobiler[index].length - 1 && !hobiler[index][j].equals("")) {
				System.out.println(",");
			}
		}
	}

	private void maasBeklentileriniGir() {
		double maas;
		for (int i = 0; i < ogrenciOzelListe.boyut; i++) {
			System.out.print((i + 1) + ". öğrenci " + ogrenciOzelListe.ogrenciListesi[i] + " maaş beklentisi: ");
			maas = sc.nextDouble();
			maasOzelListe.add(maas);
		}
		sc.nextLine();
	}

	private void hobileriGir() {
		int ogrenciIndex = ogrenciBul();
		if (ogrenciIndex != -1) { // oğrenciIndex -1 değilse, bir öğrenci bulduğumuzu ifade eder
			String secim;
			System.out.print("Yürümekten hoşlanır mısın?(E/H) : ");
			secim = sc.nextLine();
			if (secim.equalsIgnoreCase("E")) {
				hobiListesi[ogrenciIndex][0] = true;
			}
			System.out.print("Kitap okumaktan hoşlanır mısın?(E/H) : ");
			secim = sc.nextLine();
			if (secim.equalsIgnoreCase("E")) {
				hobiListesi[ogrenciIndex][1] = true;
			}
			System.out.print("Spor rutinlerin var mı?(E/H) : ");
			secim = sc.nextLine();
			if (secim.equalsIgnoreCase("E")) {
				hobiListesi[ogrenciIndex][2] = true;
			}
			System.out.print("Kod yazmaktan hoşlanır mısın?(E/H) : ");
			secim = sc.nextLine();
			if (secim.equalsIgnoreCase("E")) {
				hobiListesi[ogrenciIndex][3] = true;
			}
		} else {
			System.err.println("Böyle bir öğrenci bulunmamaktadır!.");
		}
	}

	private int ogrenciBul() {
		ogrenciOzelListe.list();// for döngüsünde kaydettiğimiz isimleri bir sonraki seçimi yaparkan bize
								// listelesin ve girdiğimiz isimleri görüp ona göre seçim yapalım diye ekledik
		System.out.println("Öğrenci seçiniz..: ");
		String ogrenci = sc.nextLine();
		String[] ogrenciler = ogrenciOzelListe.ogrenciListesi;
		for (int i = 0; i < ogrenciler.length; i++) {
			if (ogrenciler[i].equalsIgnoreCase(ogrenci)) {
				// System.out.println(i);
				return i;
			}
		}
		// System.out.println(-1);
		return -1;
	}

	private void ogrenciTanimla() {
		System.out.print("Kaç öğrenci tanımlayacaksınız? : ");
		int ogrenciSayisi = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < ogrenciSayisi; i++) {
			System.out.print((i + 1) + ".Öğrencinin adı...: ");
			String ogrenci = sc.nextLine();
			ogrenciOzelListe.add(ogrenci);
		}
		hobiListesi = new boolean[ogrenciSayisi][4];
	}

	private void menu() { // Adım-2- Menü methodumuzu oluşturduk
		System.out.println("*************************************");
		System.out.println("****** ÖĞRENCİ BİLGİ SİSTEMİ ********");
		System.out.println("*************************************");
		System.out.println();
		System.out.println("1- Sınıf arkadaşı tanımla");
		System.out.println("2- Hobilerini gir");
		System.out.println("3- Maaş beklentilerini gir");
		System.out.println("4- Sınıf listesi");
		System.out.println("0- ÇIKIŞ");
		System.out.println();
	}

	private int secimYap() {
		System.out.print("Seçim yapınız: ");
		int secim = sc.nextInt();
		sc.nextLine();
		System.out.println();
		return secim;
	}

}
