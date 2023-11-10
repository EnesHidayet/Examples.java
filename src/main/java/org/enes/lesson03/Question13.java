package org.enes.lesson03;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        /**
         * klavyeden 0 girilenceye kadar sayı okumaya devam edeceğiz 0 girildiğinde sayıların toplamını ve ortalamasını
         * ekrana yazdırıcaz
         */
        System.out.println("do while");

        int s1,i=0,toplam=0;
        int ort=0;

         do {
             System.out.println("Sayı giriniz");
             s1 = new Scanner(System.in).nextInt();
             toplam+=s1;
             i++;
        }while (s1!=0);
         if (i==1){
             System.out.println("işlem yapmak için 0 dan başka sayı giriniz");
         }else
         {
        ort=toplam/(i-1);
             System.out.println("Girilen sayıların toplamı "+toplam+" ortalaması "+ort);
         }

         i=0;
         toplam=0;
         ort=0;




         //while ile çözüm

        System.out.println("while 1");

        s1=new Scanner(System.in).nextInt();
         while (s1!=0){
             toplam+=s1;
             i++;
             System.out.println("Sayı giriniz");
             s1=new Scanner(System.in).nextInt();

         }
         if (i==0){
             System.out.println("işlem yapmak için 0 dan başka sayı giriniz");
         }else{
             ort=toplam/i;
             System.out.println("Girilen sayıların toplamı "+toplam+" ortalaması "+ort);
         }



         //farklı bir while çözümü

        System.out.println("while 2");
        i=0;
        toplam=0;
        ort=0;
        boolean kontrol=true;

        while (kontrol){
            System.out.println("Sayı giriniz");
            s1=new Scanner(System.in).nextInt();
            if (s1==0){
                kontrol=false;
                i--;
            }
            toplam+=s1;
            i++;

        }if (i ==0) {
            System.out.println("işlem yapmak için 0 dan başka sayı giriniz");
        }else {
            ort=toplam/i;
            System.out.println("Girilen sayıların toplamı "+toplam+" ortalaması "+ort);
        }


        //while true çözümü

        i=0;
        toplam=0;
        ort=0;


        System.out.println("while true");
        while (true) {
            System.out.println("Sayı giriniz");
            s1 = new Scanner(System.in).nextInt();
            if (s1 == 0) {
                break; //döngüyü kırmak için bu komut
            }
            toplam += s1;
            i++;
        }
        if (i ==0) {
            System.out.println("işlem yapmak için 0 dan başka sayı giriniz");
        }else {
            ort=toplam/i;
            System.out.println("Girilen sayıların toplamı "+toplam+" ortalaması "+ort);
        }





    }
}
