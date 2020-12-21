package com.company.ex23;

public class Main {

    public static void main(String[] args) {

        DynamicIntArray dynamicIntArray = new DynamicIntArray();

        int[] array3 = new int[3];
        int k = 2;
        for (int i = 0; i < array3.length; i++) {
            array3[i] = k;
            k++;
        }

        dynamicIntArray.add(12);
        dynamicIntArray.add(8);
        dynamicIntArray.add(2);
        dynamicIntArray.add(6);
        dynamicIntArray.add(8);
        dynamicIntArray.add(1);
        dynamicIntArray.addAll(array3);
        dynamicIntArray.print();
        System.out.println();
        dynamicIntArray.findindex(12);
        System.out.println("Is array contains 7 ? " + dynamicIntArray.contains(7));
        System.out.println("Is array contains 8 ? " + dynamicIntArray.contains(8));
        dynamicIntArray.remove(4);
        System.out.println("Remove array[4] ");
        dynamicIntArray.print();
        System.out.println();
        System.out.println("Swap array[3] and array[4]");
        dynamicIntArray.swap(3, 4);
        dynamicIntArray.print();
        System.out.println();
        System.out.println("Size of array is : " + dynamicIntArray.size());

        dynamicIntArray.sort();
        System.out.print("After sorting array : ");
        dynamicIntArray.print();


    }
}

