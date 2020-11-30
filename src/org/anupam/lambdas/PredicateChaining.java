package org.anupam.lambdas;

import java.util.function.Predicate;

public class PredicateChaining {

    public static void main(String[] args){

        Predicate<String> isNull = s -> s == null;
        System.out.println("for null isNull = "+isNull.test(null));
        System.out.println("for Hello isNull = "+isNull.test("Hello"));

        Predicate<String> isEmpty = s -> s.isEmpty();
        System.out.println("for empty isEmpty = "+isEmpty.test(""));
        System.out.println("for Hello isEmpty = "+isEmpty.test("Hello"));


        Predicate<String> neitherNullNorEmpty = isNull.negate().and(isEmpty.negate());

        System.out.println("for null neitherNullNorEmpty = "+neitherNullNorEmpty.test(null));
        System.out.println("for empty neitherNullNorEmpty = "+neitherNullNorEmpty.test(""));
        System.out.println("for Hello neitherNullNorEmpty = "+neitherNullNorEmpty.test("Hello"));

    }
}
