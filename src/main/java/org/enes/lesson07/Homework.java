package org.enes.lesson07;

public class Homework {
    public static void main(String[] args) {
        /**
         * adana adl� �ehrin plaka kodu :01
         * ad�yaman adl� �ehrin plaka kodu:02
         * gibi ��kt� al�caz
         */
        String sehirler = "01-Adana;02-Ad�yaman;03-Afyonkarahisar;04-A�r�;05-Amasya;06-Ankara;"
                + "07-Antalya;08-Artvin;09-Ayd�n;10-Bal�kesir;42-Konya";


        String[] array=sehirler.split(";");
        // array [0] = 01 Adana;
        // array [1] = 02 Ad�yaman;

        for (int i=0;i<array.length;i++){

            int index= array[i].indexOf('-');
            System.out.println(array[i].substring(index+1)+" adl� �ehrin plaka kodu "+array[i].substring(0,index));

        }




    }//main
}//class
