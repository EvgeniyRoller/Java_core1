package org.javaacademy.core.lesson9.ex3;

public class Car {

    /**
     * Вложенный статический класс
     * (можно создать без экземпляра класса выше(Car))
     */
    public static class Engine {
        private int power;

        public Engine(int power) {
            this.power = power;
        }
    }
}
