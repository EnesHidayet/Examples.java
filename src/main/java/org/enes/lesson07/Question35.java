package org.enes.lesson07;

public class Question35 {
    public static void main(String[] args) {
        /**
         * bir dizideki max ve min deðerleri ve en büyük ikinci deðerleri bulalým
         */

        int[] sayilar = { 0, 120, 5, 85, -256, 16, 1258, 240, 81, 14 };

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        int ikinciMax=Integer.MIN_VALUE;

        // toplu yorum ctrl //


        for (int i=0;i<sayilar.length;i++){
            if (sayilar[i]>max){
                ikinciMax=max;
                max=sayilar[i];
            }
            if (sayilar[i]<min){
                min=sayilar[i];
            }
            if (sayilar[i]>ikinciMax && sayilar[i]<max){
                ikinciMax=sayilar[i];
            }
        }


        System.out.println(ikinciMax);
        System.out.println(max);
        System.out.println(min);

    }
}
