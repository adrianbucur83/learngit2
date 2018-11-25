package com.learn.java;

import java.util.Comparator;

class AgeComparator implements Comparator<Person> {


    @Override
    public int compare(Person p1, Person p2) {
        int temp = 0;

        if (p1.getAge() < p2.getAge()) {
            temp = -1;
        }
        if (p1.getAge() == p2.getAge()) {
            temp = 0;

        }
        if (p1.getAge() > p2.getAge()) {
            temp = 1;
        }
        return temp;
    }
}
