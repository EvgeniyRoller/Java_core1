package org.javaacademy.core.lesson8.ex2;

public class Runner {
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
        } catch (RuntimeException e) {
            System.out.println("Обработали ошибку");
        }
    }
}
