package org.enes.lesson16;

public class Test2 {
    /**
     * elektrik pokemonu i�in id hari� di�er bilgileri d��ar�dan olan bir const yazal�m ve
     * e�er elektrik pokemonu yarat�yorsam turum otomatik olarak elektrik gelsin
     * @param args
     */
    public static void main(String[] args) {

        ElektrikPokemonu elektrikPokemonu=new ElektrikPokemonu("Rayichu",500,100,5);


        Pokemon pokemon1=new Pokemon();
        pokemon1.ad=("Pikachu");
        pokemon1.tur=("Elektrik");
        pokemon1.seviye=2;
        pokemon1.guc=28;
        pokemon1.can=250;
        pokemon1.bilgileriGoster();
        elektrikPokemonu.bilgileriGoster();

    }
}
