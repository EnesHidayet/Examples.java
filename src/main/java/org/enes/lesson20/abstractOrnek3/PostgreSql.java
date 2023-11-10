package org.enes.lesson20.abstractOrnek3;

public class PostgreSql extends DataBase{

    @Override
    public void veriEkle() {
        System.out.println("Postgreya veri eklendi.");
    }

    @Override
    public void veriSil() {
        System.out.println("Postgredan veri silindi.");
    }

    @Override
    public void veriGuncelle() {
        System.out.println("Postgreda veriler güncellendi.");
    }

    @Override
    public void verileriGetir() {
        System.out.println("Postgredan veriler getirildi.");
    }
}
