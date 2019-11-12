package com.versilistyson.javazoo.service.common;

import org.springframework.stereotype.Service;

import java.util.Set;

@Service(value = "typeService")
abstract class TypeService<T> implements IService<T> {
    @Override
    public T save(T obj) {
        return null;
    }

    @Override
    public void deleteById(T objId) {

    }

    @Override
    public T update(T obj) {
        return null;
    }

    @Override
    public Set<T> findAll() {
        return null;
    }

    @Override
    public T findById(T objId) {
        return null;
    }
}
