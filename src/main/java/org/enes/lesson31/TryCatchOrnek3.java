package org.enes.lesson31;

import java.util.Scanner;
import java.util.SortedSet;

/*
    1-bir metot yazalım dışarıdan index değeri alsın ve o indexteki değeri yazdıralım eğer hata varsa
    hatayı yakalayıp yazdıralım

    2-array üzerinde gezerken toplayabildiğimiz sayıları toplayıp toplam değişkenine ekleyelim ve bir toplam sonucu bulalım
    ayrıca bir sayac ile hata sayısını tutalım.Döngü sonunda toplam ve hata sayısını yazdıralım.

    3- içine string değer ve null olup olmadığını dönene nullsa hata dönen bir metot yazalım sonra String sonuc ifadesine stringleri ekleyelim
 */
public class TryCatchOrnek3 {

//    public static void indexAl(String [] array,int index) {
//        String value = array[index];
//        System.out.println("Değeriniz...:" + value);
//
//        if (value==null){
//            throw new NullPointerException("Değer null");
//        } else if (index>array.length||index<0) {
//            throw new ArrayIndexOutOfBoundsException("İndex arrayin sınırlarını aştı");
//        }
//
//
//    }

    public static void indextekiDegeriYazdir(String [] array,int index) {
        boolean kontrol=false;
        try {
            System.out.println(array[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage()+"(Lütfen 0 ile )"+(array.length-1)+" değerleri arasında bir değer giriniz.");
        }

        System.out.println("Program devam ediyor");
    }

    public static void toplamaYap(String[]array){
        int toplam=0;
        int sayac=0;

        for (int i=0;i<array.length;i++) {
            try {
                toplam += Integer.parseInt(array[i]);
            } catch (NumberFormatException e) {
                sayac++;
                System.out.println("Sayı içermeyen değerler toplanamadı."+e.getMessage());
            }
        }
            System.out.println(toplam);
        System.out.println("Alınan hata sayısı...:"+sayac);
    }

    public static String nullKontrol(String string){
        if (string==null){
            throw new NullPointerException();
        }else {
            return string;
        }
    }

    public static void toplamaYap2(String[]array){
        int sayac=0;
        int toplam=0;
        String sonuc="";
        String string=null;
        for (int i=0;i< array.length;i++){
            try {
                string=nullKontrol(array[i]);
                toplam += Integer.parseInt(array[i]);

            }catch (NullPointerException e){
                System.out.println("Null hatası");
            }catch (NumberFormatException e){
                sayac++;
                sonuc+=string;
            }
        }

        System.out.println(sonuc);
        System.out.println("İşlem sayısı...:"+sayac);

    }




    public static void main(String[] args) {
        String [] array={null,"30","a","20","abc",null,"50"};

//        indexAl(array,0);

//        indextekiDegeriYazdir(array,1);
//        indextekiDegeriYazdir(array,7);
//        indextekiDegeriYazdir(array,3);
//        toplamaYap(array);
//        toplamaYap2(array);




    }
}
