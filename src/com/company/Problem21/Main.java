package com.company.Problem21;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        TV tv = new TV(1, 5, true);

        System.out.print("Do you want to turn on the tv ? Type 'Y (also y)' or 'N (also n)' -> ");
        tv.turnOnOrOffTheTv();

        System.out.print("What channel, type a number -> ");
        int changeNumber = scanner.nextInt();

        System.out.println();
        tv.changeChannel(changeNumber);

        System.out.print("Increase or decrease ? Type 'I' or 'D' -> ");
        String incOrDec = scanner.nextLine();

        switch (incOrDec) {
            case "I" -> {
                System.out.print("How many ? -> ");
                int up = scanner.nextInt();
                tv.increaseVolume(up);
            }
            case "D" -> {
                System.out.print("How many ? -> ");
                int down = scanner.nextInt();
                tv.decreaseVolume(down);
            }
        }
    }
}
