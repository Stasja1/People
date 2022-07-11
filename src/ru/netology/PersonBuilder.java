package ru.netology;

import java.util.Objects;

public class PersonBuilder {

    private Person newPerson;

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    protected int age;
    protected String address;
    protected String name;
    protected String surname;

    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder surname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder age(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Неверный возвраст");
        } else {
            this.age = age;
        }
        return this;
    }

    public PersonBuilder address(String address) {
        this.address = address;
        return this;
    }

    public Person build() {

        newPerson = new Person(name, surname, age, address);
        if (name == null | surname == null | address == null){
            throw new IllegalStateException("Должны быть заполненны эти данные");
        }
        return newPerson;

    }
}