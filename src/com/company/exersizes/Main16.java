package com.company.exersizes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main16 {
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

        System.out.println("Input color ");
        String col= scanner.nextLine();
        colors.set(2,col);
        System.out.println(colors);
    }
}