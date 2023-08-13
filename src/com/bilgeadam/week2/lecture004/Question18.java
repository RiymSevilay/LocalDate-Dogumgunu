package com.bilgeadam.week2.lecture004;

import java.util.Scanner;

public class Question18 {

	/**
	 * telefon kodu ve email kodu tanımlayacağız. kullanıcıdan email ve telefon kodu
	 * girmesini isteyeceğiz
	 * 
	 * hem sms hem e mail kodu hatalıysa bir çıktı sms doğru, email kodu hatalıysa
	 * bir çıktı sms yanlış, email kodu doğru ise bir çıktı hepsi doğruysa "Giriş
	 * yaptınız"
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sms = 777;
		int email = 555;

		System.out.println("Lütfen sms kodunuzu giriniz:");
		int smsCode = sc.nextInt();
		System.out.println("Lütfen email kodunuzu giriniz: ");
		int emailCode = sc.nextInt();

		if (sms != smsCode && email != emailCode) {
			System.out.println("Sms ve email kodunuz hatalıdır!");
		} else if (sms == smsCode && email != emailCode) {
			System.out.println("Email kodunuz hatalıdır!");
		} else if (sms != smsCode && email == emailCode) {
			System.out.println("Sms kodunuz hatalıdır!");
		} else
			System.out.println("Giriş yaptınız!");
		sc.close();
	}
}
