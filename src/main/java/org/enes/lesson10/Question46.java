package org.enes.lesson10;

import java.util.Scanner;

public class Question46 {
    public static void main(String[] args) {

        String [] dizi= {"Türkiye","Japonya","Danimarka","Fransa"};

        /**
         * 1- Bir string deðer alan method yazýn
         * 2- iki stringin karþýlaþtýrýp doðru olup olmadýðýný dönen bir metot istiyorum
         * 3- metotda girdiðimiz degerin aslýnda dizimizde olup olmadýðýný söyleyen bir method
         */


        System.out.println(strGiris("String deðer giriniz..."));
        System.out.println("Sonuç...:"+strKarsilastir());
        System.out.println( varMi(dizi));

    }


    public static String strGiris(String yazi){
        System.out.println(yazi);
        String ifade=new Scanner(System.in).nextLine();

        return ifade;
    }

    public static boolean strKarsilastir(){
        String str=strGiris("Karþýlaþtýrmak istediðiniz ifadeyi giriniz...:");
        String str2=strGiris("Karþýlaþtýrmak istediðiniz 2. ifadeyi giriniz...:");
        boolean kontrol=true;
//        if (str.equals(str2)){
//            return kontrol;
//        }else {
//            kontrol=false;
//            return kontrol;
//        }     //veya

        return str.equalsIgnoreCase(str2);

    }


    public static String varMi(String [] dizi){

        String karsilastirma=strGiris("Aradýðýnýz ifadeyi giriniz...:");

        for (int i=0;i<dizi.length;i++){

            if (karsilastirma.equalsIgnoreCase(dizi[i])){
                return "Kelime bulundu...:";
            }

        }
        return "Kelime bulunamadý...:";
    }


}
