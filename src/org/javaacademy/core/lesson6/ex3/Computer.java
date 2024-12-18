package org.javaacademy.core.lesson6.ex3;

public class Computer {
    
    //Перегрузка метода
    public void sayHello() {
        System.out.println("Привет");

    }
    public void sayHello(String name) {
        System.out.println("Привет " + name);
    }
    //Перезапись, переопределение метода
    @Override
    public String toString() {
        return "Это компьютер";
    }
}
