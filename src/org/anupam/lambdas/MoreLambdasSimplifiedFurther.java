package org.anupam.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MoreLambdasSimplifiedFurther {

    public static void main(String[] args){

        List<String> strings = new ArrayList<>(List.of("one","two","three","four","five"));

        Predicate<String> filter = string -> string.startsWith("t");
        strings.removeIf(filter);

        Consumer<String> action = string -> System.out.println(string);
        strings.forEach(action);
    }
}
