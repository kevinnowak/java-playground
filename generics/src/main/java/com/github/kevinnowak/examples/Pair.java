package com.github.kevinnowak.examples;

/**
 * Generic pair with multiple type parameters
 *
 * @param <K>
 * @param <V>
 */
class Pair<K, V> {

    private K key;
    private V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    K getKey() {
        return key;
    }

    V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Pair{" + key + "=" + value + "}";
    }
}
