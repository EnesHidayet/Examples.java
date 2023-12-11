package org.enes.lesson34;

import java.util.Scanner;

public class Utility {
    static Scanner sc=new Scanner(System.in);

    /**
     * int deðer alma metodu --> kullanýcýya ne için deðer aldýðýný göstersin ve aldýðý int deðer geri döndürsün
     */

    public static int intDegerAl(String sorgu){
        boolean kontrol=false;
        int value=0;
        do {
            try {
                System.out.println(sorgu);
                value=sc.nextInt();
                kontrol=false;
            }catch (Exception e){
                System.out.println(e.toString()+" : Lütfen bir sayýsal deðer giriniz.");
                kontrol=true;
            }
            finally {
                sc.nextLine();
            }
        }while (kontrol);
        return value;
    }

    public static double doubleDegerAl(String sorgu){
        boolean kontrol=false;
        double value=0;
        do {
            try {
                System.out.println(sorgu);
                value=sc.nextDouble();
                kontrol=false;
            }catch (Exception e){
                System.out.println(e.toString()+" : Lütfen bir sayýsal deðer giriniz.");
                kontrol=true;
            }
            finally {
                sc.nextLine();
            }
        }while (kontrol);
        return value;
    }

    public static long longDegerAl(String sorgu){
        boolean kontrol=false;
        long value=0;
        do {
            try {
                System.out.println(sorgu);
                value=sc.nextLong();
                kontrol=false;
            }catch (Exception e){
                System.out.println(e.toString()+" : Lütfen bir sayýsal deðer giriniz.");
                kontrol=true;
            }
            finally {
                sc.nextLine();
            }
        }while (kontrol);
        return value;
    }

    public static String stringDegerAl(String sorgu){
        System.out.println(sorgu);
        return sc.nextLine();
    }

}
