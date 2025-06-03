package io.github.noooda.animal.domain.models;

import io.github.noooda.animal.domain.base.Animal;

public class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Chirp! Chirp!");
    }
}
