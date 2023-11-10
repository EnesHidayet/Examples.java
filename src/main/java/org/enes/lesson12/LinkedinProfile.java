package org.enes.lesson12;

public class LinkedinProfile {

    // Veri Alanları (Fields) özellikler
        String isim;
        String soyIsim;
        String avatarUrl;
        String meslek;
        int takipciSayisi;
        String adres;
        boolean calismayaAcikMi;
// String olarak 10 tane bolum tutmak istiyorum ve bolum ekle metoduylada bu bolumleri dolduracağım
        String [] bolumler =new String[10];


        /////////////////Sınıfın davranısları metotlar/////////////////////////

        public    void bolumEkle(String bolum,int index){
            System.out.println("Bolum ekleniyor....");
            bolumler [index]=bolum;
            System.out.println(bolum+"===> eklendi");
        }

        public    void  bolumleriYazdir(){
            for ( String bolum :  bolumler ){
                System.out.println(bolum);
            }
        }

}
