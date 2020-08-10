package com.curtisnewbie.daomodule;

import java.util.*;

public interface Dao<T> {

    Optional<T> findById(int id);

    List<T> findAll();
}
