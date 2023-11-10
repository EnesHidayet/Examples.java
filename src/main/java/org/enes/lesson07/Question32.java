package org.enes.lesson07;

public class Question32 {
    public static void main(String[] args) {
        /**
         * Bir dizidieki tüm sayýlarýn toplamýný bulalým ve her sayi için bu sayi tektir veya bu sayi çifttir çýktýsýný verelim.
         */

        int[] sayilar={1500,120,5,-256,1296,462,159,12};
        int toplam=0;
        for (int i=0; i<sayilar.length;i++){ //arrayin length sinde parantez yok

            toplam+=sayilar[i];

            if (sayilar[i]%2==0){
                System.out.println(sayilar[i]+" sayý çifttir...");
            }else System.out.println(sayilar[i]+" sayý tektir...");

        }
        System.out.println("TOPLAM......:"+toplam);

    }
}
