package com.curtisnewbie.mainappmodule;

import java.util.*;
import com.curtisnewbie.daomodule.Dao;
import com.curtisnewbie.entitymodule.User;
import com.curtisnewbie.userdaomodule.UserDao;

/**
 * To run this app
 * <p>
 * mvn clean compile exec:java -Dexec.mainClass="com.curtisnewbie.mainappmodule.App"
 */
public class App {
    public static void main(String[] args) {
        Map<Integer, User> users = new HashMap<>();
        users.put(1, new User("Apple"));
        users.put(2, new User("Juice"));
        Dao<User> userDao = new UserDao(users); // mimic behaviours of Dao
        System.out.println("Users:...");
        userDao.findAll().forEach(System.out::println);
    }
}
