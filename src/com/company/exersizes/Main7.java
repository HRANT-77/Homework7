package com.company.exersizes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("Red");
        colors.add("White");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Grey");
        colors.add("Yellow");

        System.out.println(colors);
do {
    System.out.println("Input color ");
    String collor1 = scanner.next();
    int count = 0;
    for (int i = 0; i < colors.size(); i++) {
        if (colors.get(i).equals(collor1)) {
            System.out.println("This color contains in ArrayList");
            count += 1;
        }
    }
    if (count == 0) {
        System.out.println("This color not contains in ArrayList");
    }
}while(true);
    }
}