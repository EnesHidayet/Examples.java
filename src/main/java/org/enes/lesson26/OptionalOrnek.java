package org.enes.lesson26;

import java.util.Optional;
import java.util.Scanner;

/*
        Urun s�n�f�ndan bir nesne yaratmak i�in �r�n yarat metodu yazal�m.Bu metod optional bir �r�n d�ns�n.
        metod i�erisinde kullan�c�dan bilgiler alaca��z �r�n ismi bo� ise veya fiyat 0 ve 0 dan k���k ise
        bo� bir optional e�er de�il ise optional �r�n d�nelim.

        �r�n varsa ismini yazd�rs�n yoksa �r�n bulunamad� yazd�rs�n.
 */
public class OptionalOrnek {

    public Optional<Urun> urunYarat(){


        Scanner scanner=new Scanner(System.in);
        System.out.println("�r�n i�in fiyat giriniz.");
        double fiyat=Double.parseDouble(scanner.nextLine());
        System.out.println("�r�n i�in isim giriniz.");
        String isim=scanner.nextLine();


        if (fiyat<=0 || isim.isBlank()){
            return Optional.ofNullable(null);
        }

        return Optional.of(new Urun(fiyat,isim));


    }

    public Optional<Urun> urunYarat2(){


        Scanner scanner=new Scanner(System.in);
        System.out.println("�r�n i�in fiyat giriniz.");
        double fiyat=Double.parseDouble(scanner.nextLine());
        System.out.println("�r�n i�in isim giriniz.");
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
        urun1.ifPresentOrElse(System.out::println,()-> System.out.println("�r�n bulunamad�."));

//        xx, 10 e�er �r�n 2 bo� de�ilse �r�n2 �r�n 3 olsun ama bo ise ba�ta verilen de�erler olsun.

        Urun urun3;
        urun3=urun2.orElse(new Urun(10,"xx"));
        System.out.println(urun3);




    }

}
