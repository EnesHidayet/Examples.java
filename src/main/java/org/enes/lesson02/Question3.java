package org.enes.lesson02;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

        /**
         * dışarıdan bir isim ve doğum yılı al daha sonra Enes 26 yaşında Ehliyet alabilir veya Enes 17 yaşında ehliyet alamaz
         * 18 den büyükse alabilir if else kullanmadan yapalım
         */

        Scanner sc= new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz...:");
        int dogumYili=sc.nextInt();
        Scanner sc1= new Scanner(System.in);
        System.out.println("Adınızı giriniz...:");
        sc.nextLine();
        String ad=sc1.nextLine();
        int yas= 2023-dogumYili;
        //boolean sonuc=yas>=18;
        //System.out.println(ad+" "+"Ehliyet alabilir mi?...:"+sonuc);
        //Tenary kullanım
        String sonuc = (yas >= 18) ? "ehliyet alabilir" : "ehliyet alamaz"; //bu yapıya çalış. iki noktadan öncesi doğru sonrası yanlış
        System.out.println(ad+" "+ yas+" "+"yaşında "+sonuc);


    }
}
