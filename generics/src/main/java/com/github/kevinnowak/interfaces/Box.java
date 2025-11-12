package com.github.kevinnowak.interfaces;

class Box<T> implements Replacer<T> {

    private T data;

    @Override
    public void replace(T data) {
        this.data = data;
    }
}
