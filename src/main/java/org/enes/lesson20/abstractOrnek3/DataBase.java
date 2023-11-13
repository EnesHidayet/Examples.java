package org.enes.lesson20.abstractOrnek3;

import java.util.UUID;

public abstract class DataBase {
   private String id;
   private String userName;
   private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = UUID.randomUUID().toString();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public abstract void veriEkle();

    public abstract void veriSil();

    public abstract void veriGuncelle();

    public abstract void verileriGetir();


}
