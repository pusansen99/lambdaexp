package com.deloitte.exercise;

import java.util.*;

public class Exercise {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Charles", "Dickens", 50),
                new Person("Lewis", "Carroll", 45),
                new Person("Enid", "Blyton", 55)
        ));

        //#1 Sort list by last name.
        System.out.println("#1\n");
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getFirstName());
            }
        });
        System.out.println("Sorted\n");
        
        //#2 Create a method to print the all the elements present in the list.
        System.out.println("#2\n");
        printAll(people);

        //#3 Create a method to print the all the people whose last name starts with 'C'.
        System.out.println("\n#3\n");
        printLastNamewithC(people);

    }

    private static void printLastNamewithC(List<Person> people) {
        for (Person p : people) {
            if (p.getLastName().startsWith("C")) {
                System.out.println(p);
            }
        }
    }

    private static void printAll(List<Person> people) {
        for(Person p : people) {
            System.out.println(p);
        }
    }
}
