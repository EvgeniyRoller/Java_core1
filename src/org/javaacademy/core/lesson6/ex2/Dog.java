package org.javaacademy.core.lesson6.ex2;

public class Dog extends Animal {

    public Dog(int weight) {
        super(weight);
    }

    public void makeSound() {
        System.out.println("Гав");
    }

    @Override
    public String toString() {
        return " Эта собака с весом: " + this.weight;
    }

    @Override
    public void breath() {
        System.out.println("Собака дышит");
    }
}
