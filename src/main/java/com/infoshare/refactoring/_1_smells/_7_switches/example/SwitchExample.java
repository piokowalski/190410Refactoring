package com.infoshare.refactoring._1_smells._7_switches.example;

public class SwitchExample {

    public static void main(String[] args) {

        Bird europeanBird = new Bird(10.0, false, BirdType.EUROPEAN);
        Bird africanBird = new Bird(10.0, false, BirdType.AFRICAN);
        Bird norwayBird = new Bird(10.0, false, BirdType.NORWEGIAN);
        Bird northNorwayBird = new Bird(10.0, true, BirdType.NORWEGIAN);

        System.out.println("Bird speed is " + europeanBird.getSpeed());
        System.out.println("Bird speed is " + africanBird.getSpeed());
        System.out.println("Bird speed is " + norwayBird.getSpeed());
        System.out.println("Bird speed is " + northNorwayBird.getSpeed());
    }
}
