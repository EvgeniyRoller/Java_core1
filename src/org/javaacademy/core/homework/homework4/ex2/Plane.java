package org.javaacademy.core.homework.homework4.ex2;

public class Plane implements Flyable {
    private int countPassengers = 0;

    public Plane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly() throws FlyException {
        if (countPassengers < 0) {
            throw new FlyException("Ошибка: колличество пассажиров меньше нуля!");
        }
        System.out.println("Самолёт летит");
    }
}