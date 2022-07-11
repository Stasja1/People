package ru.netology;

public class Person {
    public static final String NO_ADDRESS = "Нет адреса ";
    public static final int NO_AGE = 0;
    protected String name;
    protected String surname;
    private String address;
    private int age;

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        happyBirthday();
        return this.age;
    }
    public String getAddress() {
        return address != null ? address : NO_ADDRESS;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (age > 0) {
            this.age = age + 1;
        }
    }
    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().surname(surname).address(address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + getAge() +
                ", address='" + address + '\'' +
                '}';
    }
}