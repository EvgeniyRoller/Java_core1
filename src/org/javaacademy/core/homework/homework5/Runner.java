package org.javaacademy.core.homework.homework5;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

import static java.math.BigDecimal.ZERO;

public class Runner {
    private static final int MONEY_FIELD_INDEX = 1;
    private static final int MINIMUM_FIELDS_COUNT = 2;


    public static void main(String[] args) throws FileNotFoundException {
        ex1();
    }

    private static void ex1() {
        //Донаты со всего мира
        //Одному блогеру присылают пожертвования(донаты) за его ролики
        //Данные о пожертвованиях содержатся в файле donation.csv (папка resources)
        //Необходимо посчитать сумму пожертвований от пользователей из каждой страны
        //Если сумма написана некорректно, то программа должна пропускать строчку (не завершать работу)
        String[] countries = {"Россия", "Франция", "Китай", "Япония", "Турция"};
        String fileName = "donation.txt";
        try (Scanner scanner = new Scanner(Runner.class.getClassLoader().getResourceAsStream(fileName));) {
            scanner.nextLine();
            String text = scanner.nextLine();
            String[] fields = text.split(";");
            if (fields.length >= MINIMUM_FIELDS_COUNT && isNumber(fields[MONEY_FIELD_INDEX])) {
                String convertedMoney = fields[MONEY_FIELD_INDEX].replace(",", ".");
                BigDecimal donation = new BigDecimal(convertedMoney);
                System.out.println(donation);

            }
        }

        //Ожидаемый вывод:
        //Список пожертвований по странам (пример):
        //Россия - 14233.00
        //Франция - 8000.32
        //Китай - 20000.11
        //Япония - 124.10
        //Турция - 777.55

    }
    private static boolean isNumber(String text) {
        Pattern pattern = Pattern.compile(">\\d+\\d+$");
        return pattern.matcher(text).find();
    }

}
