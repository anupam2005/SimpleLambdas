package org.anupam.lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CreatingComplexComparators {

    public static void main(String[] a){

        Person anupam1 = new Person("Anupam",37);
        Person anupam2 = new Person("Anupam",36);
        Person aditya = new Person("Aditya",34);
        Person vivek = new Person("Vivek",35);
        Person deepak = new Person("Deepak",39);

        List<Person> persons = new ArrayList<Person>(List.of(anupam1,anupam2,aditya,vivek,deepak));

        Comparator<Person> comp1 = Comparator.comparing(p -> p.getName());

        Comparator<Person> comp2 = Comparator.comparing(p -> p.getAge());

        Comparator<Person> comp3 = comp1.thenComparing(comp2);

        Comparator<Person> comp4 = comp3.reversed();

        persons.sort(comp4);

        persons.forEach(p -> System.out.println(p));


    }




}
