package com.company.exersizes;

import java.util.ArrayList;

public class Main6 {
    public static void main(String[] args) {


        ArrayList<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("Red");
        colors.add("White");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Grey");
        colors.add("Yellow");

        colors.remove(3);
        System.out.println(colors);
    }
}
