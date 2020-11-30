package org.anupam.lambdas;

import java.util.function.Consumer;

public class ChainingLambdasSimplified {

    public static void main(String[] args){

        Consumer c1 = s -> System.out.println("c1 consumed "+s);

        Consumer c2 = s -> System.out.println("c2 consumed "+s);

        Consumer c3 = c1.andThen(c2);


        c3.accept("pranamam");
    }
}
