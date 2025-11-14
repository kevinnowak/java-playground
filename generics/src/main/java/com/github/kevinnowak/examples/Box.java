package com.github.kevinnowak.examples;

/**
 * A simple generic Box class
 *
 * @param <T>
 */
class Box<T> {

    private T value;

    T getValue() {
        return value;
    }

    void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Box{" + value + "}";
    }
}
