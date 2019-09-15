package com.lzawada.grouping.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Person {
    private final String name;
    private final String country;
    private final String city;
    private final Pet pet;
    private LocalDate date;

    public Person(String name, String country, String city, Pet pet, LocalDate date) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.pet = pet;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public Pet getPet() {
        return pet;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", pet=" + pet +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(country, person.country) &&
                Objects.equals(city, person.city) &&
                Objects.equals(pet, person.pet) &&
                Objects.equals(date, person.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country, city, pet, date);
    }
}