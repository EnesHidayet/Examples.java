package org.enes.lesson08;

import java.util.Scanner;

public class Question38 {
    public static void main(String[] args) {

        System.out.println("Baþlangýç deðeri giriniz...:");
        int baslangic=new Scanner(System.in).nextInt();
        System.out.println("Bitiþ deðeri giriniz...:");
        int bitis=new Scanner(System.in).nextInt();
        int sayac=0;
        String [] array=new String[bitis-baslangic+1];

        for (int i=baslangic;i<=bitis;i++){
            if (i%3==0 && i%5==0){
                array[sayac]="bilgeadam";

            }else if (i%3==0){
                array[sayac]="bilge";

            }else if (i%5==0){
                array[sayac]="adam";

            }else {
                array[sayac] = Integer.toString(i);

            }
                sayac++;
        }

        for (int i=0;i<array.length;i++){

                System.out.print(array[i]+",");

        }

    }
}
