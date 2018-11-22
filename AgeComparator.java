package com.learn.java;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {


    @Override
    public int compare(Person p1, Person p2) {
        int temp = 0;

        if (p1.age < p2.age) {
            temp = -1;
        }
        if (p1.age == p2.age) {
            temp = 0;

        }
        if (p1.age > p2.age) {
            temp = 1;
        }
        return temp;
    }
}
