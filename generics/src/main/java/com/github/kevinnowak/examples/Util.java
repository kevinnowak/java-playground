package com.github.kevinnowak.examples;

/**
 * Generic methods
 */
class Util {

    static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    static <T extends Comparable<T>> T max(T a, T b) {
        return a.compareTo(b) >= 0 ? a : b;
    }
}
