package com.github.kevinnowak.methods;

class Main {

    public static void main(String[] args) {
        StringBox stringBox = new StringBox();
        System.out.println(stringBox.isString(5));
        System.out.println(stringBox.isString("Cool"));
        System.out.println(StringBox.isStringStatic(12.3));
    }
}
