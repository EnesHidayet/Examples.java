package org.enes.Odev;

import org.enes.lesson23.StackOrnek;

import java.util.ArrayList;
import java.util.List;

public class Test {
    /*
    Menu diye bir s�n�fnm�z olsun
Corbalar Icecekler Yemekler ve Tatl�lar i�in birer enum olustular�m
icecek say�m 7 olsun
bu enumlar� menu s�nf� i�inde tutal�m
yine gunlerimizi bir enumda tutabilirz
ve Manager s�nf�m�z olsun
manager s�n�f�nda her gune random bir menu belirleyece�iz
her gun random bir corba icecek yemek ve tatl� olacak pazartesiden pazara kadar ;
ve bu menumuzu yazd�ral�m
(ayn� degerler farkl� gunlerde c�kabilir)
haftal�k menuyu bir listede toplayabilirsiniz (opsiyonel)
extra
iceceklerimiz her gune sadece bir icecek gelecek �ekilde olacak ayn� hafta i�inde ayn� i�ecek bir daha c�kmayacak
     */

    public static void main(String[] args) {
        Manager manager=new Manager();
//        System.out.println(manager.randomMenu());
//        System.out.println(manager.randomMenu());
//        System.out.println(manager.randomMenu());
//        System.out.println(manager.randomMenu());
//        System.out.println(manager.randomMenu());
//        System.out.println(manager.randomMenu());
//        System.out.println(manager.randomMenu());
//        System.out.println(manager.randomMenu());
//        System.out.println(manager.randomMenu());


        System.out.println("Tamam� rastgele olu�turulan haftal�k men�.");

        List<Menu> haftalikRandomMenu=new ArrayList<>();
        haftalikRandomMenu.add(manager.randomMenu());
        haftalikRandomMenu.add(manager.randomMenu());
        haftalikRandomMenu.add(manager.randomMenu());
        haftalikRandomMenu.add(manager.randomMenu());
        haftalikRandomMenu.add(manager.randomMenu());
        haftalikRandomMenu.add(manager.randomMenu());
        haftalikRandomMenu.add(manager.randomMenu());

        haftalikRandomMenu.forEach(System.out::println);

        System.out.println("��ecek sabit gerisi rastgele olu�turulan haftal�k men�.");

        List<Menu> icecekSabitRandomMenu=new ArrayList<>();
        icecekSabitRandomMenu.add(manager.randomMenuIcecekHaric());
        icecekSabitRandomMenu.add(manager.randomMenuIcecekHaric());
        icecekSabitRandomMenu.add(manager.randomMenuIcecekHaric());
        icecekSabitRandomMenu.add(manager.randomMenuIcecekHaric());
        icecekSabitRandomMenu.add(manager.randomMenuIcecekHaric());
        icecekSabitRandomMenu.add(manager.randomMenuIcecekHaric());
        icecekSabitRandomMenu.add(manager.randomMenuIcecekHaric());

        icecekSabitRandomMenu.forEach(System.out::println);



    }
}
