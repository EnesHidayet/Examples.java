package org.enes.lesson02;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

        /**
         * 1 den giridğimiz sayıya kadar olan çift sayıların toplamını yazdıran program
         */
        int sayi,toplam=0;
        System.out.print("Bir sayı giriniz...:");
        Scanner sc= new Scanner(System.in);
        sayi=sc.nextInt();
        for (int i=2; i<=sayi; i+=2){

            toplam+=i;

        }
        System.out.println(toplam);
        toplam=0;

        //veya

        for (int a=1; a<=sayi; a++){

            int ciftSayi=a%2==0?a:0;
            toplam+=ciftSayi;

        }
        System.out.println(toplam);

    }
}
