package org.javaacademy.core.lesson7.airport_ex2;

public class Runner {
    public static void main(String[] args) {
//        Airplane airplane = new Airplane(100);
//        Duck duck = new Duck(true);
//        Flyable[] flyables = new Flyable[2];
//        flyables[0] = airplane;
//        flyables[1] = duck;
//
//        for (Flyable flyable : flyables) {
//            flyable.fly();
//            flyable.landing();
//        }
        Mi20Helicopter mi20Helicopter = new Mi20Helicopter();
        mi20Helicopter.flyVertical();
        mi20Helicopter.fly();

    }
}
