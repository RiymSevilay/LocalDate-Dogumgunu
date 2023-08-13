package com.bilgeadam.week3.lecture003;

public class Question40 {

		/*
		 * Bir başlangıç ve bitiş değeri arasında ki sıralı sayılardan eğer sayı 3'ün
		 * katı ise bilge, 5 in katı ise adam hem 3'ün ve hem de 5'in katı ise bilgeadam
		 * yazdıralım. int start=2; end=22; {2,3,4,5,6,7,8,9,10,11,12,13,14,15} ->>
		 * {2,"bilge",4,"adam",6,7,8,"bilge",...14,"bilgeadam"}
		 * 
		 */
	
		public static void main(String[] args) {
			
			int start = 2;
			int end = 22;
			
			String[] array = new String[end - start+1];
			
			for(int i = 0; i<array.length; i++) {
			
				
				int sayi = i + start;
				
				if(sayi % 15 ==0) {
					array[i] = "BilgeAdam";
					
			 } else if (sayi % 5 == 0) {
					array[i] = "Adam";
				
		   	}else if(sayi % 3 == 0) {
				array[i] = "" + sayi;	
				
			}
				for (int j =0; j<array.length; j++) {
					if (j == array.length - 1) {
						System.out.println(array[j]);
					}else {
						System.out.println(array[j] + ",");
					}
				}
				
				//System.out.println(Array.toString(array);
			}	
		}
}
