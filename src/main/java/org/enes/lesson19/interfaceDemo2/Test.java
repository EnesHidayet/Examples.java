package org.enes.lesson19.interfaceDemo2;
/*
Bir ara� s�n�g�m�z olsun
Daha sonra u�ak otomobil kamyon gemi gibi s�n�flar�m�z�da olu�tural�m
gerekirse bu s�n�flara alts�n�flar veya ust s�n�flar olu�turabilirsiniz
h�zlanma yava�lama gibi metotlar�m�z olsun
kalk�� yap, ini� yap, yelken a� limana yanas sur(kara ta��tlar� i�in ge�erli) gibi metotlar�m�z olsun
baz� araclar yuk ta��yabilsinler bunun i�in yuk al yuk bo�alt metotlar� olsun
bu uygulamay� olu�tururken �zellikle interfacelerden yararlanal�m.
 *///getClass().getSimpleName()+bu yap� i�inde bulundu�u s�n�f�n ismini yazd�r�r.

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
        System.out.println(object+" y�k ald�.");
    }

    static void yukTeslimEt(Object object){
        System.out.println(object+" y�k ald�.");
    }


    public static void yukAl2(IYukAlanlar tasit){
        tasit.yukAl();
    }
    public static void yukTeslimEt2(IYukAlanlar tasit){
        tasit.yukBosalt();
    }

}
