package uts;

// Super class
class Animal {
    protected String animalName;
    protected double animalWeight;
    protected boolean animalHealthy;

    // No argument constructor
    public Animal() {
        // Default values
        animalName = "";
        animalWeight = 0.0;
        animalHealthy = false;
    }

    // Parameterized constructor
    public Animal(String name, double weight, boolean healthy) {
        animalName = name;
        animalWeight = weight;
        animalHealthy = healthy;
    }

    // Method without parameter
    public void sleep() {
        System.out.println(animalName + " is sleeping.");
    }

    // Method with parameter
    public void eat(String food) {
        System.out.println(animalName + " is eating " + food + ".");
    }

    // Method with return value
    public boolean isHealthy() {
        return animalHealthy;
    }

    // Method overloading
    public void sleep(int hours) {
        System.out.println(animalName + " is sleeping for " + hours + " hours.");
    }
}

// Sub class 1
class Dog extends Animal {
    private String breed;

    // Parameterized constructor
    public Dog(String name, double weight, boolean healthy, String dogBreed) {
        super(name, weight, healthy);
        breed = dogBreed;
    }

    // Method overriding
    @Override
    public void sleep() {
        System.out.println("The dog named " + animalName + " is sleeping.");
    }

    @Override
    public void eat(String food) {
        System.out.println("The dog named " + animalName + " is eating " + food + ".");
    }
}

// Sub class 2
class Cat extends Animal {
    private String color;

    // Parameterized constructor
    public Cat(String name, double weight, boolean healthy, String catColor) {
        super(name, weight, healthy);
        color = catColor;
    }

    // Method overriding
    @Override
    public void sleep() {
        System.out.println("The cat named " + animalName + " is sleeping.");
    }

    @Override
    public void eat(String food) {
        System.out.println("The cat named " + animalName + " is eating " + food + ".");
    }
}

// Sub class 3
class Bird extends Animal {
    // No argument constructor
    public Bird() {
        // Default values
        super();
    }

    // Method overriding
    @Override
    public void sleep() {
        System.out.println("The bird named " + animalName + " is sleeping.");
    }

    @Override
    public void eat(String food) {
        System.out.println("The bird named " + animalName + " is eating " + food + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects
        Dog dog = new Dog("Buddy", 10.5, true, "Golden Retriever");
        Cat cat = new Cat("Whiskers", 5.2, true, "Orange");
        Bird bird = new Bird();

        // Calling methods
        dog.sleep();
        dog.eat("dog food");
        System.out.println("Is the dog healthy? " + dog.isHealthy());
        dog.sleep(8);

        System.out.println();

        cat.sleep();
        cat.eat("cat food");
        System.out.println("Is the cat healthy? " + cat.isHealthy());
        cat.sleep(10);

        System.out.println();

        bird.sleep();
        bird.eat("seeds");
        System.out.println("Is the bird healthy? " + bird.isHealthy());
        bird.sleep(6);
    }
}
