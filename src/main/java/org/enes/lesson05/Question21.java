package org.enes.lesson05;

import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        /**
         * dışarıdan girilen 0 ile 100 arasındaki (100 dahil) 5 adet sayıdan en büyük ve en küçük olanı bulup ekrana yazdıralım
         */

        int max=Integer.MIN_VALUE;//-1
        int min=Integer.MAX_VALUE;//101 yazılabilirdi soru yüzünden
        System.out.println("5 adet sayı giriniz...:");


        for (int i=0;i<5;i++){
            int sayi=new Scanner(System.in).nextInt();
            if (sayi>100 || sayi<0){
                System.out.println("Lütfen 0 ile 100 arasında değer giriniz");
                i--;
            }
            if (sayi>max && sayi<101){

                max=sayi;

            }
            if (sayi<min && sayi>0){

                min=sayi;

            }


        }
        System.out.println("Max...:"+max);
        System.out.println("Min...:"+min);

    }
}
