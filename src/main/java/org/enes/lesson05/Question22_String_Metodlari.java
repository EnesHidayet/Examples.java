package org.enes.lesson05;

import java.util.Locale;

public class Question22_String_Metodlari {
    public static void main(String[] args) {

        String value="Merhaba Dünya";
        String value2=" Merhaba Dünya ";

        System.out.println(value.lastIndexOf("a"));//ifadenin geçtiği en son nokta
        System.out.println(value.indexOf("a"));// ifadenin ilk noktası
        System.out.println(value.indexOf("x"));// ifade yoksa -1 verir
        System.out.println(value.charAt(1));// 1 deki harf karşılığı gelir indexler 0 dan başlar metin 13 karakter 12 ye kadar gösterir

        System.out.println(value2.trim());// baştaki ve sondaki boşlukları temizler
        System.out.println(value.contains("m"));// metinde bu değer var mı cevabını true false olarak verir
        System.out.println(value.contains("e"));//true
        System.out.println(value.substring(1,7));//erhaba belirlenen aralıktaki ifadeyi alır
        System.out.println(value.substring(1));// son değer girilmezse sonuna kadar gider
        System.out.println(value.toUpperCase());// tüm harfleri büyütür
        System.out.println(value.toLowerCase());// tüm harfleri küçültür
        System.out.println("iş".toUpperCase(Locale.ENGLISH));
        System.out.println(value.replace("a","x")); // harf veya kelime değişikliği yaptırır.
        System.out.println(value.replace("Dünya","Evren"));
        System.out.println(value.equals(value2));// iki metini karşılaştırır aynı ise true dğeilse false değer verir
        System.out.println(value.equals(value2.trim()));
        System.out.println(value==value2.trim());//false == adre kontrol eder equals içerik kontrol eder
        String value3="merhaba dünya";
        System.out.println(value.equalsIgnoreCase(value3));// büyük küçük harf duyarlılığını ortadan kaldırır
        System.out.println(value.endsWith("a")); // bununla mı bitiyor true
        System.out.println(value.endsWith("e")); // bununla mı bitiyor false
        System.out.println(value.startsWith("M")); // bununla mı başlıyor true
        System.out.println(value.startsWith("D")); // bununla mı başlıyor false


        String value6="Java-React-Css";
        String [] array=value6.split("-");// içeri giren ifadeden itibaren bölüp ayrık elemanlar oluşturur.
        for (int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }

        String value7="10";
        System.out.println(5+value7);//510 çıkar çünkü 10 string

        int sayi=Integer.parseInt(value7);//bu içerideki ifadeyi int çevirir değer sayı olmalı
        System.out.println(5+sayi);

    }
}
