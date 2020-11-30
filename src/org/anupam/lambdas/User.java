package org.anupam.lambdas;

public class User {

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public User(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "User{" +
                "user='" + user + '\'' +
                '}';
    }

    private String user;


}
