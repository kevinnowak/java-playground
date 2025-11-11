package com.github.kevinnowak.classes;

class Container<T> {
    private T data;

    Container(T data) {
        this.data = data;
    }

    T getData() {
        return this.data;
    }

    void setData(T data) {
        this.data = data;
    }
}
