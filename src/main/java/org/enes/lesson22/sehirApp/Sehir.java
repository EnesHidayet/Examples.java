package org.enes.lesson22.sehirApp;

public class Sehir{
    private String isim;
    private String  plaka;
    private long nufus;
    private EBolge bolge;

    public Sehir() {
    }

    public Sehir(String isim) {
        this.isim=isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public long getNufus() {
        return nufus;
    }

    public void setNufus(long nufus) {
        this.nufus = nufus;
    }

    public EBolge getBolge() {
        return bolge;
    }

    public void setBolge(EBolge bolge) {
        this.bolge = bolge;
    }

    @Override
    public String toString() {
        return "Sehir{" +
                "Ýsim='" + isim + '\'' +
                ", plaka=" + plaka +
                ", nufus=" + nufus +
                ", bolge='" + bolge + '\'' +
                '}';
    }
}
