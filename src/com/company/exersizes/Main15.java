package com.company.exersizes;

import java.util.ArrayList;

public class Main15 {
    public static void main(String[] args) {


        ArrayList<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("Red");
        colors.add("White");
        ArrayList<String> colors1=new ArrayList<>();

        if(colors.isEmpty()){
            System.out.println("colors is empty");
        }
        else{
            System.out.println("colors is not empty");
        }

        if(colors1.isEmpty()){
            System.out.println("colors1 is empty");
        }
        else{
            System.out.println("colors1 is not empty");
        }
    }
}
