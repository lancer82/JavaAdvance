package com.daiinfo.seniorjava.ken4.prolongation.dao;

public interface BaseDao<T> {
    void add(T t); 
    void delete(T t);
    void update(T t);
    T select(T t);
}
