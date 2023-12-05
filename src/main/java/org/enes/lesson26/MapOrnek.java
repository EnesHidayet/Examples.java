package org.enes.lesson26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapOrnek {
    public static void main(String[] args) {

        String[] ogrenci={"Mustafa","Ece","Özge"};
        int [] not = {60,80,78};
        int [][] not2 = {{60,80,78},{80,92,50},{48,68,94}};

        /**
         * 1- isme karþýlýk not verecek þekilde bir map yapýsý kurup bu map i dolduralým.
         * TreeMapte a dan z ye LinkedHashMap te ekleme sýrasýna göre
         */

        Map<String,Integer> ogrenciNot=new HashMap<>();
        for (int i=0;i<ogrenci.length;i++){
            ogrenciNot.put(ogrenci[i],not[i]);
        }

        ogrenciNot.forEach((k,v) -> System.out.println("Öðrenci "+k+" notu "+v));

        /**
         * 2- Her öðrenciye karþýlýk tüm notmalarýný tutan map yapýsý yap.
         */

        System.out.println("Tüm notlar");
        Map<String, int[]> ogrenciNot2=new HashMap<>();
        for (int i=0;i<ogrenci.length;i++){
                ogrenciNot2.put(ogrenci[i],not2[i]);
        }
        ogrenciNot2.forEach((k,v) -> System.out.println("Öðrenci "+k+" notu "+ Arrays.toString(v)));

        /**
         * 3- Her öðrencinin not ortalamasýný hesaplayalým.Hesapladýðýmýz anda yazdýralým.
         */

        System.out.println("Ortalamalar");

        int [] mustafa=ogrenciNot2.get("Mustafa");
        int [] ece=ogrenciNot2.get("Ece");
        int [] ozge=ogrenciNot2.get("Özge");
        int toplam=0;
        for (int i=0;i<mustafa.length;i++){
            toplam+=mustafa[i];
        }
        System.out.println("Mustafanýn ortalamasý...:"+(toplam/ mustafa.length));

        toplam=0;
        for (int i=0;i<ece.length;i++){
            toplam+=ece[i];
        }
        System.out.println("Ecenin ortalamasý...:"+(toplam/ ece.length));

        toplam=0;
        for (int i=0;i<ozge.length;i++){
            toplam+=ozge[i];
        }
        System.out.println("Özgenin ortalamasý...:"+(toplam/ ozge.length));

        System.out.println("***** Map in kendi foreach ile *****");

        ogrenciNot2.forEach((k,v) -> {
            double toplam1=0;
            for (int n:v){
                toplam1+=n;
            }
            System.out.println(k+" nýn not ortalamasý ==> "+(toplam1/v.length));
        });

        System.out.println("***** Entry yöntemi foreach ile *****");

        for (Map.Entry<String,int[]> entry:ogrenciNot2.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            double toplam1=0;
            for (int n:entry.getValue()){
                toplam1+=n;
            }
            System.out.println(entry.getKey()+" nýn not ortalamasý ==> "+(toplam1/entry.getValue().length));
        }

        System.out.println("***** Set yöntemi foreach ile *****");

        for (String isim:ogrenciNot2.keySet()){

            double toplam1=0;
            for (int n:ogrenciNot2.get(isim)){
                toplam1+=n;
            }
            System.out.println(isim+" nýn not ortalamasý ==> "+(toplam1/ogrenciNot2.get(isim).length));

        }




    }
}
