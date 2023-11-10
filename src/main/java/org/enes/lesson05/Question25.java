package org.enes.lesson05;

public class Question25 {
    public static void main(String[] args) {

        String value="1234";
        //value değişkenini karakterlerinin toplamını bulalım

        int toplam=0;
        int toplam2=0;

        for (int i=0;i<value.length();i++){
            //önce chara sonra inte çevirme
            String value2=String.valueOf(value.charAt(i));
            int deger=Integer.parseInt(value2);
            toplam+=deger;
            //charı direk inte çevirme yolu
            int deger2=Character.getNumericValue(value.charAt(i));
            toplam2+=deger2;
        }

        System.out.println(toplam);
        System.out.println(toplam2);



    }
}
