package org.enes.lesson07;

import java.util.Scanner;

public class Question33 {
    public static void main(String[] args) {
        /**
         * D��ar�dan bir dizi uzunlu�u alal�m ve bir dizi tan�mlay�p o diziyi s�rayla gezerek doldural�m
         * ve daha sonra yazd�ral�m..
         */

        System.out.print("Dizi uzunlu�unu belirtiniz...:");
        Scanner sc=new Scanner(System.in);
        int diziUzunlugu=sc.nextInt();
        int [] dizi=new int[diziUzunlugu];


        for (int i=0;i<dizi.length;i++){
            System.out.print("Dizi i�in "+diziUzunlugu+" adet eleman giriniz...:");
            int sayi=new Scanner(System.in).nextInt();
            dizi[i]+=sayi;
        }
        for (int i=0;i<dizi.length;i++){
            System.out.println(dizi[i]);
        }



    }
}
