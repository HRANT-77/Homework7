package com.company.exersizes;

import java.util.ArrayList;

public class Main9 {
    public static void main(String[] args) {


        ArrayList<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("Red");
        colors.add("White");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Grey");
        colors.add("Yellow");

/*        ArrayList<String> colors1 = new ArrayList<>();
        for(int i=0;i< colors.size();i++){
            colors1.add(colors.get(i));
        }

 */
        ArrayList<String> colors1=colors;

        System.out.println(colors1);
    }
}
