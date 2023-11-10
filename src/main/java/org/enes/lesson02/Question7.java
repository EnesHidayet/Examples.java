package org.enes.lesson02;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {

        /**
         * dışarıdan girilen bir sayının faktöriyelini hesaplayalım.
         */


        int sayi,faktoriyel=1;
        System.out.println("Faktöriyelinin alınmasını istediğiniz sayıyı giriniz...:");
        Scanner sc=new Scanner(System.in);
        sayi=sc.nextInt();
        for (int i=1;i<=sayi;i++)
        {
            faktoriyel*=i;
        }
        System.out.println(sayi+"!="+faktoriyel);

        int a=1;
        faktoriyel=1;
        while (a<=sayi)
        {
            faktoriyel*=a;
            a++;
        }
        System.out.println(sayi+"!="+faktoriyel);



    }
}
