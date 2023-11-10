package org.enes.lesson16;

public class Test {
    public static void main(String[] args) {

        Pokemon pokemon1=new Pokemon();
        pokemon1.ad=("Pikachu");
        pokemon1.tur=("Elektrik");
        pokemon1.seviye=2;
        pokemon1.guc=28;
        pokemon1.can=250;

        Pokemon pokemon2=new Pokemon();
        pokemon2.ad=("Charizard");
        pokemon2.tur=("Ateþ");
        pokemon2.seviye=3;
        pokemon2.guc=80;
        pokemon2.can=550;

//        SuPokemonu suPokemonu=new SuPokemonu();
//        suPokemonu.ad=("Squirtle");
//        suPokemonu.tur=("Su");
//        suPokemonu.seviye=2;
//        suPokemonu.guc=25;
//        suPokemonu.can=220;
//        suPokemonu.suBasincGucu=320;
//        suPokemonu.yuzmeHizi=50;

//        suPokemonu.bilgileriGoster();
//        suPokemonu.saldiri();

        SuPokemonu suPokemonu=new SuPokemonu("Arap","Su",650,50,1,100,5);
        suPokemonu.bilgileriGoster();

        pokemon1.saldiri();
        pokemon2.saldiri();
        pokemon1.kacinma();

        pokemon1.bilgileriGoster();
        pokemon2.bilgileriGoster();

        Pokemon pokemon=new Pokemon(4,"Rayichu","Elektrik",260,650,3);
        pokemon.bilgileriGoster();

        Pokemon pokemon3=new Pokemon("biþey");

//        ElektrikPokemonu elektrikPokemonu=new ElektrikPokemonu("ceryan");

        Pokemon pokemon4=new Pokemon("enes","ceryan",500,100,4);
        pokemon4.bilgileriGoster();

    }
}
