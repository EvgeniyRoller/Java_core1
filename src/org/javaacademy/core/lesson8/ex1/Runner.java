package org.javaacademy.core.lesson8.ex1;

import org.javaacademy.core.lesson7.animal_world_ex3.fresh_water.Carp;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car(10);
        try {
            car.go();
            System.out.println("Машина в порядке, по этому едем на моря!");
        } catch (Exception e) {
            System.out.println("С машиной что-то не так," +
                    " едем на моря на поезде!");
        }
    }
}
