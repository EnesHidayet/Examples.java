package org.enes.lesson21.utility;

import org.enes.lesson21.entity.Kullanici;

import java.util.List;

// kullanýcý için yaptýðýmýz bir interface
public interface ICrud {
    boolean kayitEt(Kullanici kullanici);
    List<Kullanici> kullanicilariGetir();
    //kullanýcý adý, id uniqtir o yüzden silme iþlemi için genelde bunlar kullanýlýr.
    void sil(int id);
    void guncelle(int id);
}
