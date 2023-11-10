package org.enes.lesson14.ogrenciKayit;

import org.enes.lesson14.ogrenciKayit.DB;
import org.enes.lesson14.ogrenciKayit.Student;

public class StudentRepository {
        public int ogrenciSayisi=0;
    public void ogrenciKayit(String isim){
        Student student=new Student();
        student.ad=isim;
        student.ogrenciNo=ogrenciSayisi;

        DB.students[ogrenciSayisi++]=student;
        System.out.println(isim+" adlý öðrenci baþarý ile kayýt edildi öðrenci no===>"+ogrenciSayisi);

    }
}
