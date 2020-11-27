package com.company.Problem18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        ArrayList<Product> arrayOfPrices = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String title = scanner.nextLine();
            Product product = new Product(title, random.nextInt(50) + 50, random.nextInt(10));
            arrayOfPrices.add(product);
        }

        for (int i = 0; i < arrayOfPrices.size(); i++) {
            for (int j = 0; j < arrayOfPrices.size() - i - 1; j++) {
                if (arrayOfPrices.get(j).getRating() < arrayOfPrices.get(j + 1).getRating()) {
                    Collections.swap(arrayOfPrices, j, j+1);
                }
            }
        }

        System.out.println();

        System.out.println("Best rated product is -> " + arrayOfPrices.get(0));

        System.out.println("Here is the rating of the top 10 products -> ");
        for (int i = 0; i < arrayOfPrices.size(); i++) {
            Product product = arrayOfPrices.get(i);
            System.out.println((i + 1) + ". Title - " + product.getTitle() + ", Rating - " + product.getRating() + ", Price - " + product.getPrice() + "$");
        }
    }
}
