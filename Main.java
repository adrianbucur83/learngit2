package com.learn.java;

import java.util.*;

class Main {


    public static void main(String[] args) {


        ArrayList<Person> people = new ArrayList<>();


        people.add(new Angajat("Zara", 14, "1234"));
        people.add(new Somer("Petru", 20, "1234"));
        people.add(new Student("Bogdan", 36, "5555"));
        people.add(new Angajat("Cedru", 40, "14234"));
        people.add(new Somer("Daniela", 50, "123544"));
        people.add(new Student("George", 39, "5445555"));


        Set<Person> orderedByAge = new TreeSet<>(new AgeComparator());

        orderedByAge.addAll(people);

        System.out.println("Lista persoane ordonata dupa varsta \n");
        System.out.println(orderedByAge);

        // cheat here
        // Collections.sort(orderedByAge, Comparator.comparingInt(o -> o.age));
        // Collections.sort(orderedByAge, Comparator.comparing(o -> o.name));

        //Sort by name now

        Set<Person> orderedByName = new TreeSet<>(new NameComparator());

        orderedByName.addAll(people);

        System.out.println("Lista persoane ordonata dupa nume");
        System.out.println(orderedByName);


        // part two, hobbies


        Set<Hobby> hobbies = new HashSet<>();

        Address addr1 = new Address("Romania", "Cluj", "Gruia", "58");
        Address addr2 = new Address("Hungary", "Budapest", "Bfffa", "28");
        Address addr3 = new Address("Germany", "Berlin", "Schnitzelstrasse", "8");

        Hobby cycling = new Hobby("cycling", 10, addr1, addr2, addr3);
        Hobby tennis = new Hobby("tennis", 5, addr3);
        Hobby reading = new Hobby("reading", 500, addr1, addr3);

        hobbies.add(cycling);
        hobbies.add(tennis);
        hobbies.add(reading);

        //transform set into list for part 2 of the homework

        ArrayList<Hobby> hobbiesAsList = new ArrayList(hobbies);

        Person p = people.get(0);

        HashMap<Person, List<Hobby>> personAndHobbies = new HashMap<>();

        personAndHobbies.put(p, hobbiesAsList);

        System.out.println();
        System.out.println("------------------ Person & hobbies --------------");
        System.out.println();

        System.out.println("Hobbies for person " + p.getName());
        personAndHobbies.get(p).forEach(x -> {
            System.out.println(x.getHobbyName() + " is practiced in:");
            x.getAddresses().forEach(y -> System.out.println(y.getCountry()));
            System.out.println();
        });


    }


}









