package org.enes.lesson19.interfaceDemo2;

public class KargoUcagi  extends Ucak  implements IYuk{

    @Override
    public void yukAl() {
        System.out.println(getClass().getSimpleName()+" yuk alıyor");
    }
    @Override
    public void yukBosalt() {
        System.out.println(getClass().getSimpleName()+" yuk  bosaltıyor");
    }
}
