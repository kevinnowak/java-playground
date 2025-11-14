package com.github.kevinnowak.wildcard_lower_bounds;

class Util {

    static Bag<? super Integer> getBag(Bag<? super Integer> bag) {
        return bag;
    }
}
