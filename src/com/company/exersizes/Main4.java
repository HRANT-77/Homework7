package com.company.exersizes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {
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

        System.out.print("Input index ");
        int index= scanner.nextInt();
        System.out.println(colors.get(index));
    }
}
