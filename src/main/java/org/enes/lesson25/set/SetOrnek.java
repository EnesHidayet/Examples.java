package org.enes.lesson25.set;

import java.util.*;

/**
 *Bir set oluþturalým bu sete film kategorileri ekleyeceðiz
 * Kategori ekle diye bir metod yazalým. -> dýþarýdan bir veri alacaðýz ve set e ekleme yapacaðýz.Kategori daha önce eklenmiþse
 þu çýktýyý vereceðiz ==> Kategori daha önce eklenmiþtir. Eklenmemiþ ise baþarý ile eklendi yazýcak.
 *
 */
public class SetOrnek {
    Set<String> set=new HashSet<>();
    Scanner scanner=new Scanner(System.in);
    public void kategoriEkle(){

            System.out.println("Eklemek istediðiniz kategoriyi giriniz...:");
            String ifade=scanner.nextLine();
            if (set.contains(ifade)){
                System.out.println(ifade+" daha önce eklenmiþ bir kategoridir.");
            }else {
                System.out.println(ifade+" baþarý ile eklendi.");
                set.add(ifade);
            }

    }

    public void kategoriEkle2(){

        System.out.println("Eklemek istediðiniz kategoriyi giriniz...:");
        String ifade=scanner.nextLine();
        if (set.add(ifade)){
            System.out.println(ifade+" baþarý ile eklendi.");
        }else {
            System.out.println(ifade+" daha önce eklenmiþ bir kategoridir.");
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
