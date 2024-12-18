package org.javaacademy.core.lesson8.ex3;

public class Runner {
    public static void main(String[] args) {
        Axe axe = new Axe();
        Worker worker = new Worker(axe);
        Firm firm = new Firm(worker);
        firm.makeProfit();
        System.out.println("_______________________________________");

        worker.isDrink();
        firm.makeProfit();
    }
}
