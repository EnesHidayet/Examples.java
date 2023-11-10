package org.enes.lesson04;

public class Question15 {
    public static void main(String[] args) {

        /**
         * 1 den 100 e kadar 100 dahil olan çift sayıların toplamının
         * tek sayıların toplamına oranını bulunuz.
         * tek sayılar toplamı çift sayılar toplamı ve oranını yazdırın
         */

        System.out.println("Enes");

        double ctoplam=0;
        double ttoplam=0;

        for (int i=0; i<=100; i++){

            if (i%2==0){

                ctoplam+=i;

            } else {

                ttoplam+=i;

            }

        }


        System.out.println("Tek sayılar toplamı...:"+ttoplam);
        System.out.println("Çift sayılar toplamı...:"+ctoplam);
        System.out.println("Çift sayıların toplamının tek sayıların toplamına oranı...:"+(ctoplam/ttoplam));

    }
}
