package com.curtisnewbie.entitymodule;

public class User {

    private final String name;

    public User(String name) {
        this.name = name;
    }


    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
