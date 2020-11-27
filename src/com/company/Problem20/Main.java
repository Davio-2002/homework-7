package com.company.Problem20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Gender[] genders = {Gender.Male, Gender.Female};

        ArrayList<Author> authors = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + ". Name -> ");
            String name = scanner.nextLine();

            System.out.print("  Username -> ");
            String surname = scanner.nextLine();

            Author author = new Author(name, surname, genders[random.nextInt(2)]);
            authors.add(author);
        }

        System.out.print("Title -> ");
        String title = scanner.nextLine();
        double price = random.nextInt(90) + 10;

        Book book = new Book(title, authors, price);

        System.out.println();

        System.out.println("Book title -> " + book.getTitle());
        System.out.println("Price -> " + book.getPrice());
        System.out.println("Authors -> ");
        for (Author author : authors) {
            System.out.print(author.getName() + " ( Gender -> " + author.getGender() + " ), ");
        }
    }
}
