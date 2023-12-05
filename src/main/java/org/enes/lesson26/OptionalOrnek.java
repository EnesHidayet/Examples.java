package org.enes.lesson26;

import java.util.Optional;
import java.util.Scanner;

/*
        Urun sýnýfýndan bir nesne yaratmak için ürün yarat metodu yazalým.Bu metod optional bir ürün dönsün.
        metod içerisinde kullanýcýdan bilgiler alacaðýz ürün ismi boþ ise veya fiyat 0 ve 0 dan küçük ise
        boþ bir optional eðer deðil ise optional ürün dönelim.

        Ürün varsa ismini yazdýrsýn yoksa ürün bulunamadý yazdýrsýn.
 */
public class OptionalOrnek {

    public Optional<Urun> urunYarat(){


        Scanner scanner=new Scanner(System.in);
        System.out.println("Ürün için fiyat giriniz.");
        double fiyat=Double.parseDouble(scanner.nextLine());
        System.out.println("Ürün için isim giriniz.");
        String isim=scanner.nextLine();


        if (fiyat<=0 || isim.isBlank()){
            return Optional.ofNullable(null);
        }

        return Optional.of(new Urun(fiyat,isim));


    }

    public Optional<Urun> urunYarat2(){


        Scanner scanner=new Scanner(System.in);
        System.out.println("Ürün için fiyat giriniz.");
        double fiyat=Double.parseDouble(scanner.nextLine());
        System.out.println("Ürün için isim giriniz.");
        String isim=scanner.nextLine();

        Urun urun=null;
        if (!(fiyat<=0) || !isim.isBlank()){
           return Optional.of(urun = new Urun(fiyat, isim));
        }

        return Optional.ofNullable(null);
    }




    public static void main(String[] args) {
        OptionalOrnek optionalOrnek=new OptionalOrnek();
        Optional<Urun> urun1 = optionalOrnek.urunYarat();
        System.out.println(urun1);

        Optional<Urun> urun2 = optionalOrnek.urunYarat2();
        System.out.println(urun2);

        urun2.ifPresent(System.out::println);
        urun1.ifPresentOrElse(System.out::println,()-> System.out.println("Ürün bulunamadý."));

//        xx, 10 eðer ürün 2 boþ deðilse ürün2 ürün 3 olsun ama bo ise baþta verilen deðerler olsun.

        Urun urun3;
        urun3=urun2.orElse(new Urun(10,"xx"));
        System.out.println(urun3);




    }

}
