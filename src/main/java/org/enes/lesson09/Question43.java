package org.enes.lesson09;

import java.util.Scanner;

public class Question43 {
    /**
     * d��ar�dan 2 say� al�caz en b�y�k ortak b�lenini bulucaz (ebob) bir metot yaz�p bulal�m
     * daha sonra mainde en k���k ortak kat� bulal�m
     * ekok=(s1*s2) / ebob
     */
    public static void main(String[] args) {
        System.out.println("L�tfen 1. say�y� giriniz...:");
        int s1=new Scanner(System.in).nextInt();

        System.out.println("L�tfen 2. say�y� giriniz...:");
        int s2=new Scanner(System.in).nextInt();
        System.out.println("Ebob...:"+ebob(s1,s2));

        System.out.println("Ekok...:"+(s1*s2)/ebob(s1,s2));

        System.out.println();
        int ebob2=ebobbul();
        System.out.println("Ebob...:"+ebob2);

    }

    public static int ebob (int s1,int s2){
        int ebob=0;
        int kucuk;
        if (s1==s2){
         ebob=s1; return ebob;
        }else if (s1<s2){
            kucuk=s1;
        }else
            kucuk=s2;

       for (int i=1;i<kucuk;i++){
           if (s1%i==0 && s2%i==0){
               ebob=i;
           }
       }
          return ebob;
    }


    public static int ebobbul(){
        System.out.println("L�tfen 1. say�y� giriniz...:");
        int s1=new Scanner(System.in).nextInt();

        System.out.println("L�tfen 2. say�y� giriniz...:");
        int s2=new Scanner(System.in).nextInt();

        int ebob=0;
        int kucuk;
        if (s1==s2){
            ebob=s1; return ebob;
        }else if (s1<s2){
            kucuk=s1;
        }else
            kucuk=s2;

        while (kucuk>0){
            if (s1%kucuk==0 && s2%kucuk==0){
                ebob=kucuk;
                break;
            }
                kucuk--;
        }
        return ebob;
    }


}
