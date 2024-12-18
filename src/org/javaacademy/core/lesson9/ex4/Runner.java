package org.javaacademy.core.lesson9.ex4;

public class Runner {
    public static void main(String[] args) {
        Swimmer swimmer = new Swimmer();
        swimmer.train();

        SportHuman soccerMan = new SportHuman() {
            @Override
            public void train() {
                System.out.println("Футболист бьёт по мячу");
            }
        };
        soccerMan.train();
    }
}
