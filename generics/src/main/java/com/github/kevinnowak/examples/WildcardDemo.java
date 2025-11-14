package com.github.kevinnowak.examples;

import java.util.List;

class WildcardDemo {

    static void readList(List<?> list) {
        for (Object obj : list) {
            System.out.println("Reading: " + obj);
        }
    }

    static void sumNumbers(List<? extends Number> nums) {
        double sum = 0;

        for (Number n : nums) {
            sum += n.doubleValue();
        }

        System.out.println("Sum: " + sum);
    }
}
