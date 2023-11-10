package org.enes.lesson19.interfaceDemo;
/*
1-Database
2-giriþ yap ve çýkýþ yap metotlarý için hem çalýþanlar hemde müþteriler bu metotlarý uygulasýn
 */

public class Customer implements ICommonBehavior{


    @Override
    public void enter() {
        System.out.println("Müþteri giriþ yapýyor.");
    }

    @Override
    public void exit() {
        System.out.println("Müþteri çýkýþ yapýyor.");
    }
}
