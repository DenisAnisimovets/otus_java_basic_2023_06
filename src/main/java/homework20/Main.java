package homework20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static String path = "src/main/resources/";

    public static void main(String[] args) {
        int count = 0;
        printFiles();
        System.out.println("Enter filename!");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        System.out.println("You enter  = " + fileName);
        System.out.println("Enter utf-8 sequence");
        String sequence = scanner.nextLine();
        System.out.println("You enter  = " + sequence);

        String filePath = path.concat(fileName); // Путь к файлу

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                for (int i = 0; i <= line.length() - sequence.length(); i++) {
                    String subline = line.substring(i, i + sequence.length());
                    if(line.substring(i, i + sequence.length()).equals(sequence)) {
                        count++;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Последовательность " + sequence + " встречается " + count + " раз");
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

