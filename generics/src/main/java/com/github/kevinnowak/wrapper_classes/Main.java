package com.github.kevinnowak.wrapper_classes;

class Main {

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>(56); // Box<int> intBox = new Box<>(56) does not work

        Integer a = 56;  // Autoboxing, automatic call to valueOf() -> same as Integer a = Integer.valueOf(56);
        Box<Integer> intBox1 = new Box<>(a);
        Box<Integer> intBox2 = new Box<>(56);  // Autoboxing, automatic call to valueOf()
        Box<Integer> intBox3 = new Box<>(Integer.valueOf(56));

        Integer b = 56;
        int aPrimitive1 = b.intValue();  // Return primitive int value from Integer object
        int aPrimitive2 = b;  // Unboxing, automatic call to intValue()
    }
}
