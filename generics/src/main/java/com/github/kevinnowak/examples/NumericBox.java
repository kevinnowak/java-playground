package com.github.kevinnowak.examples;

/**
 * Bounded generics -> upper bound example
 *
 * @param <T> must extend Number
 */
class NumericBox<T extends Number> {

    private T number;

    NumericBox(T number) {
        this.number = number;
    }

    double doubleValue() {
        return number.doubleValue();
    }
}
