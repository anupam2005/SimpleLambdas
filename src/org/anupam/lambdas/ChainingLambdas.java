package org.anupam.lambdas;

import java.util.function.Consumer;

public class ChainingLambdas {

    public static void main(String[] args){

        Consumer c1 = s -> System.out.println("c1 consumed "+s);

        Consumer c2 = s -> System.out.println("c2 consumed "+s);

        Consumer c3 = s ->{

            c1.accept(s);

            c2.accept(s);
        } ;


        c3.accept("Hola");
    }


}
