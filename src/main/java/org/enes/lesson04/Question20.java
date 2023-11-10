package org.enes.lesson04;

import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {

        /**
         * dışarıdan girilen sayının mükemmel sayı olup olmadığını bulalım
         * mükemmel sayı =endisi hariç bölenlerinin toplamı kendine eşit sayıdır
         * 6=1+2+3 örnek
         */

        System.out.println("Lütfen sayı giriniz");
        int sayi=new Scanner(System.in).nextInt();
        int s=0;

        for (int i=1;i<sayi;i++){

            if (sayi%i==0){
                s+=i;
            }

        }
        if (sayi==s){
            System.out.println("Mükemmel sayıdır");
        }else System.out.println("Mükemmel sayı değildir");

    }
}
