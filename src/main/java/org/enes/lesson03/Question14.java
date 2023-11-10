package org.enes.lesson03;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        /**
         * switch...case yapısı
         * pizza boyut seçimi yapıcaz dışardan boyutlarını
         * S KÜÇÜK BOY SEÇTİNİZ
         * ,M
         * ORTA BOY SEÇTİNİZ,L
         * BÜYÜK BOY SEÇTİNİZ,
         * XL EKSTRA BOY SEÇTİNİZ
         * BUNLAR DIŞINDA BİR DEĞER GİRDİYSEK YANLIŞ SEÇİM YAPTINIZ ÇIKTISI VERSİN
         */


            //Scanner sc = new Scanner(System.in);
            //String secim;
            //do {
            //System.out.println("Lütfen bir pizza boyutu seçiniz");
            //secim = sc.nextLine();

            //}while (secim!="S" || secim!="M" || secim!="L" || secim!="XL");

            //switch (secim) {
                //case "S":
                    //System.out.println("Küçük boy pizza seçtiniz");
                    //break;
                //case "M":
                    //System.out.println("Orta boy pizza seçtiniz");
                    //break;
                //case "L":
                    //System.out.println("Büyük boy pizza seçtiniz");
                    //break;
                //case "XL":
                    //System.out.println("Ekstra büyük pizza seçtiniz");
                    //break;
                //default:
           // } yukarıda döngüsüz olarak verildi


            boolean kontrol=true;

            while(kontrol){
                kontrol=false;
                 Scanner sc = new Scanner(System.in);
                String secim;

                 System.out.println("Lütfen bir pizza boyutu seçiniz");
                 secim = sc.nextLine();


                switch (secim) {
                    case "S":
                        System.out.println("Küçük boy pizza seçtiniz");
                        break;
                    case "M":
                        System.out.println("Orta boy pizza seçtiniz");
                        break;
                    case "L":
                        System.out.println("Büyük boy pizza seçtiniz");
                        break;
                    case "XL":
                        System.out.println("Ekstra büyük pizza seçtiniz");
                        break;
                    default:
                        System.out.println("Yanlış seçim yaptınız");
                        kontrol=true;
                }


            }








    }
}
