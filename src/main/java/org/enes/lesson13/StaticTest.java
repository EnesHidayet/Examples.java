package org.enes.lesson13;

public class StaticTest {
    public static void main(String[] args) {

        //System.out.println(StaticOrnek.numara2);
        //System.out.println(StaticOrnek.numara1);
        StaticOrnek staticOrnek1=new StaticOrnek();
        StaticOrnek staticOrnek2=new StaticOrnek();
        staticOrnek1.numara1=5;
        staticOrnek2.numara1=10;
        System.out.println(staticOrnek1.numara1);
        System.out.println(staticOrnek1.numara2);
        System.out.println("===================");
        System.out.println(staticOrnek2.numara1);
        System.out.println(staticOrnek2.numara2);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println(StaticOrnek.numara2);
        System.out.println("///////////////////");
        staticOrnek1.numaraVer();
        System.out.println(staticOrnek1.numara1);//numaraver yaptýk 6 çýkar
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println(staticOrnek2.numara1);//numaraver yapmadýk 10 olarak çýkar
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("1.nesne====>"+staticOrnek1.numara2);//numaraverde ne yaparsan ikisi içindeo gelir
        System.out.println("2.nesne====>"+staticOrnek2.numara2);
        System.out.println(StaticOrnek.numara2);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        StaticOrnek.numaraVer2();
        System.out.println(StaticOrnek.numara2);
        staticOrnek2.numaraVer();
        System.out.println(staticOrnek1.numara1);//6
        System.out.println(staticOrnek2.numara1);//11
        System.out.println("1.nesne====>"+staticOrnek1.numara2);//3 zaten static ikisi ayný çýkar
        System.out.println("2.nesne====>"+staticOrnek2.numara2);//3

    }

}
