package io.github.noooda.animal.domain.base;

public abstract class Animal {
    private String name;

    protected Animal(String name) {
        this.name = name;
    }

    public abstract void speak();

    public String getName() {
        return name;
    }
}
