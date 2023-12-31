package org.enes.lesson20.abstractOrnek;

public class SuPokemonu extends Pokemon {
        public  int yuzmeHizi;
        public  int suBasincGucu;

        public SuPokemonu(String ad, int seviye, int can, int guc) {
                super("Su", ad, seviye, can, guc);
        }

        public SuPokemonu(String ad, int seviye, int can, int guc,int yuzmeHizi,int suBasincGucu) {
                super("Su", ad, seviye, can, guc);
                this.yuzmeHizi=yuzmeHizi;
                this.suBasincGucu=suBasincGucu;
        }

        public SuPokemonu(String ad,int yuzmeHizi,int suBasincGucu) {
                super(ad);
                this.yuzmeHizi=yuzmeHizi;
                this.suBasincGucu=suBasincGucu;
                this.tur="Su";
        }

        @Override
        public void ozelSaldiriYap() {
                System.out.println("Su saldırısı==>" + (guc+suBasincGucu));
        }
}
