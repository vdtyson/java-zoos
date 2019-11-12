package com.versilistyson.javazoo.service.common;

import java.util.Set;

public interface IService<T> {

    T save(T obj);
    void deleteById(T objId);
    T update (T obj);
    Set<T> findAll();
    T findById(T objId);

}
