package com.github.kevinnowak.list;

import java.util.ArrayList;
import java.util.List;

class Demo {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(); // Empty list
        intList.add(4); // 4
        intList.add(6); // 4, 6
        intList.add(3); // 4, 6, 3
        intList.set(1, 3); // 4, 3, 3

        int a = intList.get(2); // a = 3
        int b = intList.indexOf(3); // b = 1

        List<Integer> subIntList = intList.subList(1, 3); // 3, 3

        for (Integer number : intList) {
            System.out.println(number);
        }
    }
}
