package com.company.Problem21;

import java.util.Random;
import java.util.Scanner;

enum Channel {
    CNN,
    BBC,
    Sport,
    Armenia
}

public class TV {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    //region Properties
    private int channel;
    private int volumeLevel;
    //endregion
    private boolean on;

    //region Constructors
    public TV() {
    }

    public TV( int channel, int volumeLevel, boolean on ) {
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.on = on;
    }
    //endregion

    //region Methods
    public void turnOnOrOffTheTv() {
        String want = scanner.nextLine();

        switch (want) {
            case "Y", "y" -> System.out.println("TV is on now");
            case "N", "n" -> {
                System.out.println("TV is off now");
                System.exit(0);
            }
            default -> {
                System.out.println("Something went wrong");
                System.exit(0);
            }
        }
    }

    public void increaseVolume(int up ) {;
        volumeLevel += up;

        System.out.println("Volume is -> " + volumeLevel);
    }

    public void decreaseVolume(int down) {
        if (volumeLevel - down < 1) {
            volumeLevel = 0;
        } else {
            volumeLevel -= down;
        }
        System.out.println("Volume is -> " + volumeLevel);
    }

    public void changeChannel( int changeNumber ) {
        if (changeNumber >= 1 && changeNumber <= 4) {
            TV tv = new TV(changeNumber, getVolumeLevel(), isOn());
            Channel[] channels = {Channel.Sport, Channel.CNN, Channel.BBC, Channel.Armenia};
            System.out.println("Channel is -> " + channels[changeNumber - 1]);
            System.out.println("Channel number is -> " + (tv.getChannel()));

            System.out.println();
        }
    }
    //endregion

    //region Getters and Setters

    public int getChannel() {
        return channel;
    }

    public void setChannel( int channel ) {
        this.channel = channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel( int volumeLevel ) {
        this.volumeLevel = volumeLevel;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn( boolean on ) {
        this.on = on;
    }
    //endregion
}
