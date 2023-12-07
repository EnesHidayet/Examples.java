package org.enes.lesson31;
/*
    Bölme iþlemi için bir metot yazalým 2 tane sayý alalým
    bölme iþlemi sonucunu bulmaya çalýþalým eðer hata var ise hatayý yazdýralým.
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
                System.out.println("1. sayýyý giriniz.");
                int bolunen=sc.nextInt();
                System.out.println("2. sayýyý giriniz");
                int bolen=sc.nextInt();
                int bolum=bolunen/bolen;
                System.out.println("Sonuç...:"+bolum);
                kontrol=true;
            }catch (ArithmeticException e){
                System.out.println("Hata oluþtu...:"+e.toString()+"==> Bir sayý 0 a bölünmez.");
            }catch (NullPointerException e){
                System.out.println("Hata oluþtu...:"+e.toString()+"==> Bir sayý null olamaz.");
            }catch (Exception e){
                System.out.println("Hata oluþtu...:"+e.toString()+"==> genel hata.");
            }

        }while (!kontrol);

    }

    public static void bolme2(Integer bolunen,Integer bolen){
        int bolum=bolunen/bolen;
        if (bolen==0){
            throw new ArithmeticException("Bir sayý 0 a bölünemez.");
        }else if (bolen==null || bolunen==null){
            throw new NullPointerException("Sayýlar null olamaz.");
        }

        System.out.println("Sonuç...:"+bolum);
    }



    public static void main(String[] args) {

        bolme2(10,0);
//        bolmeDisaridan();
    }
}
