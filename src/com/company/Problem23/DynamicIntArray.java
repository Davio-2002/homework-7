package com.company.Problem23;

import java.util.Arrays;

public class DynamicIntArray {
    private int[] numbers = new int[0];

    public DynamicIntArray() {

    }

    public void add( int number ) {
        int[] newNumbers = new int[numbers.length + 1];
        System.arraycopy(numbers, 0, newNumbers, 0, numbers.length);
        newNumbers[newNumbers.length - 1] = number;
        numbers = newNumbers;
    }

    public int[] array() {
        return numbers;
    }

    public void addAll( int[] concatenationArray ) {
        int[] newNumbers = new int[numbers.length + concatenationArray.length];
        System.arraycopy(numbers, 0, newNumbers, 0, numbers.length);
        for (int i = concatenationArray.length - 1; i >= 0; i--) {
            newNumbers[newNumbers.length - i - 1] = concatenationArray[i];
        }
        numbers = newNumbers;
    }

    public void remove( int index ) {
        int[] newNumbers = new int[numbers.length - 1];
        for (int i = 0, k = 0; i < numbers.length; i++) {
            if (i == index) {
                continue;
            }

            newNumbers[k++] = numbers[i];
        }
        numbers = newNumbers;
        System.out.println(Arrays.toString(numbers));
    }

    public boolean contains( int number ) {
        boolean contains = false;
        for (int j : numbers) {
            if (j == number) {
                contains = true;
                break;
            }
        }
        return contains;
    }

    public void swap( int firstIndex, int secondIndex ) {
        int temp = numbers[firstIndex];
        numbers[firstIndex] = numbers[secondIndex];
        numbers[secondIndex] = temp;

        System.out.println(Arrays.toString(numbers));
    }

    public void size() {
        System.out.println(numbers.length);
    }

    public void sort() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    public DynamicIntArray indexOf( int number ) {
        DynamicIntArray indexes = new DynamicIntArray();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                indexes.add(i);
            }
        }
        return indexes;
    }

    public void print() {
        System.out.println(Arrays.toString(numbers));
    }

    public int[] getNumbers() {
        return numbers;
    }

//    public void setNumbers( int[] numbers ) {
//        this.numbers = numbers;
//    }
}