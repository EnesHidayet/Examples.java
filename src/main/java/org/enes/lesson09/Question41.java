package org.enes.lesson09;

import java.util.Scanner;

public class Question41 {
    public static void main(String[] args) {
        System.out.println("Array için sayý giriniz.");
        int s1=new Scanner(System.in).nextInt();
        System.out.println("Array için sayý giriniz.");
        int s2=new Scanner(System.in).nextInt();
        System.out.println(elemanCarpan(s1,s2));

    }

    /**
     * bir metot yazacaðýz bu metot bize dýþarýdan bir sayý alýp bir arraye atacak daha sonra
     * arrayin ilk iki elemanýnýn çarpýmýný dönücek
     */

    public static int elemanCarpan (int s1,int s2){
        int [] array={s1,s2};

        int sonuc= array[0]*array[1];

        return sonuc;

    }



}
