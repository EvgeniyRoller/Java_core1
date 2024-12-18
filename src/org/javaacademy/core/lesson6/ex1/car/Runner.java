package org.javaacademy.core.lesson6.ex1.car;

import org.javaacademy.core.lesson6.ex1.car.car.LightCar;
import org.javaacademy.core.lesson6.ex1.car.car.Truck;

public class Runner {
    public static void main(String[] args) {
        LightCar lightCar = new LightCar(120, 120, "Black");
        System.out.println(lightCar);
        lightCar.printInfo();


        Truck truck = new Truck(10000, 80, "White");
        System.out.println(truck);
        truck.truckInfo();
    }
}
