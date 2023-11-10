package org.enes.lesson06;

public class Question28 {
    public static void main(String[] args) {
        String value="125abc96xy8";
        /**
         * String değerinin karakterli rakam ise toplayalım ve program sonunda toplam degerini yazdıralım
         * değil ise bir string de toplayın program sonunda çıktısını verelim
         */
        int sayilar=0;
        int toplam=0;
        String harfler="";

        for (int i=0;i<value.length();i++){
            if (Character.isDigit(value.charAt(i))){ //isdigit karakterşn sayı olup olmadığını kontrol eder
                sayilar=Character.getNumericValue(value.charAt(i));
                toplam+=sayilar;
            }else {
                harfler += value.charAt(i);
            }

        }

        System.out.println("kelimedeki sayıların toplamı...:"+toplam);
        System.out.println("Kelimedeki harfler...:"+harfler);


        //isdigiti bilmiyorsak if(char değeri >=48 && char değeri <=57
            harfler="";
            toplam=0;

        for (int i=0;i<value.length();i++){
            char karakter=value.charAt(i);
            if (karakter>=48&&karakter<=57){ //isdigit karakterşn sayı olup olmadığını kontrol eder
                sayilar=Character.getNumericValue(value.charAt(i));
                toplam+=sayilar;
            }else {
                harfler += karakter;
            }

        }
        System.out.println(toplam);
        System.out.println(harfler);


    }
}
