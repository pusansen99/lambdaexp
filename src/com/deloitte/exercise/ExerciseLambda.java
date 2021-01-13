package com.deloitte.exercise;

import java.util.*;
import java.util.concurrent.locks.Condition;

public class ExerciseLambda {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Charles", "Dickens", 50),
                new Person("Lewis", "Carroll", 45),
                new Person("Enid", "Blyton", 55)
        ));

        //#1 Sort list by last name.
        System.out.println("#1\n");
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
        System.out.println("Sorted\n");

        //#2 Create a method to print the all the elements present in the list.
        System.out.println("#2\n");
        printCondition(people, p -> true);

        //#3 Create a method to print the all the people whose last name starts with 'C'.
        System.out.println("\n#3\n");
        printCondition(people, p -> p.getLastName().startsWith("C"));

    }

    private static void printCondition(List<Person> people, Condition condition) {
        for (Person p : people) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }
    }
    interface Condition {
        boolean test(Person p);
    }
}
