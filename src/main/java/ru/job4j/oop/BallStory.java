package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Fox fox = new Fox();
        Wolf wolf = new Wolf();
        Hare hare = new Hare();
        wolf.tryEat(kolobok);
        hare.tryEat(kolobok);
        fox.tryEat(kolobok);
    }
}
