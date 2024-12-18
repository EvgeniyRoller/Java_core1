package org.javaacademy.core.lesson9.ex5;

public class Runner {
    public static void main(String[] args) {
        Movable helicopter = new Movable() {
            @Override
            public void go() {
                System.out.println("Вертолёт летит вперёд");
            }
        };
        Movable reptile = new Movable() {
            @Override
            public void go() {
                System.out.println("Ящерица бежит вперёд");
            }
        };
        Movable boat = () -> System.out.println("Лодка плывёт вперёд");//Лямда выражение

        Movable[] movables = {helicopter, reptile, boat};
        for (Movable movable : movables) {
            movable.go();
        }

    }
}
