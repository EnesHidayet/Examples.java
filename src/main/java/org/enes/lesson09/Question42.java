package org.enes.lesson09;

public class Question42 {
    /**
     * diziler arasýnda ki farkýn en küçük olduðu deðer nedir?
     */

          public static void main(String[] args) {

             int [] array={5,1,-4,3};
              //System.out.println(Math.abs(-4));
               System.out.println(enKucukFarkiBul(array));


          }

          public static int enKucukFarkiBul(int [] array){
              if (array.length<2){
                  return 0;
              }else {
                  int min = Integer.MAX_VALUE;
                  for (int i = 0; i < array.length; i++) {

                      for (int j = i + 1; j < array.length; j++) {

                          int fark = Math.abs(array[i] - array[j]);

                          if (fark < min) {

                              min = fark;
                          }

                      }

                  }
                  return min;
              }

          }







     }

