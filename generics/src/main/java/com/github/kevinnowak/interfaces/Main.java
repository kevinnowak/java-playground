package com.github.kevinnowak.interfaces;

class Main {

    public static void main(String[] args) {
        Replacer<Integer> boxReplacer = new Box<>(); // Using generic Box implementation
        boxReplacer.replace(12);
        boxReplacer.replace(21);

        Replacer<String> bagReplacer = new StringBag(); // Using non-generic StringBag implementation
    }
}
