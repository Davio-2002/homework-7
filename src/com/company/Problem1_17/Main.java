package com.company.Problem1_17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main( String[] args ) {
        //create a new arrayList, add some colors (string) and print out the collection
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> newArrayList = new ArrayList<>();

        arrayList.add("red");
        arrayList.add("green");
        arrayList.add("blue");
        arrayList.add("black");

        newArrayList.add("purple");
        newArrayList.add("pink");
        newArrayList.add("yellow");
        newArrayList.add("red");

        //Iterate through the ArrayList
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        //insert an element into the array list at the first position.
        arrayList.add(1, "alpha");

        //retrieve an element (at a specified index) from a given array list.
        System.out.println(arrayList.get(2));

        //update specific array element by given element.
        arrayList.set(1, "yellow");

        //remove the third element from a arrayList.
        arrayList.remove(1);

        //search an element in a arrayList.
        System.out.println(arrayList.indexOf("yellow"));

        //sort a given arrayList
        Collections.sort(arrayList);
        System.out.println(Arrays.toString(arrayList.toArray()));

        //copy one arrayList into another
        System.out.println(arrayList.clone());

        //reverse elements in a arrayList
        Collections.reverse(arrayList);
        System.out.println(Arrays.toString(arrayList.toArray()));

        //compare two arrayLists
        System.out.println(arrayList.equals(newArrayList));

        //Write a program to swap two elements in an arrayList
        Collections.swap(arrayList, 1, 3);
        System.out.println(Arrays.toString(arrayList.toArray()));

        //join two arrayLists
        arrayList.addAll(newArrayList);
        System.out.println(Arrays.toString(arrayList.toArray()));

        //empty an arrayList
        newArrayList.clear();
        System.out.println(Arrays.toString(newArrayList.toArray()));

        //test an array list is empty or not
        System.out.println(newArrayList.isEmpty());

        //replace the second element of the ArrayList with the specified element.
        arrayList.set(1, "white");
        System.out.println(Arrays.toString(arrayList.toArray()));
    }
}