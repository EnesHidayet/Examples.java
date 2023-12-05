package org.enes.lesson25.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class KullaniciTest {
    Set<Kullanici>kullaniciSet;

    public KullaniciTest() {
        this.kullaniciSet=new HashSet<>();
        this.kullaniciSet.add(new Kullanici("yk1","123","yk1@gmail.com",25));
        this.kullaniciSet.add(new Kullanici("yk2","123","yk2@gmail.com",35));
        this.kullaniciSet.add(new Kullanici("yk3","123","yk3@gmail.com",28));
        this.kullaniciSet.add(new Kullanici("yk4","123","yk4@gmail.com",32));
    }


    public void kullaniciekle(){
        this.kullaniciSet.add(new Kullanici("yk4","123","yk4@gmail.com",32));
        // newleme yaptýðým için sette yk4 den iki tane var hashcodelarý farklý olduðu için ekliyor
        this.kullaniciSet.add(new Kullanici("yk5","123","yk5@gmail.com",38));
        this.kullaniciSet.add(new Kullanici("yk6","123","yk6@gmail.com",34));
        this.kullaniciSet.add(new Kullanici("yk7","123","yk7@gmail.com",36));
        this.kullaniciSet.add(new Kullanici("yk8","123","yk8@gmail.com",33));
    }

    public void kullaniciekle2(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen kullanýcý adý giriniz.");
        String kullaniciAdi=scanner.nextLine();
        System.out.println("Lütfen þifre giriniz.");
        String sifre=scanner.nextLine();
        System.out.println("Lütfen email giriniz.");
        String email=scanner.nextLine();
        System.out.println("Lütfen yaþýnýzý giriniz.");
        int yas=Integer.parseInt(scanner.nextLine());
        Kullanici yeniKullanici=new Kullanici(kullaniciAdi,sifre,email,yas);
        boolean kontrol=false;
        for (Kullanici kullanici:kullaniciSet){
            if (kullanici.getKullaniciAdi().equals(yeniKullanici.getKullaniciAdi())){
                System.out.println("Daha önce eklenmiþ.");
                break;
            }else {
                kontrol=true;
            }
        }
        if (kontrol){
            kullaniciSet.add(yeniKullanici);
        }
    }


    public static void main(String[] args) {

        System.out.println(Kullanici.kullaniciSayisi);

        KullaniciTest kullaniciTest=new KullaniciTest();
        kullaniciTest.kullaniciekle();
        kullaniciTest.kullaniciSet.forEach(x-> System.out.println(x.getKullaniciAdi()+" "+x.hashCode()));

    }
}
