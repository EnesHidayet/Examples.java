package org.enes.lesson19.interfaceDemo2;

public class Ucak extends Arac implements IUcak{
    private int motorSayisi;

    public Ucak(int hiz, int motorSayisi) {
        super(hiz);
        this.motorSayisi = motorSayisi;
    }

    public int getMotorSayisi() {
        return motorSayisi;
    }

    public void setMotorSayisi(int motorSayisi) {
        this.motorSayisi = motorSayisi;
    }

    @Override
    public void kalkis() {
        System.out.println(getClass().getSimpleName()+" kalkýþ yapýyor.");
    }

    @Override
    public void inis() {
        System.out.println(getClass().getSimpleName()+" iniþ yapýyor.");
    }
}
