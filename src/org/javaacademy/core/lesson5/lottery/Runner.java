package org.javaacademy.core.lesson5.lottery;

public class Runner {
    public static void main(String[] args) {
        Ticket[] tickets = new Ticket[3000];
        for (int i = 0; i < 1000; i++) {
            tickets[i] = new Ticket();
        }
        Ticket lastTicket = tickets[999];
        System.out.println("В 1000-ом билете выигрыш: " + lastTicket.getWinSum());
    }
}
