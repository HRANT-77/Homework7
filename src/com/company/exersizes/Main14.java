package com.company.exersizes;

import java.util.ArrayList;

public class Main14 {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("Red");
        colors.add("White");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Grey");

        System.out.println(colors);
        colors.removeAll(colors);
        System.out.println("After remove");
        System.out.println(colors);
    }
}
