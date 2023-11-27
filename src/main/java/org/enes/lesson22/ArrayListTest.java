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

        System.out.println(arrayList1.set(2,96)); // deðiþtirdiði elemaný yazdýrýyor.
        System.out.println(arrayList1.get(2));

        System.out.println(arrayList1.remove(new Integer(8)));// true veya false bilgisi veriyor ve öyle deðiþtiriyor.
        System.out.println(arrayList1.remove(1));
        System.out.println(arrayList1);
        arrayList1.add(26);
        arrayList1.add(32);

        arrayList2.add(100);
        arrayList2.add(200);
        arrayList2.add(300);

        System.out.println(arrayList2);
//        arrayList2.addAll(arrayList1);  // indexsiz verirsek sondan itibaren ekler
        arrayList2.addAll(1,arrayList1);  // dilediðim indexten sonrasýna listeyi ekliyor.
        System.out.println(arrayList2);
        System.out.println(arrayList1);

        System.out.println(arrayList2);
        System.out.println(arrayList2.removeAll(arrayList1));

        System.out.println(arrayList2.size());
        System.out.println(arrayList2.contains(100));
        System.out.println(arrayList2.contains(180));
        arrayList2.addAll(arrayList1);
        //arraylist2 listesi arraylit2 listesini içeriyor mu?
        System.out.println(arrayList2.containsAll(arrayList1));

        // iki þekilde de listi arraye çevirebiliyoruz.
        Integer [] array= arrayList1.toArray(new Integer[arrayList1.size()] );
        Integer [] array2= arrayList2.toArray(new Integer[0]);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

        Integer[] array3={400,500,600};

        //bu deðiþtirilemez bir yap oluþturuyor arrayList3 bir array gibi davranýyor.
        List<Integer> arrayList3=Arrays.asList(array3);
//        arrayList3.add(700); //bunu yapamýyoruz.
        System.out.println(arrayList3);

        //Arrayden listeye çevirme iþlemi
        //burada artýk istediðimizi ekleyebiliriz.Parantez içi sayesinde new leme yapmýþýz gibi oluyor.
        List<Integer> arrayList4=new ArrayList<>(Arrays.asList(array3));
        arrayList4.add(700);
        System.out.println(arrayList4);
        //Parantez içi sayesinde new leme yapmýþýz gibi oluyo
        List<Integer> arrayList5=new ArrayList<>(arrayList1);
        System.out.println(arrayList5);


        //substring gibi çalýþýyor list bölmeye yarýyor.
        List<Integer> arrayList6=arrayList4.subList(0,2); //baþlangýç indexini alýr bitiþ indexini almaz.
        System.out.println(arrayList6);

    }
}
