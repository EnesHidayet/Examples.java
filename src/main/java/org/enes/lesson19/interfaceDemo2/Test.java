package org.enes.lesson19.interfaceDemo2;
/*
Bir araç sýnýgýmýz olsun
Daha sonra uçak otomobil kamyon gemi gibi sýnýflarýmýzýda oluþturalým
gerekirse bu sýnýflara altsýnýflar veya ust sýnýflar oluþturabilirsiniz
hýzlanma yavaþlama gibi metotlarýmýz olsun
kalkýþ yap, iniþ yap, yelken aç limana yanas sur(kara taþýtlarý için geçerli) gibi metotlarýmýz olsun
bazý araclar yuk taþýyabilsinler bunun için yuk al yuk boþalt metotlarý olsun
bu uygulamayý oluþtururken özellikle interfacelerden yararlanalým.
 *///getClass().getSimpleName()+bu yapý içinde bulunduðu sýnýfýn ismini yazdýrýr.

import org.w3c.dom.ls.LSOutput;

import static jdk.internal.reflect.Reflection.getCallerClass;

public class Test {

    public static void main(String[] args) {

        Arac arac=new Arac(50);
        Otomobil otomobil=new Otomobil(100,"Opel");
        Gemi gemi=new Gemi(25,100);
        Ucak ucak=new Ucak(750,4);
        Kamyon kamyon=new Kamyon(85,12);

        arac.hizlan();
        otomobil.drifYap();

        ucak.kalkis();
        kamyon.yukBosalt();
        kamyon.dingilAyari();
        gemi.yukAl();
        gemi.yukBosalt();
        kamyon.yukBosalt();
        kamyon.yukAl();

        yukAlin(kamyon);
        yukTeslimEt(gemi);

        yukAl2(kamyon);
        yukTeslimEt2(gemi);


    }

    static void yukAlin(Object object){
        System.out.println(object+" yük aldý.");
    }

    static void yukTeslimEt(Object object){
        System.out.println(object+" yük aldý.");
    }


    public static void yukAl2(IYukAlanlar tasit){
        tasit.yukAl();
    }
    public static void yukTeslimEt2(IYukAlanlar tasit){
        tasit.yukBosalt();
    }

}
