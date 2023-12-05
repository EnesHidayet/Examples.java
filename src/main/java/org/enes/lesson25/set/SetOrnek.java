package org.enes.lesson25.set;

import java.util.*;

/**
 *Bir set olu�tural�m bu sete film kategorileri ekleyece�iz
 * Kategori ekle diye bir metod yazal�m. -> d��ar�dan bir veri alaca��z ve set e ekleme yapaca��z.Kategori daha �nce eklenmi�se
 �u ��kt�y� verece�iz ==> Kategori daha �nce eklenmi�tir. Eklenmemi� ise ba�ar� ile eklendi yaz�cak.
 *
 */
public class SetOrnek {
    Set<String> set=new HashSet<>();
    Scanner scanner=new Scanner(System.in);
    public void kategoriEkle(){

            System.out.println("Eklemek istedi�iniz kategoriyi giriniz...:");
            String ifade=scanner.nextLine();
            if (set.contains(ifade)){
                System.out.println(ifade+" daha �nce eklenmi� bir kategoridir.");
            }else {
                System.out.println(ifade+" ba�ar� ile eklendi.");
                set.add(ifade);
            }

    }

    public void kategoriEkle2(){

        System.out.println("Eklemek istedi�iniz kategoriyi giriniz...:");
        String ifade=scanner.nextLine();
        if (set.add(ifade)){
            System.out.println(ifade+" ba�ar� ile eklendi.");
        }else {
            System.out.println(ifade+" daha �nce eklenmi� bir kategoridir.");
        }

    }

    public static void main(String[] args) {

        SetOrnek setOrnek=new SetOrnek();

        setOrnek.kategoriEkle2();
        setOrnek.kategoriEkle2();
        setOrnek.kategoriEkle2();
        setOrnek.kategoriEkle2();

        setOrnek.set.forEach(System.out::println);
    }

}
