package com.github.kevinnowak.wildcards;

class Main {

    public static void main(String[] args) {
        Bag<String> myBag1 = new Bag<>("Hello");
        Bag<Integer> myBag2 = new Bag<>(23);
        Util.printBag(myBag1);
        Util.printBag(myBag2);
    }
}
