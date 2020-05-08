package com.gm.dp.strategy;

public class AnimalPlay {
    public static void main(String[] args) {
        System.out.println("--- Strategy Design Pattern ---");

        Animal sparky = new Dog();

        Animal tweety = new Bird();

        System.out.println("Dog: " + sparky.tryToFly());
        System.out.println("Bird: " + tweety.tryToFly());

        sparky.setFlyingAbility(new ItFlys());
        System.out.println("Dog: " + sparky.tryToFly());
    }
}
