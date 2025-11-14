package com.github.kevinnowak.examples;

import java.util.HashMap;
import java.util.Map;

class MemoryRepository<T> implements Repository<T> {

    private final Map<Integer, T> store = new HashMap<>();
    private int counter = 0;

    @Override
    public void save(T t) {
        store.put(counter++, t);
    }

    @Override
    public T get(int id) {
        return store.get(id);
    }
}
