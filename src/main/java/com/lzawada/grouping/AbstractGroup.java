package com.lzawada.grouping;

import com.lzawada.grouping.model.Person;
import com.lzawada.grouping.model.Pet;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public abstract class AbstractGroup {

    protected static List<Person> buildPersonsList() {
        Person person1 = new Person("John", "USA", "NYC", new Pet("Max", 5), LocalDate.of(2000,1,1));
        Person person2 = new Person("Steve", "UK", "London", new Pet("Lucy", 8), LocalDate.of(1999,2,2));
        Person person3 = new Person("Anna", "USA", "NYC", new Pet("Buddy", 12), LocalDate.of(1985,2,2) );
        Person person4 = new Person("Mike", "USA", "Chicago", new Pet("Duke", 10), LocalDate.of(2005, 2, 2));
        Person person11 = new Person("John", "USA", "NYC", new Pet("Max", 5), LocalDate.of(1988,2,2));
        Person person12 = new Person("John", "USA", "NYC", new Pet("Max", 5), LocalDate.of(2001,2,2));
        Person person13 = new Person("John", "USA", "NYC", new Pet("Max", 5), LocalDate.of(1999,2,2));

        return Arrays.asList(person1, person2, person3, person4, person11, person12, person13);
    }
}
