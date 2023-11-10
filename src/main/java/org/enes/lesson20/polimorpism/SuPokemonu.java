package org.enes.lesson20.polimorpism;

public class SuPokemonu extends Pokemon {


    public int yuzmeHizi;
    public int suBasincGucu;

    public SuPokemonu(String ad, String tur, int can, int guc, int seviye, int yuzmeHizi, int suBasincGucu) {
        super(ad, tur, can, guc, seviye);
        this.yuzmeHizi = yuzmeHizi;
        this.suBasincGucu = suBasincGucu;
    }

    public SuPokemonu(String ad, int yuzmeHizi, int suBasincGucu) {
        super(ad);
        this.yuzmeHizi = yuzmeHizi;
        this.suBasincGucu = suBasincGucu;
    }




}
