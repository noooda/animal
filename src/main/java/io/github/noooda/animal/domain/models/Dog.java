package io.github.noooda.animal.domain.models;

import io.github.noooda.animal.domain.base.Animal;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Woof! Woof!");
    }
}
