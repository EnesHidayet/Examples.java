package org.enes.lesson13;

/*
1- Taþ kaðýt makas uygulamasý yapacaðýz bunun için bir sýnýf oluþturup metotlarý ve özellikleri bu sýnýf içerisinde toplayacaðýz
Bu sýnýfta seçeneklerimizi tutalým (Taþ, Kaðýt, Makas) ve bu uygulamayý çalýþtýran kiþinin ismini tutalým
2- a-) Kullanýcý bir seçim yapsýn ve seçimi geri dönen metod
b-) bilgisayara rastgele seçim yaptýrýp o seçimi dönen bir metod
3-Uygulama metodu yazalým bu metotda kullanýcý ismi Hoþgeldin taþ kaðýt makas oyunu baþlýyor gibi çýktý ver
bu çýktýdan sonra kullanýcýlara oyunun sonucunu dönelim
 */

public class App {
    public static void main(String[] args) {
        AppTkm oyun=new AppTkm();

        oyun.uygulama();

        oyun.uygulama2();

    }
}
