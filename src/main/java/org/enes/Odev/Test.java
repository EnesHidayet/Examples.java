package org.enes.Odev;

import org.enes.lesson23.StackOrnek;

import java.util.ArrayList;
import java.util.List;

public class Test {
    /*
    Menu diye bir sınıfnmız olsun
Corbalar Icecekler Yemekler ve Tatlılar için birer enum olustularım
icecek sayım 7 olsun
bu enumları menu sınfı içinde tutalım
yine gunlerimizi bir enumda tutabilirz
ve Manager sınfımız olsun
manager sınıfında her gune random bir menu belirleyeceğiz
her gun random bir corba icecek yemek ve tatlı olacak pazartesiden pazara kadar ;
ve bu menumuzu yazdıralım
(aynı degerler farklı gunlerde cıkabilir)
haftalık menuyu bir listede toplayabilirsiniz (opsiyonel)
extra
iceceklerimiz her gune sadece bir icecek gelecek şekilde olacak aynı hafta içinde aynı içecek bir daha cıkmayacak
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


        System.out.println("Tamamı rastgele oluşturulan haftalık menü.");

        List<Menu> haftalikRandomMenu=new ArrayList<>();
        haftalikRandomMenu.add(manager.randomMenu());
        haftalikRandomMenu.add(manager.randomMenu());
        haftalikRandomMenu.add(manager.randomMenu());
        haftalikRandomMenu.add(manager.randomMenu());
        haftalikRandomMenu.add(manager.randomMenu());
        haftalikRandomMenu.add(manager.randomMenu());
        haftalikRandomMenu.add(manager.randomMenu());

        haftalikRandomMenu.forEach(System.out::println);

        System.out.println("İçecek sabit gerisi rastgele oluşturulan haftalık menü.");

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
