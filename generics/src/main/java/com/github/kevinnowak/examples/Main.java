package com.github.kevinnowak.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {

    public static void main(String[] args) {
        // Simple generic class usage
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello generics");
        System.out.println(stringBox);

        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(42);
        System.out.println(integerBox);

        // Pair class
        Pair<String, Integer> pair = new Pair<>("Age", 30);
        System.out.println(pair);

        // Bounded type usage
        NumericBox<Double> numericBox = new NumericBox<>(9.81);
        System.out.println("Double value: " + numericBox.doubleValue());

        // Generic method usage
        String[] names = {"Alice", "Bob", "Charlie"};
        Util.printArray(names);
        System.out.println("Max: " + Util.max(10, 20));

        // Wildcards
        List<Integer> listInt = Arrays.asList(1, 2, 3);
        WildcardDemo.readList(listInt);
        WildcardDemo.sumNumbers(listInt);

        // Lower-bound wildcard example
        List<Object> objects = new ArrayList<>();
        objects.add("Test");
        objects.add(123);
        Printer.printIntegers(objects);

        // Generic inheritance
        Cage<Dog> dogCage = new Cage<>(new Dog());
        System.out.println("Caged animal: " + dogCage.getAnimal().getClass().getSimpleName());

        // Generic interface + implementation
        Repository<String> repository = new MemoryRepository<>();
        repository.save("First");
        repository.save("Second");
        System.out.println("Repository get(1): " + repository.get(1));
    }
}
