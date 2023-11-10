package org.enes.lesson09;

import java.util.Random;
import java.util.Scanner;

public class Question45 {
    /**
     * Sayı tahmin oyunu 5 adet hakkımız olsun
     * program başlangıçta bize bir rastgele sayı versin 1 ile 750 arası
     * hakkımız bitene kadar tahminde bulunalım
     * eğer tahmin ettiğimiz sayı üretilen sayıdan büyük ise tahmininizi azaltın
     * eğer tahmin ettiğimiz sayı üretilen sayıdan küçük ise tahmininizi arttıralım
     * eğer bir hakkımızda sayıyı tahmin edebilmişsek program sonlansın
     * eğer edememişsek ve hakkımız bitmişse üzgünüz tahmin hakkınız bitti çıktısı verelim
     * ve önceki tahminlerimizi bir arrayde tutalım oyunu sonunda da tahminleriniz diye yazdıralım
     */

    /*
    sayı tahmin oyunu
    5 adet hakkımız olacak
    program baslangıcata bize rastgele bir sayı üretecek (1 ile 750 arası sayı uretsin)
    hakkımız bitene kadar tahminde bulunacagız
    eger tahmin ettiğimiz sayi uretilen sayıdan buyuk ise tahmininizi azaltın
    eger tahmin ettiğimiz sayi uretilen sayıdan kucuk ise tahmininizi arttıralım
    eger bir hakkımızda sayıyı tahmin edebilmişsek program sonlansın
    eger edememissek ve hakkmız bitmiş ise bir uzgunuz tahmin hakkınız bitti diye bir cıktı verelim
    ve önce ki tahminlermizide bir arrayde tutalım oyun sonunda da tahminleriniz diye yazdıralım

    */


    public static void main(String[] args) {


        int sayi=rastgeleSayi();

        sayiTahminOyunu(sayi);

    }// main


    public static int rastgeleSayi(){
        Random random=new Random();
        return random.nextInt(1,750);
    }


    public static void diziSayar(int [] dizi){
        for (int i=0;i<dizi.length;i++){
            System.out.println("İşte tahminlerin...:"+(i+1)+". tahminin "+dizi[i]);
        }
    }



    public static void sayiTahminOyunu(int sayi){
        int [] sayilar=new int[5];
        int tahmin;

        for (int i=0;i<5;i++) {

            System.out.println("Aklımdan bir sayı tuttum lütfen "+(i+1)+". tahmininizi giriniz.");
            tahmin=new Scanner(System.in).nextInt();
            sayilar[i]=tahmin;
            if (tahmin==sayi){
                System.out.println("Tebrikler aklımdan tuttuğum sayi..."+tahmin+" idi "+ (i+1) + ". tahminde bildin...");
                diziSayar(sayilar);
                break;
            }else if (i==4){
                System.out.println("Üzgünüm tahmin hakkın doldu aklımdan tuttuğum sayı...:"+sayi+" idi");
                diziSayar(sayilar);
            }else if (tahmin<sayi){
                System.out.println("Tahmininizi arttırın...");
            } else if (tahmin>sayi) {
                System.out.println("Tahmininizi azaltın...");
            }

        }
    }




}//class
