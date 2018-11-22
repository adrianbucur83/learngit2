package com.learn.java;

import java.util.*;

public class Main {


    public static void main(String[] args) {

     /*   Person[] people = new Person[3];

        people[0] = new Angajat("AAA bbbb", 30);
        people[1] = new Somer("person two", 20);
        people[2] = new Student("person three", 15);

        for(Person p: people){
            System.out.println(p.toString());
        }*/
/*
        List<Person> arrayPeople = new ArrayList<>();

        arrayPeople.add(new Angajat("Johny one", 14));
        arrayPeople.add(new Student("Student two", 14));
        arrayPeople.add(new Somer("Some three", 14));

        Iterator<Person> it = arrayPeople.iterator();

        System.out.println(arrayPeople.size());

        while (it.hasNext()){
            Person p = it.next();
            System.out.println(p);
           */

        ArrayList<Person> people = new ArrayList<>();


        people.add(new Angajat("Xania", 14, "1234"));
        people.add(new Somer("Lilly", 20, "1234"));
        people.add(new Somer("Bogdan", 36, "5555"));

        String nickname;

        Map<String, Person> harta = new HashMap<>();

        harta.put("Gigel", people.get(0));
        harta.put("Ani", people.get(1));
        harta.put("Cucu", people.get(2));
/*

        for (String key: harta.keySet()){
            System.out.println(harta.get(key) + "   " + key);
        }
*/
/*
        for (Map.Entry<String, Person> allentries : harta.entrySet()){

            System.out.println(allentries);
        }*/

//
//        for (Person p : harta.values()) {
//
//            System.out.println(p);
//        }


//        LinkedList<Person> coada = new LinkedList();
//
//        for (Person p : people) {
//            coada.add(p);}
//
//            for (Person pp : coada) {
//                if (pp.age > 30) {
//                    coada.remove(pp);
//                }
//
//            }
//
//
//            System.out.println("From que    " + coada.toString());


//
//        for (Person p : people
//             ) {
//            System.out.println(p.toString());
//        }
//


        //    Set<Person> orderedByAge = new TreeSet<>();
        //    Set<Person> orderedByAge = new TreeSet<>(new AgeComparator());
        Set<Person> orderedByAge = new TreeSet<>();
        orderedByAge.add(people.get(0));
        orderedByAge.add(people.get(1));
        orderedByAge.add(people.get(2));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println("Din treeset");
        System.out.println(orderedByAge);


    }


}









