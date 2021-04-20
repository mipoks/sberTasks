package hw3.animal;

import hw3.action.Moveable;
import hw3.action.Voiceable;

public class Rat extends Animal implements Moveable, Voiceable {
    @Override
    public void move() {
        System.out.println("I am moving to basement");
    }

    @Override
    public void voice() {
        System.out.println("Pisk-pisk");
    }
}