package org.enes.lesson02;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        /**
         * Dışarıdan iki sayı alıp toplayalım daha sonra bu sayı çift ise ekrana true yazdıralım (if else kullanmadan).
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz...:");
        int sayi1=sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        System.out.println("Bir sayı giriniz...:");
        int sayi2=sc1.nextInt();
        int toplam=sayi1+sayi2;
        boolean kontrol=toplam%2==0;
        System.out.println("Sayı Çift mi?...:"+kontrol);



    }
}
