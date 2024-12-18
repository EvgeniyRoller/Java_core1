package org.javaacademy.core.lesson5.car;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car(1_200, "Легковая");
        Car car2 = new Car("Грузовая");
        car.turnButton();
        System.out.println("_________________________________");

//        System.out.println("Вес машины: " + car.getWeight());
//        System.out.println("Вес машины: " + car2.getWeight());
//        System.out.println("_________________________________");
//        car.printInfo();
//        car2.printInfo();
        System.out.println(car);
        System.out.println(car2);

//        final int number = 10;
//        number += 1;
//        System.out.println(number);
    }
}
