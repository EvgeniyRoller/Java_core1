package org.javaacademy.core.lesson7.animal_world_ex3.mammal;

/**
 * Крыса
 */
public class Mouse extends Mammal {
    //Длинна хвоста
    private int tailLength;

    public Mouse(int tailLength) {
        this.tailLength = tailLength;
    }

    /**
     * Ест сыр
     */
    public void eatCheese() {
        System.out.println("Крыса ест сыр");
    }

    public int getTailLength() {
        return tailLength;
    }
}
