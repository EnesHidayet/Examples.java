package org.enes.lesson04;

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {

        /**
         * iki tane sayı değişkenimiz olsun ve dışarıdan bir işlem seçelin (top,böl,çarp,çık)
         * +-/* ile kontrol edicem dışarıdan seçtiğimiz işlemi yapacak
         */
        double s1,s2;
        System.out.println("1. sayıyı girin");
        s1=new Scanner(System.in).nextDouble();
        System.out.println("2. sayıyı girin");
        s2=new Scanner(System.in).nextInt();
        System.out.println("işlem için ifade girin +,-,/,* gibi");
        //scanner.nextLine(); yaparak burada çıkabilen hatalardan korunuyoruz
        Scanner sc=new Scanner(System.in);
        String islem=sc.nextLine();
        //scanner.next() scanner.nextLine() arasındaki fark next boşluğa kadar olan kelimeyi alır nextline tüm cümleyi alır
        switch (islem){
            case "+": double toplam=s1+s2;
                System.out.println("Toplama yaptınız sonuç...:"+toplam);break;
            case "-": double cikart=s1-s2;
                System.out.println("Çıkartma yaptınız sonuç...:"+cikart); break;
            case "/": double bolme=s1/s2;
                System.out.println("Bölme yaptınız sonuç...:"+bolme); break;
            case "*": double carpma=s1*s2;
                System.out.println("Bölme yaptınız sonuç...:"+carpma); break;
            default:
                System.out.println("Geçerli bir işlem seçiniz");

        }


    }
}
