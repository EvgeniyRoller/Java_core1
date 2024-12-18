package org.javaacademy.core.homework.homework1;


    public class Homework1 {
        public static void main(String[] args) {
            String name = "    ПЕтРов Олег Иванович     ";
            String convertedName = name.trim().toUpperCase();
            if (convertedName.contains("ОВА")) {
                System.out.println("Уважаемая " + convertedName);
            } else if (convertedName.contains("ОВ")) {
                System.out.println("Уважаемый " + convertedName);
            } else {
                System.out.println("Неизвестное лицо " + convertedName);
            }
            System.out.println("_____________________________________");

            double fuel = 10;
            boolean isEngineWork = true;
            boolean hasErrors = false;
            boolean isWheelWork1 = true;
            boolean isWheelWork2 = true;
            boolean isWheelWork3 = true;
            boolean isWheelWork4 = true;
            if (
                    fuel >= 10
                            && (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4)
                            && !hasErrors
                            && isEngineWork
            ) {
                System.out.println("Машина едедет!");
            } else {
                System.out.println("Машина не едет!");
            }
            System.out.println("_____________________________________");

            String simply = " this is simply. This is my favorite song";
            String converted = simply.replaceAll("this", "those are");



    }

}
