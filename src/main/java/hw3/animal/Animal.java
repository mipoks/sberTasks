package hw3.animal;

import java.util.Objects;

public abstract class Animal {

    private String nickname;

    public void die() {
        System.out.println("Bye.");
    }

    public void eat() {
        System.out.println("I am eating. Tasty...");
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Objects.equals(nickname, animal.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname);
    }

    @Override
    public String toString() {
        return "Animal:" +
                " nickname=" + nickname;
    }
}