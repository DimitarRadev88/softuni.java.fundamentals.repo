package com.objectsAndClasses.exercise.orderByAge;

public class Person {
    private String name;
    private String id;
    private int age;

    public Person(String name, String id, int age) {
        setName(name);
        setId(id);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s with ID: %s is %d years old.", this.name, this.id, this.age);
    }
}
