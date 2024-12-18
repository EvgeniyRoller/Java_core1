package org.javaacademy.core.homework.homework4.ex1.transport;

public abstract class Car {
    protected boolean isClean = true;
    protected final double length;//длина
    protected final double height;//высота
    protected final double width;//ширина

    public Car(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public Car(boolean isClean, double length, double height, double width) {
        this.isClean = isClean;
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
