package org.enes.lesson07;

public class Homework {
    public static void main(String[] args) {
        /**
         * adana adlý þehrin plaka kodu :01
         * adýyaman adlý þehrin plaka kodu:02
         * gibi çýktý alýcaz
         */
        String sehirler = "01-Adana;02-Adýyaman;03-Afyonkarahisar;04-Aðrý;05-Amasya;06-Ankara;"
                + "07-Antalya;08-Artvin;09-Aydýn;10-Balýkesir;42-Konya";


        String[] array=sehirler.split(";");
        // array [0] = 01 Adana;
        // array [1] = 02 Adýyaman;

        for (int i=0;i<array.length;i++){

            int index= array[i].indexOf('-');
            System.out.println(array[i].substring(index+1)+" adlý þehrin plaka kodu "+array[i].substring(0,index));

        }




    }//main
}//class
