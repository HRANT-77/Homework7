package com.company.exersizes;

import java.util.ArrayList;

public class main13 {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("Red");
        colors.add("White");

        ArrayList<String> colors1 = new ArrayList<>();
        colors1.add("Green");
        colors1.add("Blue");
        colors1.add("Grey");
        colors1.add("Yellow");

        ArrayList<String> colors2 = new ArrayList<>();

        for (int i = 0; i < colors.size(); i++) {
            colors2.add(colors.get(i));
        }
        for(int i=0;i<colors1.size();i++){
            colors2.add(colors1.get(i));
        }
        System.out.println("First colors list "+colors);
        System.out.println("Second colors list "+colors1);
        System.out.println("Joined colors list "+colors2);
    }
}
