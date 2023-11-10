package org.enes.lesson20.abstractOrnek3;

public class MongoDb extends DataBase{

    @Override
    public void veriEkle() {
        System.out.println("Mongoya veri eklendi.");
    }

    @Override
    public void veriSil() {
        System.out.println("Mongodan veri silindi.");
    }

    @Override
    public void veriGuncelle() {
        System.out.println("Mongoda veriler güncellendi.");
    }

    @Override
    public void verileriGetir() {
        System.out.println("Mongodan veriler getirildi.");
    }
}
