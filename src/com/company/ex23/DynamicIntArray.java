package com.company.ex23;

public class DynamicIntArray {
    private int[] array = new int[0];
    int index;
        //this is
    public int[] add(int num) {
        int[] array2 = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        array2[array2.length - 1] = num;
        array = array2;
        return array;
    }

    public int[] addAll(int[] array2) {
        int j=0;
        int[] newarray = new int[array.length + array2.length];
        for (int i = 0; i < array.length; i++) {
            newarray[i] = array[i];
        }
        for (int i = array.length; i < newarray.length; i++) {
            newarray[i] =array2[j];
            j++;
        }
        array=newarray;
            return array;
    }


    public boolean contains(int num){
        boolean ans=false;
        for(int i=0;i<array.length;i++){
            if(array[i]==num){
                ans=true;
            }
        }
        return ans;
    }

    public int[] remove(int index) {
        int[] array2 = new int[array.length - 1];
        for (int i = 0; i < index; i++) {
            array2[i] = array[i];
        }
        for (int i = index; i < array.length - 1; i++) {
            array2[i] = array[i + 1];
        }
        array = array2;
        return array;

    }

    public int[] swap(int index1, int index2) {
        int t = array[index1];
        array[index1] = array[index2];
        array[index2] = t;
        return array;
    }

    public int size() {
        return array.length;
    }

    public int[] sort(){
        int tmp=0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int k = 0; k < array.length - i - 1; k++) {
                if (array[k] > array[k + 1]) {
                    tmp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = tmp;
                }
            }
        }
        return array;
    }

    public int[] findindex(int element) {
        int[] indexArray=new int[array.length];
        int k=0;
        for (int i = 0; i < array.length; i++) {
            if (element == array[i]) {
                indexArray[k] = i;
                k++;
            }
        }
        /*for(int i=0;i<k+1;i++) {
            if (indexArray[i] != 0) {
                System.out.println(indexArray[i] + " ");
            }
        }*/
        return indexArray;
    }

    public void print(){
        for(int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
