package org.javaacademy.core.lesson9.ex2;

public class Human {
    private Hand rightHand = new Hand();
    private Hand leftHand = new Hand();

    public Hand getRightHand() {
        return rightHand;
    }

    public Hand getLeftHand() {
        return leftHand;
    }

    /**
     * Вложенный НЕстатический класс
     * (не может существовать без экземпляра класса выше)
     */
    public class Hand {

    }

    @Override
    public String toString() {
        return "Human{" +
                "rightHand=" + rightHand +
                ", leftHand=" + leftHand +
                '}';
    }
}
