package org.enes.lesson10;

public class Question47 {
    /**
     *metot veya metotlar yazzarak bu arraydeki tek sayýlarý baska bir tek boyutlu tek boyutlu arrayda toplamanýzý istiyorum
     *
    */
 public static void main(String[] args) {
     int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654, 33, 32, 67, 2 },
             { 189, 35, 56, 89, 8 } };

     for (int i=0;i<tekSayi(matris).length;i++){

         System.out.print(tekSayi(matris)[i]+", ");

     }



     //for each döngüsü ile

//     for (int sayi : array ){
//         System.out.println(sayi);           // böyle bi yazdýrma yöntemi var
//     }


 }

 public static int tekSayiSayisiniBul(int[][] dizi){

     int sayac=0;
     for (int i =0;i<dizi.length;i++){
         for (int j=0;j<dizi[i].length;j++){
             if (dizi[i][j]%2!=0){
                 sayac++;
             }
         }
     }

     return sayac;
 }



 public static int[] tekSayi(int[][] dizi){
     int uzunluk=tekSayiSayisiniBul(dizi);
     int [] tek=new int[uzunluk];
     int sayac=0;
     for (int i =0;i<dizi.length;i++){
         for (int j=0;j<dizi[i].length;j++){
             if (dizi[i][j]%2!=0){
                 tek[sayac]=dizi[i][j];
                    sayac++;
             }
         }
     }


return tek;
    }

 }