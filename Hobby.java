package com.learn.java;

import java.util.ArrayList;
import java.util.Collections;


class Hobby {
/*
    Name of hobby (String) – eq: cycling, swimming
    Frequency (int) – how many times a week they practice it
    List of Addresses where this hobby can be practiced (List<Adresa>)*/

    private String hobbyName;
    private int frequency;
    private ArrayList<Address> addresses = new ArrayList<>();

    public Hobby(String hobbyName, int frequency, Address... address) {
        this.hobbyName = hobbyName;
        this.frequency = frequency;

        Collections.addAll(this.addresses, address);

    }

    public String getHobbyName() {
        return hobbyName;
    }

    public int getFrequency() {
        return frequency;
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    @Override
    public String toString() {
        return "\n" + "Hobby {" +
                "hobbyName='" + hobbyName + '\'' +
                ", frequency=" + frequency +
                ", addresses=" + addresses +
                '}';
    }
}
