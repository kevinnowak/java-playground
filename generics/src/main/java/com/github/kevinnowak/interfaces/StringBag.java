package com.github.kevinnowak.interfaces;

class StringBag implements Replacer<String> {

    private String data;

    @Override
    public void replace(String data) {
        this.data = data;
    }
}
