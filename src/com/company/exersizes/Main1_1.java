package com.company.exersizes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> colors = new ArrayList<>();

        for(int i=0;i<4;i++){
            System.out.println("Input color");
            colors.add(scanner.nextLine());
        }
        System.out.println(colors);
    }
}
