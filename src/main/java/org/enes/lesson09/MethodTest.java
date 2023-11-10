package org.enes.lesson09;

public class MethodTest {
    public static void main(String[] args) {

        metot1();
        System.out.println("////////////////////////////////////////");
        int sonuc=metot2();

        System.out.println(sonuc);
        System.out.println("////////////////////////////////////////");
        metot3("Enes",1997);

        System.out.println();

        String  isim="Enes";
        int dogumYili=1997;
        metot3(isim,dogumYili);

        System.out.println();
        System.out.println("///////////////////////////////////////");
        System.out.println(metot4("Enes",1997));

    }

    public static void metot1(){
        int sayi1=5;
        int sayi2=15;
        int sonuc=sayi1-sayi2;
        System.out.println("Metot bir çalýþtý"+sonuc);
    }


    public static int metot2(){
        int sayi1=5;
        int sayi2=15;
        int sonuc=sayi1-sayi2;
        System.out.println("Metot iki çalýþtý");
        return sonuc;
    }


    public static void metot3(String isim, int dogumYili){
        System.out.println("Metot 3 çalýþtý");
        System.out.println(isim+" adlý kullanýcýnýn yaþý ===>"+(2023-dogumYili));

    }

    public static String  metot4(String isim, int dogumYili){
        System.out.println("Metot 4 çalýþtý");
       return isim+" adlý kullanýcýnýn yaþý ===>"+(2023-dogumYili);
    }

//    public static void metot5(MethodTest test){
//
//    }


}
