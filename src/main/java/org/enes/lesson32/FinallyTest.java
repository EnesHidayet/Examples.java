package org.enes.lesson32;

public class FinallyTest {

    public static void main(String[] args) {
        Integer sayi1=null;
        int sayi2=5;
        int sayi3=25;

        try {
            System.out.println("Sonu�...:"+(sayi3/sayi2));
        }catch (Exception e){
            System.out.println(e.toString());
        }finally {
            System.out.println("Finally 1 �al��t�.");
        }

        System.out.println("//////////////////////////////////");

        try {
            System.out.println("Sonu�...:"+(sayi3/sayi1));
        }catch (Exception e){
            System.out.println(e.toString());
        }finally {
            System.out.println("Finally 2 �al��t�.");
        }

        System.out.println("//////////////////////////////////");
        System.out.println(test(1,2));
    }

    public static int test(int sayi1,int sayi2){
        try {
           return sayi1/sayi2;
        }catch (Exception e){
            throw new ArithmeticException();
        }finally {
            System.out.println("Finally 3 �al��t�.");
        }
    }

}
