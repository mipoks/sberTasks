package hw3.animal;

import hw3.action.Moveable;
import hw3.action.Voiceable;

public class Goat extends Animal implements Moveable, Voiceable {
    @Override
    public void voice() {
        System.out.println("Meeeee");
    }

    @Override
    public void move() {
        System.out.println("I am moving to paddock");
    }
}
