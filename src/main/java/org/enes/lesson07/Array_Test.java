package org.enes.lesson07;

public class Array_Test {
    public static void main(String[] args) {

        int [] sayilar={1,2,4,5};
        int [] sayilar2=new int[4];
        sayilar2[0]=4;
        sayilar2[1]=7;
        sayilar2[2]=17;
        sayilar2[3]=57;

        System.out.println(sayilar2[2]);
        System.out.println(sayilar[3]);
        //arrayin boyutu d���nda kald��� i�in hata verir arrayler tan�mland��� anda boyut kazan�r.
        //arraylerin boyutlar� sabittir.
        //sayilar2[4]=96; // sayilar2nin boyutu 4 0 dan ba�lad��� i�in 4 yazarsak boyutu a�t�n der

        //a�a��daki bu i�lemle array boyutu de�i�mez yeni bir array tan�mlam�� gibi olur
        //System.out.println(sayilar2);
        //sayilar2=new int[6]; bellekte yeni bir array olu�turdu
        //System.out.println(sayilar2);

        int sayilar3[]=new int[5];//bu �ekilde de bir tan�mlama yap�labilir.
        int []sayilar4;

        //arraylare atama yapmadan �nce boyut kazand�rmak zorunday�z
        //int sayilar4[0]=5;//bu hata olur

        int [] sayilar6={5,7,98,120,56};
        String [] array=new String[4];
        boolean [] array2=new boolean[6];
        Array_Test [] array3=new Array_Test[4];
        long [] array4=new long[5];
        System.out.println(array[0]);
        System.out.println(array2[0]);
        System.out.println(array4[0]);
        //int long double
        char[] array5=new char[3];
        System.out.println((int) array5[0]);
        byte [] array6=new byte[3];
        System.out.println(array6[0]);

        Integer [] array7=new Integer[5];
        System.out.println(array7[0]);




    }
}
