package org.enes.lesson07;

public class Question32 {
    public static void main(String[] args) {
        /**
         * Bir dizidieki t�m say�lar�n toplam�n� bulal�m ve her sayi i�in bu sayi tektir veya bu sayi �ifttir ��kt�s�n� verelim.
         */

        int[] sayilar={1500,120,5,-256,1296,462,159,12};
        int toplam=0;
        for (int i=0; i<sayilar.length;i++){ //arrayin length sinde parantez yok

            toplam+=sayilar[i];

            if (sayilar[i]%2==0){
                System.out.println(sayilar[i]+" say� �ifttir...");
            }else System.out.println(sayilar[i]+" say� tektir...");

        }
        System.out.println("TOPLAM......:"+toplam);

    }
}
