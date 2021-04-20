package hw3.zoo;

import hw3.action.Voiceable;
import hw3.animal.Animal;
import hw3.animal.Dog;
import hw3.animal.Rat;

public class Main {
    public static void main(String[] args) {
        Voiceable rat = new Rat();
        rat.voice();

        Animal dog = new Dog();
        dog.eat();
    }

}
