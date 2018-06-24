package com.infoshare.refactoring._1_smells._6_duplications;

public class User {

    private final String role;
    private final String name;

    public User(String role, String name) {
        this.role = role;
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public String getName() {
        return name;
    }
}
