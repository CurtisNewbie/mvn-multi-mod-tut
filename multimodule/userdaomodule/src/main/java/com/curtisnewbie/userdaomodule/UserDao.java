package com.curtisnewbie.userdaomodule;

import java.util.*;
import com.curtisnewbie.daomodule.Dao;
import com.curtisnewbie.entitymodule.User;

public class UserDao implements Dao<User> {

    private final Map<Integer, User> users;

    public UserDao() {
        users = new HashMap<>();
    }

    public UserDao(Map<Integer, User> users) {
        this.users = users;
    }

    @Override
    public Optional<User> findById(int id) {
        return Optional.ofNullable(users.get(id));
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }
}
