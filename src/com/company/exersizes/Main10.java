package com.company.exersizes;

import java.util.ArrayList;

public class Main10 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("Red");
        colors.add("White");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Grey");
        colors.add("Yellow");
        colors.add("Brown");

        String tmp;
        int size = colors.size()-1;
        for (int i = 0; i < colors.size() / 2; i++) {
            tmp = colors.get(i);
            colors.set(i, colors.get(size));
            colors.set(size, tmp);
            size--;
        }
        System.out.println(colors);

    }
}