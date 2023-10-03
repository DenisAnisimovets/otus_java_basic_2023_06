package homework12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static String path = "src/main/resources/";

    public static void main(String[] args) {
        printFiles();
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        System.out.println("You enter  = " + fileName);

        String filePath = path.concat(fileName); // Путь к файлу
        printFile(filePath);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            String newLine = scanner.nextLine();
            while (!newLine.equals("exit")) {
                writer.write(newLine);
                writer.newLine();
                newLine = scanner.nextLine();
            }
            writer.flush();
            System.out.println("Запись в файл успешно выполнена.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printFile(String fileName) {
        StringBuilder output = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(output);
    }

    public static void printFiles() {
        try {
            File root = new File(path);
            // Получение списка файлов в корневом каталоге
            File[] files = root.listFiles();
            if(files != null) {
                for (File file : files) {
                    if(file.isFile()) {
                        System.out.println(file.getName());
                    }
                }
            }
        } catch (Exception e) {
        }
    }
}
