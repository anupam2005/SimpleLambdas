package org.anupam.lambdas;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {

        public static void main(String[] args){

            //Supplier functional interface

            Supplier <String> supplier = () -> "Hello Supplier!";

            String result = supplier.get();

            System.out.println("result = "+result);

            //Consumer functional interface

            Consumer<String> consumer = (String s) -> System.out.println("Hello "+s);

            consumer.accept("Consumer");

            /* With mutile lines of code in lambda*/

            //Supplier functional interface

            Supplier <String> supplier1 = () -> {
                System.out.println("Multiple Liner supplier");
                return "Hello Supplier!";
            };

            String result1 = supplier1.get();

            System.out.println("result = "+result1);

            //Consumer functional interface

            Consumer<String> consumer1 = (String s) -> {
                System.out.println("Multiple Liner consumer");
                System.out.println("Hello "+s);
            };


            consumer1.accept("Consumer");


        }

}
