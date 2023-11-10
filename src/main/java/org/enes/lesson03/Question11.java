package org.enes.lesson03;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {

        /**
         * telefonkod mailkod başlangıc değerlerini biz kendimiz atayacağız (int)
         *  daha sonra dışarıdan birtane telefon kodu alacağız bir tanede mail için koda
         *  alacağız
         *  eğer telefon kodu hatalı ise tel kodu hatalı çıktısı verelim
         *  eğer mail kodu hatalı ise telefon kodu hatalı çıktısını verelim
         *  2- mail dogru ise mail kodu doğru tel doğru ise tel kodu doğru yazdır
         */

        int m=10;
        int t=12;
        System.out.println("Telefon kodu giriniz");
        int telKod=new Scanner(System.in).nextInt();
        System.out.println("Mail kodu giriniz");
        int mailKod=new Scanner(System.in).nextInt();

        if(mailKod!=m){
            System.out.println("Mail kodu hatalı");
        }else{
            System.out.println("Mail kodu doğru");
        }

        if (telKod!=12){
            System.out.println("Telefon kodu hatalı");
        }else{
            System.out.println("Telefon kodu doğru");
        }




    }
}
