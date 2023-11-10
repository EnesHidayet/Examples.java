package org.enes.lesson14.kutuphaneApp;

public class Kutuphane {

    public static Kitap [] kitapS=new Kitap[5];
    public static Yazar [] yazarS=new Yazar[10];

    public static int kitapIndex;
    public static int yazarIndex;


    /**
     * Array boyutunu kontrol eden bir metot array sýnýra ulaþmýþsa
     * 10 ar 10 ar array boyutunu arttýrýyor
     */
    public static void arrayBoyutKontrol(){
        System.out.println("Array boyutu kontrol ediliyor.");

        if (kitapIndex==kitapS.length-1){
            Kitap [] temp=new Kitap[kitapS.length+10];
            for (int i=0;i<kitapS.length;i++){
                temp[i]=kitapS[i];
            }
            kitapS=temp;
        }

    }

}
