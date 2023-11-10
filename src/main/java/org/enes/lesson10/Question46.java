package org.enes.lesson10;

import java.util.Scanner;

public class Question46 {
    public static void main(String[] args) {

        String [] dizi= {"T�rkiye","Japonya","Danimarka","Fransa"};

        /**
         * 1- Bir string de�er alan method yaz�n
         * 2- iki stringin kar��la�t�r�p do�ru olup olmad���n� d�nen bir metot istiyorum
         * 3- metotda girdi�imiz degerin asl�nda dizimizde olup olmad���n� s�yleyen bir method
         */


        System.out.println(strGiris("String de�er giriniz..."));
        System.out.println("Sonu�...:"+strKarsilastir());
        System.out.println( varMi(dizi));

    }


    public static String strGiris(String yazi){
        System.out.println(yazi);
        String ifade=new Scanner(System.in).nextLine();

        return ifade;
    }

    public static boolean strKarsilastir(){
        String str=strGiris("Kar��la�t�rmak istedi�iniz ifadeyi giriniz...:");
        String str2=strGiris("Kar��la�t�rmak istedi�iniz 2. ifadeyi giriniz...:");
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

        String karsilastirma=strGiris("Arad���n�z ifadeyi giriniz...:");

        for (int i=0;i<dizi.length;i++){

            if (karsilastirma.equalsIgnoreCase(dizi[i])){
                return "Kelime bulundu...:";
            }

        }
        return "Kelime bulunamad�...:";
    }


}
