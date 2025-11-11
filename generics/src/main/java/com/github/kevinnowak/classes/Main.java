package com.github.kevinnowak.classes;

class Main {

    public static void main(String[] args) {
        Box<String> myStringBox = new Box<>("Apple");
        System.out.println(myStringBox.data());

        String myWord = "Hello";
        Book myBook = new Book("My Book");
        Container<String> wordContainer = new Container<>(myWord);
        Container<Book> bookContainer = new Container<>(myBook);
        System.out.println(wordContainer.getData());
        System.out.println(bookContainer.getData());
    }
}
