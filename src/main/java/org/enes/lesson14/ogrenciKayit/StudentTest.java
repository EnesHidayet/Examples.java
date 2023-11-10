package org.enes.lesson14.ogrenciKayit;

import org.enes.lesson14.ogrenciKayit.StudentRepository;

public class StudentTest {

    public static void main(String[] args) {
        StudentRepository repository=new StudentRepository();

        repository.ogrenciKayit("Enes");
        repository.ogrenciKayit("Hidayet");
        repository.ogrenciKayit("ASLAN");
        repository.ogrenciKayit("Ali");
        repository.ogrenciKayit("Veli");
        repository.ogrenciKayit("Ahmet");
        repository.ogrenciKayit("Mehmet");


    }


}
