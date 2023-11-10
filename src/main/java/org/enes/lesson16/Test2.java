package org.enes.lesson16;

public class Test2 {
    /**
     * elektrik pokemonu için id hariç diðer bilgileri dýþarýdan olan bir const yazalým ve
     * eðer elektrik pokemonu yaratýyorsam turum otomatik olarak elektrik gelsin
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
