package org.enes.lesson26;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        /**
         * Optional.off ile optional ol�turmak istiyorsak null de�erler hata f�rlat�r
         * Optional.offNullable null de�erler alabilir.
         */
        Integer sayi1=5;
        Optional< Integer > sayi2=Optional.of(10);
        Optional< Integer > sayi3=Optional.of(sayi1);

        String deger=null;
        String deger4="Mustafa";
//        Optional<String> deger2=Optional.of(deger);
        Optional<String> deger3=Optional.ofNullable(deger);
        Optional<String> deger5=Optional.ofNullable(deger4);
        Optional<String> deger6=Optional.of(deger4);

        System.out.println(sayi2);
        System.out.println(sayi3);
//        System.out.println(deger2);
        System.out.println(deger3);
        System.out.println(deger5);
        System.out.println(deger6);

        int toplam=sayi2.get()+sayi3.get();
        System.out.println(toplam);
        System.out.println(deger6.get());


        if (deger3.isEmpty()){
            System.out.println("Bo�");
        }else {
            System.out.println(deger3.get());
        }

        sayi2=Optional.empty();

        if (sayi2.isPresent()){
            System.out.println(sayi2.get());
        }else {
            System.out.println("Bo�");
        }

        sayi3.ifPresent(s-> System.out.println(s+50));

        Integer x=sayi3.orElse(0); // var ise say�n�n kendisini d�ner yok ise 0 de�eri d�n dedik.
        System.out.println(x);

        sayi2.ifPresentOrElse(s-> System.out.println(s+100),()-> System.out.println("Say� bo�")); // 2 ayr� fonksiyon tan�mlad�k �yleyse b�yle yap gibi
        sayi3.ifPresentOrElse(s-> System.out.println(s+100),()-> System.out.println("Say� bo�"));

        System.out.println(sayi3.filter(s->s>8));





    }
}
