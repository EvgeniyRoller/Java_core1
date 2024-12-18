package org.javaacademy.core.lesson10.ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException {

        String fileName = "C:\\Users\\Evgeniy\\IdeaProject\\first_project\\my_data.txt";
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        String result = "";
        while (scanner.hasNext()) {
            result += scanner.nextLine() + "\n";
        }
        System.out.println(result);
        scanner.close();

    }
    private static void ex1() throws IOException {

        //Задача: прочитать файл my_data.txt

        String fileName = "C:\\Users\\Evgeniy\\IdeaProject\\first_project\\my_data.txt";
        FileReader fileReader = new FileReader(fileName);
        while (fileReader.ready()) {

            System.out.print((char) fileReader.read());
        }
        System.out.println();
        fileReader.close();
    }
}
