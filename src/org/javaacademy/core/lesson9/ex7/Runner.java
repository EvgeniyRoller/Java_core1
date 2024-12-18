package org.javaacademy.core.lesson9.ex7;

public class Runner {
    public static void main(String[] args) {
        // Сумма всех чисел от 1 до 100
        //System.out.println(getSum(3));
        long result = 0;
        for (int i = 0; i < 100_000 ; i++) {
            result = getSum(result, i);
        }
        System.out.println(result);
    }

    private static long getSum(int number1) {
        if (number1 == 0) {
            return 0;
        }
        long result = number1 + getSum(number1 - 1);
        return result;
    }
    private static long getSum(long result, int increment) {
        return result + increment;
    }
}