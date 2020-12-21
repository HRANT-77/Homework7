package com.company.ex21;

public class TV {

    private int channel;
    private int volumeLevel;
    private boolean on;

    public TV() {
    }

    public TV(int channel, int volumeLevel, boolean on) {
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.on = on;
    }

    public void turnOnOrOffTheTv() {
        if (isOn() == true) {
            on = false;
        } else {
            on = true;
        }
    }

    public void increaseVolume() {
        volumeLevel += 1;
    }

    public void decreaseVolume() {
        volumeLevel -= 1;
    }

    public void changeChannel(int channelNumber) {
        channel = channelNumber;
    }


    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}

