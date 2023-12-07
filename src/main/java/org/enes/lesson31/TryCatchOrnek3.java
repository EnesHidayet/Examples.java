package org.enes.lesson31;

import java.util.Scanner;
import java.util.SortedSet;

/*
    1-bir metot yazal�m d��ar�dan index de�eri als�n ve o indexteki de�eri yazd�ral�m e�er hata varsa
    hatay� yakalay�p yazd�ral�m

    2-array �zerinde gezerken toplayabildi�imiz say�lar� toplay�p toplam de�i�kenine ekleyelim ve bir toplam sonucu bulal�m
    ayr�ca bir sayac ile hata say�s�n� tutal�m.D�ng� sonunda toplam ve hata say�s�n� yazd�ral�m.

    3- i�ine string de�er ve null olup olmad���n� d�nene nullsa hata d�nen bir metot yazal�m sonra String sonuc ifadesine stringleri ekleyelim
 */
public class TryCatchOrnek3 {

//    public static void indexAl(String [] array,int index) {
//        String value = array[index];
//        System.out.println("De�eriniz...:" + value);
//
//        if (value==null){
//            throw new NullPointerException("De�er null");
//        } else if (index>array.length||index<0) {
//            throw new ArrayIndexOutOfBoundsException("�ndex arrayin s�n�rlar�n� a�t�");
//        }
//
//
//    }

    public static void indextekiDegeriYazdir(String [] array,int index) {
        boolean kontrol=false;
        try {
            System.out.println(array[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage()+"(L�tfen 0 ile )"+(array.length-1)+" de�erleri aras�nda bir de�er giriniz.");
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
                System.out.println("Say� i�ermeyen de�erler toplanamad�."+e.getMessage());
            }
        }
            System.out.println(toplam);
        System.out.println("Al�nan hata say�s�...:"+sayac);
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
                System.out.println("Null hatas�");
            }catch (NumberFormatException e){
                sayac++;
                sonuc+=string;
            }
        }

        System.out.println(sonuc);
        System.out.println("��lem say�s�...:"+sayac);

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
