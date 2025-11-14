package com.github.kevinnowak.wildcard_lower_bounds;

class Bag<T> {

    private T item;

    Bag(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }

    void setItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "item=" + item +
                '}';
    }
}
