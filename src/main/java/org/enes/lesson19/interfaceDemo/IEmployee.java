package org.enes.lesson19.interfaceDemo;
/*
1-�nterfacelerde genellikle g�vdeli metodlar kullan�lmaz
istisna olarak default ve static g�vdeli metotlar yaz�labilir
2-interfaceler bir kontrat interfaceler saece davran��lar� belirler i�eri�ini belirlemez.
3-interfacelerde tan�mlad���m metotlar default olarak public metotlard�r.
4-interfacelerde de�i�ken tan�mlanmaz.Static de�i�kenler hari�.
5-�nterfacelerden nesne olu�turulamaz.newleme i�lemi yap�lamaz bu y�zden de nesne de�i�kenleri
olamayaca�� i�in sadece static de�i�kenler tan�mlayabiliriz.
6-Java �oklu kal�t�ma izin vermez
 */

public interface IEmployee {
    void requestVacation();

    void leaveWork();

    void requestSalary();


}
