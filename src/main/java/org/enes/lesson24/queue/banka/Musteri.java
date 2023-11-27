package org.enes.lesson24.queue.banka;

/**
 * Müþterilerimizin ismi olsun sýra no olsun birde banka musterisimi deðil mi onu tuttuðumuz bir deðiþken olsun
 * daha sonra bankada bir müþteri kuyruðu oluþturalým ve banka müþterisi olanlara öncelik verelim.
 */

public class Musteri{
    private String isim;
    private int siraNo;
    private boolean musteriMi;

    public Musteri(String isim, int siraNo, boolean musteriMi) {
        this.isim = isim;
        this.siraNo = siraNo;
        this.musteriMi = musteriMi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getSiraNo() {
        return siraNo;
    }

    public void setSiraNo(int siraNo) {
        this.siraNo = siraNo;
    }

    public boolean isMusteriMi() {
        return musteriMi;
    }

    public void setMusteriMi(boolean musteriMi) {
        this.musteriMi = musteriMi;
    }

    @Override
    public String toString() {
        return "Musteri{" +
                "isim='" + isim + '\'' +
                ", siraNo=" + siraNo +
                ", musteriMi=" + musteriMi +
                '}';
    }

//    @Override
//    public int compareTo(Musteri o) {
//        if (this.musteriMi){
//            return -1;
//        }else{
//            return 1;
//        }
//    }

//    @Override
//    public int compareTo(Musteri o) {
//        if (this.siraNo <o.siraNo){
//            return -1;
//        }else if (this.siraNo>o.siraNo){
//            return 1;
//        }
//        else return 0;
//    }

//    @Override
//    public int compareTo(Musteri o) {
//        return this.siraNo-o.siraNo;
//    }
}
