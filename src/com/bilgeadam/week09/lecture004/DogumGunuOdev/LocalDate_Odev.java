package com.bilgeadam.week09.lecture004.DogumGunuOdev;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class LocalDate_Odev {
		/**
		 * Dışarıdan String olarak doğumgünü alınız.
		 * 
		 * daha sonra doğduğunuz günden bu güne kadar 
		 * * kaç yıl, 
		 * * kaç ay, 
		 * * kaç hafta,
		 * * kaç gün, geçtiğini hesaplayıp yazdırın.
		 * 
		 * Bir sonraki doğumgününe kaç gün kaldığını hesaplayın.
		 * 
		 */
	public static void main(String[] args) {



			Scanner sc = new Scanner(System.in);
			System.out.print("Lütfen doğduğunuz yılı giriniz: ");
			int yil = sc.nextInt();
			System.out.print("Lütfen doğduğunuz ayı giriniz: ");
			int ay = sc.nextInt();
			System.out.print("Lütfen doğduğunuz günü giriniz: ");
			int gun = sc.nextInt();
			System.out.println();
			System.out.println("Doğumgününüz: " + LocalDate.of(yil, ay, gun));

			System.out.println();
			LocalDate gunumuz = LocalDate.now();
			System.out.println("Günümüzün tarihi: " + gunumuz);

			System.out.println();
			long kacYilGecmis = ChronoUnit.YEARS.between(LocalDate.of(yil, ay, gun), gunumuz);
			System.out.println("Doğumgününüzden bugüne " + kacYilGecmis + " yıl geçmiştir.");
			long kacAyGecmis = ChronoUnit.MONTHS.between(LocalDate.of(yil, ay, gun), gunumuz);
			System.out.println("Doğumgününüzden bugüne " + kacAyGecmis + " ay geçmiştir.");
			long kacGunGecmis = ChronoUnit.DAYS.between(LocalDate.of(yil, ay, gun), gunumuz);
			System.out.println("Doğumgününüzden bugüne " + kacGunGecmis + " gün geçmiştir.");

			System.out.println();
			LocalDate birSonrakiDogumgunu = LocalDate.of(yil, ay, gun).withYear(gunumuz.getYear());
			if (birSonrakiDogumgunu.isBefore(gunumuz) || birSonrakiDogumgunu.isEqual(gunumuz)) {
				birSonrakiDogumgunu = birSonrakiDogumgunu.plusYears(1);
			}
			long yeniDogumgunu = ChronoUnit.DAYS.between(gunumuz, birSonrakiDogumgunu);
			System.out.println("Bir sonraki doğumgününüze " + yeniDogumgunu + " gün kalmıştır.");

		


	}

}
