package org.javaacademy.core.homework.homework4.ex1.transport;

public class LightCar extends Car {
    private final boolean hasCruiseControl;

    public LightCar(double length, double height, double width, boolean cruiseControl) {
        super(length, height, width);
        this.hasCruiseControl = cruiseControl;
    }

    public LightCar(boolean isClean, double length, double height, double width, boolean cruiseControl) {
        super(isClean, length, height, width);
        this.hasCruiseControl = cruiseControl;
    }

    public boolean isHasCruiseControl() {
        return hasCruiseControl;
    }
}

