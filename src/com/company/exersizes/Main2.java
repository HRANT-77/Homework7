package com.company.exersizes;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {


        ArrayList<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("Red");
        colors.add("White");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Grey");
        colors.add("Yellow");

        for (int i=0;i<colors.size();i++){
            System.out.println(colors.get(i));
        }
    }
}
