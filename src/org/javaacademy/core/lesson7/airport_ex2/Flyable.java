package org.javaacademy.core.lesson7.airport_ex2;

public interface Flyable {

     void fly();

     /**
      * Приземление
      */
     default void landing() {
          System.out.println("Летящий объект приземлился");
     }
}
