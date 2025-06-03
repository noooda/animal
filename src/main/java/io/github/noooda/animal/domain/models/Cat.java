package io.github.noooda.animal.domain.models;

import io.github.noooda.animal.domain.base.Animal;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Meow! Meow!");
    }
}
