package com.company.ex19;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setRole(User.typeOfRole.ADMIN);
        user1.setUsername("John");
        user1.setPassword("Abfrg234%");

        User user2 = new User();
        user2.setRole(User.typeOfRole.ADMIN);
        user2.setUsername("Bob");
        user2.setPassword("bfrg234%");

        User user3 = new User();
        user3.setRole(User.typeOfRole.CUSTOMER);
        user3.setUsername("Armen");
        user3.setPassword("Abfrg%");

        User user4 = new User();
        user4.setRole(User.typeOfRole.CUSTOMER);
        user4.setUsername("Anna");
        user4.setPassword("Abfrg234%#");

        User user5 = new User();
        user5.setRole(User.typeOfRole.CUSTOMER);
        user5.setUsername("Ashot");
        user5.setPassword("gfasyergh");

        User user6 = new User();
        user6.setRole(User.typeOfRole.CUSTOMER);
        user6.setUsername("David");
        user6.setPassword("126484");

        User user7 = new User();
        user7.setRole(User.typeOfRole.CUSTOMER);
        user7.setUsername("Karen");
        user7.setPassword("&&#%^^#^$%&");

        User user8 = new User();
        user8.setRole(User.typeOfRole.CUSTOMER);
        user8.setUsername("Petros");
        user8.setPassword("Abopphfdi");

        User user9 = new User();
        user9.setRole(User.typeOfRole.CUSTOMER);
        user9.setUsername("Maria");
        user9.setPassword("ASF!@$#%@#DGASDA`11`3");

        User user10 = new User();
        user10.setRole(User.typeOfRole.CUSTOMER);
        user10.setUsername("Anush");
        user10.setPassword("AASGFDGHSE");

        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);

    }
}
