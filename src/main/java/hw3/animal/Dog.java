package hw3.animal;

import hw3.action.Moveable;
import hw3.action.Voiceable;

public class Dog extends Animal implements Moveable, Voiceable {
    @Override
    public void voice() {
        System.out.println("Gav-gav");
    }

    @Override
    public void move() {
        System.out.println("I am running fast");
    }
}
