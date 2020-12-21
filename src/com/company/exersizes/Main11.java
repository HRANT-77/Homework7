package com.company.exersizes;

import java.util.ArrayList;

public class Main11 {
    public static void main(String[] args) {


        ArrayList<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("Red");
        colors.add("White");

        System.out.println(colors+" colors");
        ArrayList<String> colors1 = new ArrayList<>();
        colors1.add("Black");
        colors1.add("Red");
        colors1.add("White");

        System.out.println(colors1+" colors1");

        ArrayList<String> colors2 = new ArrayList<>();
        colors2.add("Red");
        colors2.add("Black");
        colors2.add("White");
        System.out.println(colors2+" colors2");

        if(colors.equals(colors1)){
            System.out.println("Colors is equal colors1");
        }
        else{
            System.out.println("Colors is not equal colors1");
        }
        if(colors.equals(colors2)){
            System.out.println("Colors is equal colors2");
        }
        else{
            System.out.println("Colors is not equal colors2");
        }
    }
}
