package org.enes.lesson31;
/*
    B�lme i�lemi i�in bir metot yazal�m 2 tane say� alal�m
    b�lme i�lemi sonucunu bulmaya �al��al�m e�er hata var ise hatay� yazd�ral�m.
 */

import java.util.Scanner;

public class TryCatchOrnek2 {
    static Scanner sc=new Scanner(System.in);
    public static int bolme(int bolunen,int bolen){
        return bolunen/bolen;
    }

    public static void bolmeDisaridan(){
        boolean kontrol=false;
        do {
            try {
                System.out.println("1. say�y� giriniz.");
                int bolunen=sc.nextInt();
                System.out.println("2. say�y� giriniz");
                int bolen=sc.nextInt();
                int bolum=bolunen/bolen;
                System.out.println("Sonu�...:"+bolum);
                kontrol=true;
            }catch (ArithmeticException e){
                System.out.println("Hata olu�tu...:"+e.toString()+"==> Bir say� 0 a b�l�nmez.");
            }catch (NullPointerException e){
                System.out.println("Hata olu�tu...:"+e.toString()+"==> Bir say� null olamaz.");
            }catch (Exception e){
                System.out.println("Hata olu�tu...:"+e.toString()+"==> genel hata.");
            }

        }while (!kontrol);

    }

    public static void bolme2(Integer bolunen,Integer bolen){
        int bolum=bolunen/bolen;
        if (bolen==0){
            throw new ArithmeticException("Bir say� 0 a b�l�nemez.");
        }else if (bolen==null || bolunen==null){
            throw new NullPointerException("Say�lar null olamaz.");
        }

        System.out.println("Sonu�...:"+bolum);
    }



    public static void main(String[] args) {

        bolme2(10,0);
//        bolmeDisaridan();
    }
}
