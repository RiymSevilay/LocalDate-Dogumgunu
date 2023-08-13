package com.bilgeadam.week2.lecture004;

import java.util.Scanner;

public class Question17 {

	/**
	 * telefon kodu ve email kodu tanımlayacağız. kullanıcıdan email ve telefon kodu
	 * girmesini isteyeceğiz
	 * 
	 * girilen email kodu hatalı ise; "Girdiğiniz email kodu hatalıdır." girilen sms
	 * kodu hatalı ise; "Girdiğiniz sms kodu hatalıdır." çıktılar alalım
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int smsCode = 777;
		int smsInput;
		int emailCode = 222;
		int emailInput;
		System.out.println("Lütfen sms kodunuzu giriniz: ");
		smsInput = sc.nextInt();

		System.out.println("Lütfen email kodunuzu giriniz: ");
		emailInput = sc.nextInt();

		if (smsCode != smsInput) {
			System.out.println("Sms kodunuz yanlış!");

			if (emailCode != emailInput) {
				System.out.println("Email kodunuz yanlış!");
			}
			if (smsCode == smsInput && emailCode == emailInput) {

			}
		}
		System.out.println("Başarıyla giriş yaptınız.");

		sc.close();

	}
}
