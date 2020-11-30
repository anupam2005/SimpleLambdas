package org.anupam.lambdas;

import java.util.function.DoubleToIntFunction;
import java.util.function.IntSupplier;

public class PrimitiveLambdas {

    public static void main(String[] args){

        IntSupplier intSupplier = () -> 10;

        int x = intSupplier.getAsInt();

        System.out.println("x = "+x);

        DoubleToIntFunction doubleToIntFucntion = (double value) -> (int)Math.floor(value);

        int y = doubleToIntFucntion.applyAsInt(Math.PI);

        System.out.println("y = "+y);


    }
}
