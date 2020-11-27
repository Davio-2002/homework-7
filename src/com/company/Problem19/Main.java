package com.company.Problem19;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();

        Role[] roles = {Role.ADMIN, Role.CUSTOMER};
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Username -> ");
            String username = scanner.nextLine();
            System.out.print(" Password -> ");
            String password = scanner.nextLine();
            User user = new User();
            user.setPassword(password);
            if (i < 8) {
                if (user.passwordIsValid()) {
                    user = new User(username, password, roles[1]);
                } else {
                    user = new User(username, roles[1]);
                }
            } else {
                if (user.passwordIsValid()) {
                    user = new User(username, password, roles[0]);
                } else {
                    user = new User(username, roles[0]);
                }
            }
            users.add(user);
        }

        for (User user : users) {
            if (user.getPassword() == null) {
                System.out.println("Username -> " + user.getUsername() + ", Role -> " + user.getRole());
            } else {
                System.out.println("Username -> " + user.getUsername() + ", Password -> " + user.getPassword() + ", Role -> " + user.getRole());
            }
        }
    }
}
