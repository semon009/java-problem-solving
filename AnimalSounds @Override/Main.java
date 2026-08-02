/**
 * Problem Description:
 * Demonstrating basic inheritance and method overriding in Java.
 * - The `Animal` class serves as the parent class with a default `speak()` method.
 * - The `Dog` class extends `Animal` and overrides `speak()` to return a specific sound.
 * - The `Main` class instantiates a `Dog` object named `fido` and outputs its sound.
 */

public class Main {
    public static void main(String[] args) {
        Dog fido = new Dog();
        System.out.println(fido.speak());
    }
}

class Animal {
    public String speak() {
        return "Animal sound...";
    }
}

class Dog extends Animal {
    @Override
    public String speak() {
        return "Bark!";
    }
}
