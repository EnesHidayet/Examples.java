package org.enes.lesson03;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        /**
         * dışarıdan bir taban degeri birde üs degeri alalım ve bu işlemin sonucunu bulan algoritmayı yazalım
         */
        System.out.println("Sayıyı giriniz.:");
        int s1=new Scanner(System.in).nextInt();

        System.out.println("Üssünü giriniz");
        int s2=new Scanner(System.in).nextInt();
        int sonuc=1;
        for (int i=0; i<s2; i++){

            sonuc*=s1;

        }
        System.out.println("Sonuç...:"+sonuc);

    }
}
