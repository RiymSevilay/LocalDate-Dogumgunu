package com.bilgeadam.week2.lecture002;

public class Question3 {

	/*
	 * Türk lirasını "amount" olarak alalım ve Dolara çevirelim.
	 * 
	 */
	public static void main(String[] args) {

		double tl = 100;
		double dolarKuru = 26.11;
		double exchange;
		exchange = tl / dolarKuru;
		System.out.println(tl + "TL: " + exchange + " dolara eşittir.");

	}

}
