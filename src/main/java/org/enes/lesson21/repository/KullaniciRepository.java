package org.enes.lesson21.repository;

import org.enes.lesson21.entity.Kullanici;
import org.enes.lesson21.utility.DataBase;
import org.enes.lesson21.utility.ICrud;

import java.util.List;

public class KullaniciRepository implements ICrud {
    @Override
    public boolean kayitEt(Kullanici kullanici) {
        kullanici.setId(DataBase.index+1);
        DataBase.kullanicilar.add(kullanici);
        DataBase.index++;
        return true;
    }

    @Override
    public List<Kullanici> kullanicilariGetir() {
//        Kullanici [] kullaniciListesi=new Kullanici[DataBase.index];
//
//        for (int i=0;i<DataBase.index;i++){
//            kullaniciListesi[i]=DataBase.kullanicilar[i];
//        }
        return DataBase.kullanicilar;
    }

    @Override
    public void sil(int id) {

    }

    @Override
    public void guncelle(int id) {

    }

    public void defaultKullanici(){
        Kullanici kullanici=new Kullanici(DataBase.index+1,"Enes","eha","123456");
        DataBase.kullanicilar.add(kullanici);
        DataBase.index++;
        Kullanici kullanici1=new Kullanici(DataBase.index+1,"Ali","xAli","654321");
        DataBase.kullanicilar.add(kullanici1);
        DataBase.index++;
        Kullanici kullanici2=new Kullanici(DataBase.index+1,"Mehmet","memo","159987");
        DataBase.kullanicilar.add(kullanici2);
        DataBase.index++;
    }

    public Kullanici kullaniciAdiveSifreIleKullaniciGetir(String kullaniciAdi, String sifre) {
        for (int i=0;i<DataBase.kullanicilar.size();i++){
            if (DataBase.kullanicilar.get(i).getPassword().equals(sifre) && DataBase.kullanicilar.get(i).getUsername().equals(kullaniciAdi)){
                return DataBase.kullanicilar.get(i);
            }
        }
        return null;
    }

    public Kullanici kullaniciAdiIleKullaniciGetir(String kullaniciAdi) {
        for (int i=0;i<DataBase.kullanicilar.size();i++){
            if (DataBase.kullanicilar.get(i).getUsername().equals(kullaniciAdi)){
                return DataBase.kullanicilar.get(i);
            }
        }
        return null;
    }
}
