package org.enes.lesson07;

public class Question37 {
    public static void main(String[] args) {

        /**
         * i�erisinde 1 ve 4 �n ka� kere ge�ti�ini say�p
         * 1 say�s�n�n adeti 4 say�s�n�n adetinden b�y�k ise true de�il ise false yazal�m
         */
        int[] sayilar = { 1,4, 4, 4, 1, 1, 4, 8 };
        int birIcin=0;
        int dortIcin=0;
        for (int i=0;i<sayilar.length;i++){

            if (sayilar[i]==1){
                birIcin++;
            }else if (sayilar[i]==4){
                dortIcin++;
            }

        }
        boolean kontrol=true;
        if (birIcin>dortIcin){
            System.out.println(kontrol);
        }else if (dortIcin>birIcin){
            kontrol=false;
            System.out.println(kontrol);
        }else if (birIcin==dortIcin){
            System.out.println("E�it adette bulunmaktalar");
        }

    }
}
