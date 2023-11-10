package org.enes.lesson07;

import java.util.Scanner;

public class Question33 {
    public static void main(String[] args) {
        /**
         * Dýþarýdan bir dizi uzunluðu alalým ve bir dizi tanýmlayýp o diziyi sýrayla gezerek dolduralým
         * ve daha sonra yazdýralým..
         */

        System.out.print("Dizi uzunluðunu belirtiniz...:");
        Scanner sc=new Scanner(System.in);
        int diziUzunlugu=sc.nextInt();
        int [] dizi=new int[diziUzunlugu];


        for (int i=0;i<dizi.length;i++){
            System.out.print("Dizi için "+diziUzunlugu+" adet eleman giriniz...:");
            int sayi=new Scanner(System.in).nextInt();
            dizi[i]+=sayi;
        }
        for (int i=0;i<dizi.length;i++){
            System.out.println(dizi[i]);
        }



    }
}
