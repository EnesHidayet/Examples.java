package org.enes.lesson13;

public class StaticOrnek {
    // static olmayanlar de�i�kenlerde nesne de�i�keni
    int numara1;

    //Statik de�i�kenler s�n�f de�i�kenidir.
    static int numara2;
//Static de�i�kenler ve metotlar uygulama aya�a kalkt���nda nesne olu�turmadan olu�urlar
    public void numaraVer(){//bu metodu uygulama aya�a kalt���nda olu�mayaca�� i�in kullanamam bu metodu kullanmak i�in nesnye ihtiyac�mvar(newleme i�lemi)
        //Bu y�zden bu metot i�inde static olan veya olmayan de�i�kenler kullanabiliri.

        System.out.println("Numaraver metodu");
        numara1+=1;
        numara2+=1;
        System.out.println("numara 1====>"+numara1);
        System.out.println("numara 2====>"+numara2);

    }



    public static void numaraVer2(){
        System.out.println("Numaraver2 metodu");
        numara2++;
        System.out.println("numara2 ===> "+numara2);

    }//bu metotda static olmayan de�i�ken kullanamam ��nk� static olmayan de�i�kenler nesnelere ba�l�d�r
    //nesneler uygulama aya�a kalkt���nda de�il biz olu�turdu�umuzda etkinle�ir


}
