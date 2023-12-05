package org.enes.lesson25.set;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {

//        Set<Integer> set=new HashSet<>(); // hash koduna g�re g�sterir.
//        Set<Integer> set=new LinkedHashSet<>(); // eklenen s�raya g�re g�sterir.

        Comparator<Integer>comparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        };


//        Set<Integer> set=new TreeSet<>((o1,o2)-> o2-o1); // burada lambda fonksiyon comporator �n i�ini yap�yor.
        Set<Integer> set=new TreeSet<>(); // treeSet s�ralamal� yapar kendinde comparator var

        set.add(5);
        set.add(4);
        set.add(6);
        set.add(8);
        set.add(3);
        set.add(9);
        set.add(5);
        set.add(5);
        set.forEach(System.out::println);



    }
}
