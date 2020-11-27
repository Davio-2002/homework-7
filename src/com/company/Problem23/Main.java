package com.company.Problem23;

import java.util.Arrays;

public class Main {

    public static void main( String[] args ) {
        DynamicIntArray dynamicArray = new DynamicIntArray();

        dynamicArray.add(45);
        dynamicArray.add(68);
        dynamicArray.add(99);
        dynamicArray.add(10);
        dynamicArray.add(78);
        dynamicArray.add(156);
        dynamicArray.add(16);
        dynamicArray.print();

        dynamicArray.addAll(new int[]{157, 987, 156, 468, 45});
        dynamicArray.print();

        dynamicArray.swap(2, 4);

        dynamicArray.size();

        dynamicArray.sort();

        System.out.println();

        dynamicArray.remove(0);
        dynamicArray.remove(0);
        dynamicArray.remove(0);

        System.out.println();

        System.out.println(dynamicArray.contains(1));

        System.out.println(Arrays.toString(dynamicArray.indexOf(156).getNumbers()));
    }
}