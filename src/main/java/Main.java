import io.github.noooda.animal.domain.base.Animal;
import io.github.noooda.animal.domain.models.*;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog("Pochi"),
            new Cat("Tama"),
            new Bird("Piyo")
        };

        for (Animal animal : animals) {
            System.out.println(animal.getName());
            animal.speak();
        }
    }
}
