package org.javaacademy.core.homework.homework4.ex1.transport;

public class Bus extends Car {
    private final int maxNumberOfPassengers;

    public Bus(double length, double height, double width, int maxNumberOfPassengers) {
        super(length, height, width);
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }

    public Bus(boolean isClean, double length, double height, double width, int maxNumberOfPassengers) {
        super(isClean, length, height, width);
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }

    public int getMaxNumberOfPassengers() {
        return maxNumberOfPassengers;
    }
}
