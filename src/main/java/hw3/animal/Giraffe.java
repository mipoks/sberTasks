package hw3.animal;

import hw3.action.Moveable;
import hw3.action.Voiceable;

public class Giraffe extends Animal implements Moveable, Voiceable {
    @Override
    public void voice() {
        System.out.println("Lya girafe");
    }

    @Override
    public void move() {
        System.out.println("I tip top on Savanna");
    }
}
