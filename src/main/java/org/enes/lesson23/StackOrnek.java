package org.enes.lesson23;

import java.util.Stack;

public class StackOrnek {
    public static void main(String[] args) {

        Stack<Integer>stack=new Stack<>();
        Integer sayi=stack.push(5); // push metodu eklenen ifadeyi döner
        System.out.println(sayi);
        stack.push(8);
        boolean deger=stack.add(15); // add metodu boolean döner
        System.out.println(deger);

        stack.push(25);
        System.out.println(stack.get(1));

        System.out.println(stack.peek());
        int sayi2=stack.peek();
        System.out.println(sayi2);
        System.out.println("pop metodu ==>"+stack.pop()); // pop en üstteki deðeri alýp çýkarýyor.
        System.out.println(stack.peek());


    }
}
