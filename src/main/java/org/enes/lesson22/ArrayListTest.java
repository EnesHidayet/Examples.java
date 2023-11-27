package org.enes.lesson22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {

        List<Integer> arrayList1=new ArrayList<>();
        ArrayList<Integer> arrayList2=new ArrayList<>();

        arrayList1.add(6);
        arrayList1.add(5);
        System.out.println(arrayList1);
        arrayList1.add(0,8);
        System.out.println(arrayList1);

        System.out.println(arrayList1.get(2));

        System.out.println(arrayList1.set(2,96)); // de�i�tirdi�i eleman� yazd�r�yor.
        System.out.println(arrayList1.get(2));

        System.out.println(arrayList1.remove(new Integer(8)));// true veya false bilgisi veriyor ve �yle de�i�tiriyor.
        System.out.println(arrayList1.remove(1));
        System.out.println(arrayList1);
        arrayList1.add(26);
        arrayList1.add(32);

        arrayList2.add(100);
        arrayList2.add(200);
        arrayList2.add(300);

        System.out.println(arrayList2);
//        arrayList2.addAll(arrayList1);  // indexsiz verirsek sondan itibaren ekler
        arrayList2.addAll(1,arrayList1);  // diledi�im indexten sonras�na listeyi ekliyor.
        System.out.println(arrayList2);
        System.out.println(arrayList1);

        System.out.println(arrayList2);
        System.out.println(arrayList2.removeAll(arrayList1));

        System.out.println(arrayList2.size());
        System.out.println(arrayList2.contains(100));
        System.out.println(arrayList2.contains(180));
        arrayList2.addAll(arrayList1);
        //arraylist2 listesi arraylit2 listesini i�eriyor mu?
        System.out.println(arrayList2.containsAll(arrayList1));

        // iki �ekilde de listi arraye �evirebiliyoruz.
        Integer [] array= arrayList1.toArray(new Integer[arrayList1.size()] );
        Integer [] array2= arrayList2.toArray(new Integer[0]);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

        Integer[] array3={400,500,600};

        //bu de�i�tirilemez bir yap olu�turuyor arrayList3 bir array gibi davran�yor.
        List<Integer> arrayList3=Arrays.asList(array3);
//        arrayList3.add(700); //bunu yapam�yoruz.
        System.out.println(arrayList3);

        //Arrayden listeye �evirme i�lemi
        //burada art�k istedi�imizi ekleyebiliriz.Parantez i�i sayesinde new leme yapm���z gibi oluyor.
        List<Integer> arrayList4=new ArrayList<>(Arrays.asList(array3));
        arrayList4.add(700);
        System.out.println(arrayList4);
        //Parantez i�i sayesinde new leme yapm���z gibi oluyo
        List<Integer> arrayList5=new ArrayList<>(arrayList1);
        System.out.println(arrayList5);


        //substring gibi �al���yor list b�lmeye yar�yor.
        List<Integer> arrayList6=arrayList4.subList(0,2); //ba�lang�� indexini al�r biti� indexini almaz.
        System.out.println(arrayList6);

    }
}
