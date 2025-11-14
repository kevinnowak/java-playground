package com.github.kevinnowak.examples;

import java.util.List;

/**
 * Bounded generics -> lower bound wildcard example
 */
class Printer {

    /**
     * Accepts List of Integer or any super type of Integer
     *
     * @param list
     */
    static void printIntegers(List<? super Integer> list) {
        for (Object obj : list) {
            System.out.println("Integer: " + obj);
        }
    }
}
