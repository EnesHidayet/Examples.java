package org.enes.lesson13;

/*
1- Ta� ka��t makas uygulamas� yapaca��z bunun i�in bir s�n�f olu�turup metotlar� ve �zellikleri bu s�n�f i�erisinde toplayaca��z
Bu s�n�fta se�eneklerimizi tutal�m (Ta�, Ka��t, Makas) ve bu uygulamay� �al��t�ran ki�inin ismini tutal�m
2- a-) Kullan�c� bir se�im yaps�n ve se�imi geri d�nen metod
b-) bilgisayara rastgele se�im yapt�r�p o se�imi d�nen bir metod
3-Uygulama metodu yazal�m bu metotda kullan�c� ismi Ho�geldin ta� ka��t makas oyunu ba�l�yor gibi ��kt� ver
bu ��kt�dan sonra kullan�c�lara oyunun sonucunu d�nelim
 */

public class App {
    public static void main(String[] args) {
        AppTkm oyun=new AppTkm();

        oyun.uygulama();

        oyun.uygulama2();

    }
}
