package com.company.exersizes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main12 {
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
        System.out.println("Input first index ");
        int i1= scanner.nextInt();
        System.out.println("Input second index ");
        int i2= scanner.nextInt();
        String tmp= colors.get(i1);
        colors.set(i1, colors.get(i2));
        colors.set(i2,tmp);
        System.out.println(colors+" after swap");
    }
}