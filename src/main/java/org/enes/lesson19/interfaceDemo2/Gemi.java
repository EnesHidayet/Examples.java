package org.enes.lesson19.interfaceDemo2;

public class Gemi extends Arac implements IGemi,IYukAlanlar{
    private int yukKapasitesi;

    public Gemi(int hiz, int yukKapasitesi) {
        super(hiz);
        this.yukKapasitesi = yukKapasitesi;
    }

    public int getYukKapasitesi() {
        return yukKapasitesi;
    }

    public void setYukKapasitesi(int yukKapasitesi) {
        this.yukKapasitesi = yukKapasitesi;
    }

    @Override
    public String toString() {
        return "Gemi{" +
                "yukKapasitesi=" + yukKapasitesi +
                '}';
    }

    @Override
    public void yelkenAc() {
        System.out.println(getClass().getSimpleName()+" yelken açýyor.");
    }

    @Override
    public void yelkenKapat() {
        System.out.println(getClass().getSimpleName()+" yelken kapatýyor.");
    }

    @Override
    public void limanaYaklas() {
        System.out.println(getClass().getSimpleName()+" limana yaklaþýyor.");
    }

    @Override
    public void limandanUzaklas() {
        System.out.println(getClass().getSimpleName()+" limandan uzaklaþýyor.");
    }

    @Override
    public void yukAl() {
        System.out.println(getClass().getSimpleName()+" yük alýyor");
    }

    @Override
    public void yukBosalt() {
        System.out.println(getClass().getSimpleName()+" yük boþaltýyor.");
    }
}
