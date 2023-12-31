package org.enes.lesson22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
1 tane Liste oluşturalım
Ankara
Bursa
Antalya
Artvin
Erzurum
Karaman


An ile başlayan şehirleri silelim.
An ile başlayan şehirleri xxx ile değiştirelim
 */
public class ArrayListOrnek {


    public static void main(String[] args) {
        List<String> sehirler=new ArrayList<>();
        sehirler.add("Ankara");
        sehirler.add("Bursa");
        sehirler.add("Antalya");
        sehirler.add("Artvin");
        sehirler.add("Erzurum");
        sehirler.add("Karaman");
        List<String > sehirler3=new ArrayList<>(List.of("Ankara","Antalya","Bursa")); //add yerine böylede liste oluşturulabilir

//        anIleBaslayanSehirleriSil(sehirler);
        anIleBaslayanSehirlerixxxYap(sehirler);


        System.out.println("--------------------------------------");

        String [] array={"Ankara","Antalya","Bursa"};
        List<String> sehirler2= new ArrayList<>(Arrays.asList(array));
        System.out.println(sehirler2);

        System.out.println("---------------------------------------");






    }




    public static void anIleBaslayanSehirleriSil(List<String> sehirler){
        System.out.println(sehirler);

        for (int i=0;i<sehirler.size();i++){


            if (sehirler.get(i).contains("An")){
                sehirler.remove(i);
                i--;
            }


        }

        // foreach asenkron çalıştığı için boyutta değişiklik yapan metodların çalışmasına izin vermiyor.

        System.out.println(sehirler);
    }

    public static void anIleBaslayanSehirlerixxxYap(List<String> sehirler){
        System.out.println(sehirler);

        for (int i=0;i<sehirler.size();i++){

            if (sehirler.get(i).contains("An")){
                sehirler.set(i,"xxx");
            }


        }

        System.out.println(sehirler);
    }
}
