package com.sample;

import java.util.Iterator;
import java.util.Vector;

public class Demo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.ensureCapacity(11); // set minimum capecity
        System.out.println(vector.capacity()); // get capacity
        vector.add(10); // add element
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.set(2, 11); // add element at a position
        System.out.println(vector);
        System.out.println(vector.capacity());

        System.out.println("**** traversing the Vector");
        Iterator iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
