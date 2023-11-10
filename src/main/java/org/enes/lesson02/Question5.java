package org.enes.lesson02;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        /**
         * 1 den giridğimiz sayıya kadar olan sayıların toplamını yazdıran program
         */
        int sayi,toplam=0;
        System.out.print("Bir sayı giriniz...:");
        Scanner sc= new Scanner(System.in);
        sayi=sc.nextInt();
        for (int i=1; i<sayi; i++){
        toplam+=i;

        }
        System.out.println(toplam);

    }
}
