package org.enes.lesson03;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {

        /**
         * questin11 in devamı
         */
        /**
         * telefonkod mailkod başlangıc değerlerini biz kendimiz atayacağız (int)
         * daha sonra dışarıdan birtane telefon kodu alacağız bir tanede mail için koda
         * alacağız ikiside dogru ise ikiside doğru
         * sisteme kayıt oldunuz telefon dogru email yanlış ise =>
         * email kodu hatalıdır email dogru telefon yanlış ise => telefon kdou hatalıdır
         * ikiside yanlış ise => telefon ve email kodu hatalıdır
         */
        int m=10;
        int t=12;
        System.out.println("Telefon kodu giriniz");
        int telKod=new Scanner(System.in).nextInt();
        System.out.println("Mail kodu giriniz");
        int mailKod=new Scanner(System.in).nextInt();


        if (mailKod==m && telKod==t){
            System.out.println("Telefon ve mail doğru");
        }else if (mailKod!=m && telKod==t){
            System.out.println("Mail kodu hatalı");
        }else if (mailKod==m && telKod!=t){
            System.out.println("Telefon kodu hatalıdır");
        }else {
            System.out.println("Telefon kodu ve mail kodu hatalıdır");
        }


    }
}
