package com.company.ex21;

public class Main {

    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.setOn(false);
        tv1.setVolumeLevel(51);
        tv1.setChannel(17);
        System.out.println(tv1.getChannel());
        System.out.println(tv1.getVolumeLevel());
        System.out.println(tv1.isOn());
        System.out.println("**************");
        tv1.increaseVolume();
        tv1.increaseVolume();
        tv1.decreaseVolume();
        tv1.setChannel(87);
        tv1.turnOnOrOffTheTv();
        System.out.println(tv1.getChannel());
        System.out.println(tv1.getVolumeLevel());
        System.out.println(tv1.isOn());
    }
}