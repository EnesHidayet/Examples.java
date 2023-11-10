package org.enes.lesson20.polimorpism;

public class Test {
    public static void main(String[] args) {

        Pokemon pokemon=new ElektrikPokemonu("Rayichu",320,260,3);
        Pokemon pokemon1=new SuPokemonu("Squirtle",1200,698);
        Pokemon pokemon2=new HavaPokemonu();
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        saldir((ElektrikPokemonu) pokemon,null);
        saldir(null,(SuPokemonu) pokemon1);
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        saldir2(pokemon);
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        saldir3(pokemon);
        saldir3(pokemon1);
        saldir3(pokemon2);
    }


    public static void saldir(ElektrikPokemonu elektrikPokemonu,SuPokemonu suPokemonu){
        if (elektrikPokemonu!=null && suPokemonu==null){
            elektrikPokemonu.saldir();
        }else if (elektrikPokemonu==null && suPokemonu!=null){
            suPokemonu.saldir();
        }
    }

    public static void saldir2(Object object){
        if (object instanceof ElektrikPokemonu){
            ElektrikPokemonu elektrikPokemonu=(ElektrikPokemonu) object;
            elektrikPokemonu.saldir();
        } else if (object instanceof SuPokemonu) {
            SuPokemonu suPokemonu=(SuPokemonu) object;
            suPokemonu.saldir();
        }
    }

    public static void saldir3(Pokemon pokemon){
     pokemon.saldir();
    }

}
