package org.anupam.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class SomeMapping {

    public static void main(String[] args){

        User anupam = new User("Anupam");
        User aditya = new User("Aditya");
        User vivek = new User("Vivek");
        User deepak = new User("Deepak");

        List<User> users = new ArrayList<>(List.of(anupam,aditya,vivek,deepak));

        /**
         *
         * Scan the list & make another list with only names as strings
         *
         * */

        List<String> userNames=new ArrayList<>();

        Function<User,String> function = (User user) -> user.getUser();

        Consumer<User> action=(User user) -> userNames.add(function.apply(user));
        users.forEach(action);

        Consumer<String> action2 = (String string) -> System.out.println(string);
        userNames.forEach(action2);


    }
}
