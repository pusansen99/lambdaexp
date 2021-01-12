package com.deloitte.exercise;

import java.util.Arrays;
import java.util.List;

public class Exercise {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 50),
                new Person("Lewis", "Carroll", 45),
                new Person("Enid", "Blyton", 55)
        );
    }
}
