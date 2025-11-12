package com.github.kevinnowak.methods;

class StringBox {

    private String data;

    public static <T> boolean isStringStatic(T item) {
        return item instanceof String;
    }

    public <T> boolean isString(T item) {
        return item instanceof String;
    }
}
