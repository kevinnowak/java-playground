package com.github.kevinnowak.set;

import java.util.HashSet;
import java.util.Set;

class Demo {

    public static void main(String[] args) {
        Set<Integer> intSet = new HashSet<>();
        intSet.add(6);
        intSet.add(0);
        intSet.add(6);

        boolean isNineInSet = intSet.contains(9);
        boolean isZeroInSet = intSet.contains(0);

        for (Integer number : intSet) {
            System.out.println(number);
        }
    }
}
