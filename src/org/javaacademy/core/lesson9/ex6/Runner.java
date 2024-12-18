package org.javaacademy.core.lesson9.ex6;

public class Runner {
    public static void main(String[] args) {
        Animal tiger = new Animal("Тигр") {
            @Override
            public void run(Animal animal) {
            System.out.println("Тигр бежит за: " + animal.name);
            }

            @Override
            public void shout() {
                System.out.println("Тигр орёт");
            }

            @Override
            public void sleep() {
                System.out.println("Тигр спит");
            }

            @Override
            public String toString() {
                return "Тигр";
            }
        };
        Animal dog = new Animal("Собака") {
            @Override
            public String toString() {
                return "Собака";
            }

            @Override
            public void run(Animal animal) {
                System.out.println("Собака бежит за: " + animal.name);
            }

            @Override
            public void shout() {
                System.out.println("Собака орёт");
            }

            @Override
            public void sleep() {
                System.out.println("Собака спит");
            }
        };
        dog.run(tiger);
        tiger.run(dog);
        dog.shout();
    }
}
