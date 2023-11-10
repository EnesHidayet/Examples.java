package org.enes.lesson02;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        int sayi,basamakSayisi=0,basamakToplam=0;
        System.out.println("Bir sayı giriniz...:");
        Scanner sc=new Scanner(System.in);
        sayi=sc.nextInt();

        do {
            int kalan;
            kalan=sayi%10;
            basamakToplam+=kalan;

            sayi/=10;
            basamakSayisi++;


        }while (sayi>=1);

        System.out.println("Girilen sayı "+basamakSayisi+" basamaklıdır.");
        System.out.println("Girilen sayının basamak değerleri toplamı "+basamakToplam+" dır");

        int deger=0;
        do {
            System.out.println(deger);
        }while (deger!=0);

        while (deger!=0){
            System.out.println(deger);
        }

    }
}
