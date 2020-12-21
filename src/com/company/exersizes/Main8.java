package com.company.exersizes;

import java.util.ArrayList;
import java.util.Collections;

public class Main8 {
    public static void main(String[] args) {


        ArrayList<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("Red");
        colors.add("White");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Grey");
        colors.add("Yellow");

        Collections.sort(colors);
        System.out.println(colors);
    }
}
