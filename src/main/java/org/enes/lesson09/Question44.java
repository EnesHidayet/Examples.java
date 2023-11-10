package org.enes.lesson09;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Dýþarýdan bir dizi boyutu giriceðiz daha sonra bu diziye rastgele sayýlar üretip atayacaðýz ve elemanlarýnýn ortalamasýný bulucaz...
 */
public class Question44 {
    public static void main(String[] args) {
            //rastgele sayý üretme örnekleri...
        Random random=new Random ();
        int sayi=random.nextInt(3);
        int sayi2=random.nextInt(3,13);
        System.out.println(sayi);
        System.out.println(sayi2);
        double sayi3=random.nextDouble(5);
        System.out.println(sayi3);
        long sayi4=random.nextLong(120);
        System.out.println(sayi4);
        float sayi5=random.nextFloat(260);
        System.out.println(sayi5);
        //byte sayi6=random.nextBytes();

        boolean kontrol=random.nextBoolean();
        System.out.println(kontrol);
        System.out.println("*************************");
        double [] array=diziOlustur();
        arrayDoldur(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Ortalama...:"+ortalama(array));

    }

    public static double[] diziOlustur(){
        System.out.println("Dizi boyutu giriniz...:");
        int diziBoyutu=new Scanner(System.in).nextInt();

        double [] dizi=new double[diziBoyutu];

       return dizi;

    }

    public static double rastGeleSayiUret(){
        Random random=new Random();
        return random.nextDouble(500);
    }

    public static void arrayDoldur(double [] array){
        for (int i=0;i<array.length;i++){
            array[i]=rastGeleSayiUret();
        }
    }

    public static double ortalama(double[] array){
        int toplam=0;
        for (int i=0;i<array.length;i++){
            toplam+=array[i];
        }
        return toplam/array.length;
    }



}
