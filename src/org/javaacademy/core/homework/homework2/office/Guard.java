package org.javaacademy.core.homework.homework2.office;

public class Guard {
    private String name;

    public Guard(String name) {
        this.name = name;
    }

    public void givePayment() {
        System.out.println("Даёшь аванс!");
    }

    public String getName() {
        return name;
    }
}
