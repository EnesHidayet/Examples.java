package org.enes.lesson02;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        /**
         * Bir ürün fiyatında %18 kdv %15 kar payı olduğunu biliyoruz bu ürünün son fiyatı elimizde olsun
         * daha sonra bu ürün fiyatı üzerinden ürünün ham fiyatı ve kdvsiz fiyatını bulalım.
         */

        double fiyat,hamfiyat,kdvsiz;
        System.out.println("Ürün fiyatı giriniz...:");
        Scanner sc=new Scanner(System.in);
        fiyat=sc.nextDouble();

        kdvsiz = fiyat * 0.82;
        System.out.println("Kdvsiz fiyat...:"+kdvsiz);

        //ctrl + d aşağı doğru çoğaltma kısayolu.
        //ctrl + d aşağı doğru çoğaltma kısayolu.

        hamfiyat=kdvsiz * 0.85;
        System.out.println("Ham fiyat...:"+hamfiyat);

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen isim giriniz");
        String isim= scanner.nextLine();
        String soyisim= scanner.nextLine();
        System.out.println("isim="+isim+" "+soyisim);
        System.out.println("double değer girin");
        double sayi1=scanner.nextDouble();
        System.out.println("bir int değer giriniz");
        int sayi2=scanner.nextInt();
          //nextint,double,long gibi sayı değerleri alındıktan sonra string ifade alınacaksa bir boş nextline alınmak zorunda.
        System.out.println("Bir ülke ismi giriniz");
        scanner.nextLine();
        String ulke=scanner.nextLine(); // burayı sormadan atlıyor bugı var bir sayı değerinden sonra string almak istersen buga sokuyor
        //bu sorunun yaşanmaması için boş bir nextline ekleyerek çalıştırıyoruz sorun ortadan kalkıyor
        System.out.println(ulke);
        System.out.println("Bir long değer giriniz");
        long sayi3= scanner.nextLong();
        System.out.println(sayi3);




    }
}
