package com.github.kevinnowak.examples;

/**
 * A generic class with bounded type
 *
 * @param <T>
 */
class Cage<T extends Animal> {

    private T animal;

    Cage(T animal) {
        this.animal = animal;
    }

    T getAnimal() {
        return animal;
    }
}
