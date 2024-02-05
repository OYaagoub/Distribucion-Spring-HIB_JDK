package com.yaagoub.repository;

import java.util.List;

public interface DAO {
    List<Object> getData(String nameObjectClass);
    void update(Object x);
    boolean insert(Object x);
    Object getById(int id,Class<?> entityClass);

    boolean removeById(int id,Class<?> EntityClas);
}
