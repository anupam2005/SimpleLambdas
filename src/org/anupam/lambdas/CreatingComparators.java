package org.anupam.lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CreatingComparators {

    public static void main(String[] args){

        List<String> nums = new ArrayList<String>(List.of("one","two","three","four","five","six","seven","eight","nine"));

        Comparator<String> c1 = (String s1, String s2) -> s1.compareTo(s2);

        nums.sort(c1);

        System.out.println(nums);

        Comparator<String> c2 = (String s1, String s2) -> Integer.compare(s1.length(),s2.length());

        nums.sort(c2);

        System.out.println(nums);
    }
}
