# Animal
Define an `Animal` class as a base (super) class to demonstrate core Object-Oriented Programming (OOP) principles in Java.

## Objectives
- Use an **abstract class** to represent the common properties and behaviors of animals.
- Create **subclasses** (e.g. Dog, Cat, Bird) that inherit from `Animal`.
- Implement **inheritance** to share common functionality from the `Animal` class.

## Key Concepts
- Abstract class
- Inheritance
- Method overriding

## Examples (no implementation required)
- `Animal` has an abstract method `speak()`.
- `Dog` overrides `speak()` to return "Woof".
- `Cat` overrides `speak()` to return "Meow".
- A list of `Animal` objects (Dog, Cat, etc.) is iterated, and each calls its own `speak()` method dynamically.