package org.enes.lesson02;

public class Question8 {
    public static void main(String[] args) {

        /**
         * 1 den başlayarak sırayla sayılar toplayalım toplam 50 den büyük olana kadar programımız çalışsın
         * program sonunda toplamı ve programı kaç kere çalıştığını yazdıralım.
         */

        int toplam=0,sayac=1;
        while (toplam<50)
        {
            toplam+=sayac;
            sayac++;
        }
        System.out.println("Program "+sayac+" defa çalıştı toplam sonuç "+toplam);

    }
}
