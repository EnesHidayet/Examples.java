package org.enes.lesson07;

public class Question36 {
    public static void main(String[] args) {
        /**
         * Bir dizide art arda gelen 2 indexdeki say� de�eri 2 ise true yazd�r�p d�ng�y� sonland�ral�m yoksa false yazd�ral�m
         */
        int[] sayilar={ 2,-256, 16, 1258, 5, 2 };

        boolean kontrol=false;

        for (int i=0;i<sayilar.length-1;i++){

            if (sayilar[i]==2 && sayilar[i+1]==2){

            kontrol=true;
            break;

            }
        }
        System.out.println(kontrol);


    }
}
