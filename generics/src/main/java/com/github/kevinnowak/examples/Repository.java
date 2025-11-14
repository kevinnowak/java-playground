package com.github.kevinnowak.examples;

interface Repository<T> {
    
    void save(T t);

    T get(int id);
}
