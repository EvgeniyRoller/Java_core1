package org.javaacademy.core.lesson5.animal;

public class Dog {
    private String name;
   public static Dog[] dogs = new Dog[10];
   static int count = 0;
   private Dog[] childs;
//   private int countLegs = 4;
   public final static int COUNT_LEGS = 4;

    public Dog(String name) {
        this.name = name;
        dogs[count] = this;
        count++;
    }
    public static void printDogsNames() {
        for (Dog dog : dogs) {
            if (dog != null) {
            System.out.println(dog.name);
        } else {
                break;
                }
            System.out.println("Работа цикла дальше...");
            } try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }

    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
