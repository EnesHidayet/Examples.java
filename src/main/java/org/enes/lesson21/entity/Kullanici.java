package org.enes.lesson21.entity;

public class Kullanici {
    private int id;
    private String ad;
    private String username;
    private String password;
    private Sepet sepet;

    public Kullanici(String ad, String username, String password) {
        this.ad = ad;
        this.username = username;
        this.password = password;
        this.sepet=new Sepet();
    }

    public Kullanici(int id,String ad, String username, String password) {
        this.ad = ad;
        this.username = username;
        this.password = password;
        this.id=id;
        this.sepet=new Sepet();
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Sepet getSepet() {
        return sepet;
    }

    public void setSepet(Sepet sepet) {
        this.sepet = sepet;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Kullanici{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
