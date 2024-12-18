package org.javaacademy.core;

import java.util.Arrays;

public class Lesson3 {

        public static void main(String[] args) {
            String[] students = new String[3];
            students[0] = "Сидоров";
            students[1] = "Иванов";
            students[2] = "Петров";
            System.out.println(Arrays.toString(students));
            String[] secondStudents = new String[3];
            secondStudents[2] = "Козлов";
            System.out.println(Arrays.toString(secondStudents));
            char[] letters = {'a', 'b', 'c'};
            System.out.println(letters);
            System.out.println(letters.length);
            System.out.println("____________________________________");

            String[] studentsCopy = new String[3];
            studentsCopy[0] = "Сидоров";
            studentsCopy[1] = "Иванов";
            studentsCopy[2] = "Петров";
            for (String studentName : studentsCopy) {
                System.out.println(studentName);
                System.out.println("____________________________________");

            }
            double[] orders = {1.5, 2.5, 2, 2};
            double sum = 0;
            for (double order : orders) {
                sum = sum + order;
            }
            System.out.println("Сумма заказов: " + sum);
            System.out.println("____________________________________");


            int[] roulette = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 , 11, 12};
            for (int numberRoulette : roulette) {
                if (numberRoulette % 2 == 0) {
                    System.out.println(numberRoulette);
                }
            }

            System.out.println("____________________________________");
            int[] rouletteResult = {36, 5, 10, 12, 1, 2, 7, 8};
//        int countIterations = 0;
//        for (int numberRoulette : rouletteResult) {
//            System.out.println(numberRoulette);
//            countIterations = countIterations + 1;
////            countIterations += 1;
////            countIterations ++;
//            if (countIterations == 5) {
//                break;
//            }
//        }

            for (int index = 0; index < 5; index++) {
                System.out.println(rouletteResult[index]);
            }
            System.out.println("____________________________________");

//        int sumResult = 0;
//        for (int index = rouletteResult.length -1; index > rouletteResult.length -6; index--) {
//            sumResult += (rouletteResult[index]);
//        }
//        System.out.println("Сумма 5 последних значений из рулетки = " + sumResult);

//        for (int index = 0; index < rouletteResult.length; index++) {
//            if (index < 3) {
//                continue;
//            }
//            System.out.println(rouletteResult[index]);
//        }
            int countNumbers = 1;
            int sumWhile = 0;
//        while (countNumbers <= 10) {
//            sumWhile += countNumbers;
//            countNumbers ++;
//        }
            while (true) {
                sumWhile += countNumbers;
                countNumbers ++;
                if (countNumbers > 10) {
                    break;
                }
                System.out.println(sumWhile);

            }
            System.out.println("____________________________________");

            int[] day1 = {36, 2, 10, 17, 7};
            int[] day2 = {3, 5, 2, 9, 11};
            int[] day3 = {6, 9, 21, 3, 0};
            int[][] daysStatistics = new int[3][];
            daysStatistics[0] = day1;
            daysStatistics[1] = day2;
            daysStatistics[2] = day3;
            for (int[] day : daysStatistics) {
                System.out.println(Arrays.toString(day));
            }
            System.out.println("____________________________________");
            array1:
            for (int[] day : daysStatistics) {
                for (int numberRoulette : day) {
                    if (numberRoulette == 9) {
                        System.out.println("Выпадала 9");
                        break array1;

                }
            }
        }
    }
}
