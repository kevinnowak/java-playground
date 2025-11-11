package com.github.kevinnowak.classes;

class Book {
    private String name;

    Book(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Book(name = \""
                + this.name
                + "\")";
    }
}
