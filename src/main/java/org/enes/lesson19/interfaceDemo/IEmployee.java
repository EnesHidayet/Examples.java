package org.enes.lesson19.interfaceDemo;
/*
1-Ýnterfacelerde genellikle gövdeli metodlar kullanýlmaz
istisna olarak default ve static gövdeli metotlar yazýlabilir
2-interfaceler bir kontrat interfaceler saece davranýþlarý belirler içeriðini belirlemez.
3-interfacelerde tanýmladýðým metotlar default olarak public metotlardýr.
4-interfacelerde deðiþken tanýmlanmaz.Static deðiþkenler hariç.
5-Ýnterfacelerden nesne oluþturulamaz.newleme iþlemi yapýlamaz bu yüzden de nesne deðiþkenleri
olamayacaðý için sadece static deðiþkenler tanýmlayabiliriz.
6-Java çoklu kalýtýma izin vermez
 */

public interface IEmployee {
    void requestVacation();

    void leaveWork();

    void requestSalary();


}
