package org.javaacademy.core.lesson10.ex4;

import java.io.FileWriter;
import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        String projectPath = "C:\\Users\\Evgeniy\\IdeaProject\\first_project";
        String fileName = "lesson10.txt";
        String path = projectPath + "\\" + fileName;
        try (FileWriter fileWriter = new FileWriter(path);) {
            if (true) {
                throw new RuntimeException("Какая ошибка");
            }
            fileWriter.write("У меня 10 урок идёт сейчас");

        }
    }
}
