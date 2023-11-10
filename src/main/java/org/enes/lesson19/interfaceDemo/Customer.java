package org.enes.lesson19.interfaceDemo;
/*
1-Database
2-giri� yap ve ��k�� yap metotlar� i�in hem �al��anlar hemde m��teriler bu metotlar� uygulas�n
 */

public class Customer implements ICommonBehavior{


    @Override
    public void enter() {
        System.out.println("M��teri giri� yap�yor.");
    }

    @Override
    public void exit() {
        System.out.println("M��teri ��k�� yap�yor.");
    }
}
