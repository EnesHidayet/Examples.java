package org.enes.lesson13;

public class StaticOrnek {
    // static olmayanlar deðiþkenlerde nesne deðiþkeni
    int numara1;

    //Statik deðiþkenler sýnýf deðiþkenidir.
    static int numara2;
//Static deðiþkenler ve metotlar uygulama ayaða kalktýðýnda nesne oluþturmadan oluþurlar
    public void numaraVer(){//bu metodu uygulama ayaða kaltýðýnda oluþmayacaðý için kullanamam bu metodu kullanmak için nesnye ihtiyacýmvar(newleme iþlemi)
        //Bu yüzden bu metot içinde static olan veya olmayan deðiþkenler kullanabiliri.

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

    }//bu metotda static olmayan deðiþken kullanamam çünkü static olmayan deðiþkenler nesnelere baðlýdýr
    //nesneler uygulama ayaða kalktýðýnda deðil biz oluþturduðumuzda etkinleþir


}
