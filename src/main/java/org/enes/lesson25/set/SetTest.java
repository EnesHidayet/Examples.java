package org.enes.lesson25.set;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {

//        Set<Integer> set=new HashSet<>(); // hash koduna göre gösterir.
//        Set<Integer> set=new LinkedHashSet<>(); // eklenen sıraya göre gösterir.

        Comparator<Integer>comparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        };


//        Set<Integer> set=new TreeSet<>((o1,o2)-> o2-o1); // burada lambda fonksiyon comporator ün işini yapıyor.
        Set<Integer> set=new TreeSet<>(); // treeSet sıralamalı yapar kendinde comparator var

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
