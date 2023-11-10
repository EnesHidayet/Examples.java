package org.enes.lesson08;

import java.util.Arrays;

public class Question40 {
    public static void main(String[] args) {
        /**
         * 1 ile 10 arasýndaki sayýlarýn çarpým tablosunu çft boyutlu bir arrayde toplayalým
         */


        String [] [] carpimTablosu=new String[10][10];

        for (int i = 0; i <carpimTablosu.length ; i++) {
            for (int j = 0; j <carpimTablosu[i].length ; j++) {
                carpimTablosu[i][j]=(i+1) +"X" +(j+1) +"="+((i+1)*(j+1));
                //  System.out.println(carpimTablosu[i][j]);
            }
        }

        System.out.println(carpimTablosu);
//        for (int i = 0; i <carpimTablosu.length ; i++) {
//            for (int j = 0; j <carpimTablosu[i].length ; j++) {
//                System.out.println(carpimTablosu[i][j]);
//            }
//        }

        int [] dizi={56,89,75,63,12};

        System.out.println(dizi);
        System.out.println(Arrays.toString(dizi));
        /*
            {
                {1x1=1,1x2=2,.......},
                {2x1=2,2x2=4,.......},
                {3x1=3,3x2=6,.......},
            }
         */

        for (int i = 0; i < carpimTablosu.length ; i++) {
            System.out.println(Arrays.toString(carpimTablosu[i]));
        }


    }
}
