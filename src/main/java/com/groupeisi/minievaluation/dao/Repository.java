package com.groupeisi.minievaluation.dao;


import java.util.List;

public interface Repository<T> {
    boolean save(T t);
    boolean delete(long id,T t);
    boolean update(T t);
    List<T> list(T t);
    public T get(long id,T t);
}
