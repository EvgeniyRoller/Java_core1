package org.javaacademy.core.homework.homework4.ex4;

public abstract class Alive {
    static final String DOMEN = "ЦАРСТВО ЖИВЫХ";
    protected Boolean idDead = false;
    protected double weight;

    public Alive(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void dead() {
        this.idDead = true;
    }
}
