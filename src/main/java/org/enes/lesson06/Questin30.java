package org.enes.lesson06;

import java.util.Scanner;

public class Questin30 {
    public static void main(String[] args) {
        /**
         * 29 daki sorunun aynını switch...case il çözmeye çalışıyoruz
         */
        System.out.println("İban giriniz...:");

        Scanner sc=new Scanner(System.in);
        String iban=sc.nextLine().trim();

        String kontrol=iban.substring(0,iban.indexOf(" "));
        String bankaNo=iban.substring(iban.lastIndexOf(iban.length())-4);
        switch (kontrol){

            case "TR":
                System.out.println("Yurt içi işlemler");

            switch (bankaNo){
            case "5001":
                System.out.println("Ziraat");
                break;
            case "5002":
                System.out.println("Garanti");
                break;
            case "5003":
                System.out.println("İş");
                break;
                default:
                    System.out.println("Yurt içi Diğer");
            }

                break;
            case "OTH":
                switch (bankaNo){
                    case "2000":
                        System.out.println("Kıta içi"+iban.replace("OTH","Ki"));
                        break;
                    default:
                        System.out.println("Kıta dışı"+iban.replace("OTH","Kd"));
                }
                break;
            default:
                System.out.println("Düzgün iban gir");
                break;
        }
    }

}
