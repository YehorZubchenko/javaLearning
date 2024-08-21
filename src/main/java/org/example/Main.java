package org.example;

import org.example.objects.Person;

public class Main {
    public static void main(String[] args) {
        Person testPerson = new Person("Yehor4ik", "Zubas", 12);
        System.out.println(testPerson.getFirstName() + " " + testPerson.getLastName() + " " + testPerson.getAge());
    }
}