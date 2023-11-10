package org.enes.lesson09;

import java.util.Scanner;

public class Question43 {
    /**
     * dýþarýdan 2 sayý alýcaz en büyük ortak bölenini bulucaz (ebob) bir metot yazýp bulalým
     * daha sonra mainde en küçük ortak katý bulalým
     * ekok=(s1*s2) / ebob
     */
    public static void main(String[] args) {
        System.out.println("Lütfen 1. sayýyý giriniz...:");
        int s1=new Scanner(System.in).nextInt();

        System.out.println("Lütfen 2. sayýyý giriniz...:");
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
        System.out.println("Lütfen 1. sayýyý giriniz...:");
        int s1=new Scanner(System.in).nextInt();

        System.out.println("Lütfen 2. sayýyý giriniz...:");
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
