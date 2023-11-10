package org.enes.lesson19.interfaceDemo2;

public class Arac implements IArac{
    private int hiz;

    public Arac(int hiz) {
        this.hiz = hiz;
    }


    public int getHiz() {
        return hiz;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }

    @Override
    public String toString() {
        return "Arac{" +
                ", hiz=" + hiz +
                '}';
    }


    @Override
    public void hizlan() {
        System.out.println("Araç hýzlanýyor.");
    }

    @Override
    public void yavasla() {
        System.out.println("Araç yavaþlýyor.");
    }
}
