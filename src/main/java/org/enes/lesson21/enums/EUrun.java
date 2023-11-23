package org.enes.lesson21.enums;

public enum EUrun {
    CIPS(25),
    KOLA(55),
    SEKER(80),
    YAG(120),
    UN(75),
    EKMEK(7),
    CAY(60),
    YUMURTA(70),
    YOGURT(45),
    SUT(25);

    double price;

    private EUrun(double price){
        this.price=price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
