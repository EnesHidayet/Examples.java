package org.enes.lesson21.utility;

import org.enes.lesson21.entity.Kullanici;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
//    public static Kullanici[] kullanicilar=new Kullanici[15];

    public static List<Kullanici> kullanicilar=new ArrayList<>();
    public static int index;

//    public static void defaultKullanici(){
//        Kullanici kullanici=new Kullanici(index+1,"Enes","eha","123456");
//        kullanicilar[index]=kullanici;
//        index++;
//        Kullanici kullanici1=new Kullanici(index+1,"Ali","xAli","654321");
//        kullanicilar[index]=kullanici1;
//        index++;
//        Kullanici kullanici2=new Kullanici(index+1,"Mehmet","memo","159987");
//        kullanicilar[index]=kullanici2;
//        index++;
//    }

//    public static boolean kullaniciEkle(Kullanici kullanici){
//        kullanici.setId(index+1);
//        kullanicilar[index]=kullanici;
//        index++;
//        return true;
//    }

//    public static Kullanici kullaniciAdiveSifreIleKullaniciGetir(String kullaniciAdi, String sifre) {
//        for (int i=0;i<index;i++){
//            if (kullanicilar[i].getPassword().equals(sifre) && kullanicilar[i].getUsername().equals(kullaniciAdi)){
//                return kullanicilar[i];
//            }
//        }
//        return null;
//    }

//    public static Kullanici kullaniciAdiIleKullaniciGetir(String kullaniciAdi) {
//        for (int i=0;i<index;i++){
//            if (kullanicilar[i].getUsername().equals(kullaniciAdi)){
//                return kullanicilar[i];
//            }
//        }
//        return null;
//    }

//    public static Kullanici[] kullanicilariGetir() {
//        Kullanici [] kullaniciListesi=new Kullanici[index];
//
//        for (int i=0;i<index;i++){
//            kullaniciListesi[i]=kullanicilar[i];
//        }
//        return kullaniciListesi;
//    }
}
