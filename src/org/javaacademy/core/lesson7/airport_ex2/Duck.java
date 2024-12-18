package org.javaacademy.core.lesson7.airport_ex2;

public class Duck implements Flyable{
    private boolean isMail;

    public Duck(boolean isMail) {
        this.isMail = isMail;
    }
    public void fly() {
        System.out.println("Утка летит");
    }
}
