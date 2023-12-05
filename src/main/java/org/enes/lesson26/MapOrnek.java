package org.enes.lesson26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapOrnek {
    public static void main(String[] args) {

        String[] ogrenci={"Mustafa","Ece","�zge"};
        int [] not = {60,80,78};
        int [][] not2 = {{60,80,78},{80,92,50},{48,68,94}};

        /**
         * 1- isme kar��l�k not verecek �ekilde bir map yap�s� kurup bu map i doldural�m.
         * TreeMapte a dan z ye LinkedHashMap te ekleme s�ras�na g�re
         */

        Map<String,Integer> ogrenciNot=new HashMap<>();
        for (int i=0;i<ogrenci.length;i++){
            ogrenciNot.put(ogrenci[i],not[i]);
        }

        ogrenciNot.forEach((k,v) -> System.out.println("��renci "+k+" notu "+v));

        /**
         * 2- Her ��renciye kar��l�k t�m notmalar�n� tutan map yap�s� yap.
         */

        System.out.println("T�m notlar");
        Map<String, int[]> ogrenciNot2=new HashMap<>();
        for (int i=0;i<ogrenci.length;i++){
                ogrenciNot2.put(ogrenci[i],not2[i]);
        }
        ogrenciNot2.forEach((k,v) -> System.out.println("��renci "+k+" notu "+ Arrays.toString(v)));

        /**
         * 3- Her ��rencinin not ortalamas�n� hesaplayal�m.Hesaplad���m�z anda yazd�ral�m.
         */

        System.out.println("Ortalamalar");

        int [] mustafa=ogrenciNot2.get("Mustafa");
        int [] ece=ogrenciNot2.get("Ece");
        int [] ozge=ogrenciNot2.get("�zge");
        int toplam=0;
        for (int i=0;i<mustafa.length;i++){
            toplam+=mustafa[i];
        }
        System.out.println("Mustafan�n ortalamas�...:"+(toplam/ mustafa.length));

        toplam=0;
        for (int i=0;i<ece.length;i++){
            toplam+=ece[i];
        }
        System.out.println("Ecenin ortalamas�...:"+(toplam/ ece.length));

        toplam=0;
        for (int i=0;i<ozge.length;i++){
            toplam+=ozge[i];
        }
        System.out.println("�zgenin ortalamas�...:"+(toplam/ ozge.length));

        System.out.println("***** Map in kendi foreach ile *****");

        ogrenciNot2.forEach((k,v) -> {
            double toplam1=0;
            for (int n:v){
                toplam1+=n;
            }
            System.out.println(k+" n�n not ortalamas� ==> "+(toplam1/v.length));
        });

        System.out.println("***** Entry y�ntemi foreach ile *****");

        for (Map.Entry<String,int[]> entry:ogrenciNot2.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            double toplam1=0;
            for (int n:entry.getValue()){
                toplam1+=n;
            }
            System.out.println(entry.getKey()+" n�n not ortalamas� ==> "+(toplam1/entry.getValue().length));
        }

        System.out.println("***** Set y�ntemi foreach ile *****");

        for (String isim:ogrenciNot2.keySet()){

            double toplam1=0;
            for (int n:ogrenciNot2.get(isim)){
                toplam1+=n;
            }
            System.out.println(isim+" n�n not ortalamas� ==> "+(toplam1/ogrenciNot2.get(isim).length));

        }




    }
}
