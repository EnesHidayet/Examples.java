package org.enes.lesson29.streamOgrenciOrnek;

public class Test {
    public static void main(String[] args) {

        OgrenciManager ogrenciManager=new OgrenciManager();
        ogrenciManager.baslangicVerisi();
//        ogrenciManager.okulOrt3();
//        System.out.println(ogrenciManager.ellidenKucukOrt());
        ogrenciManager.randomNotEkle();
        System.out.println("**********************************************");
        ogrenciManager.ogrenciler.forEach(System.out::println);
        ogrenciManager.puanEkle();
        System.out.println("**********************************************");
        ogrenciManager.ogrenciler.forEach(System.out::println);

    }
}
