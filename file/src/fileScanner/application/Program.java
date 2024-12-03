package fileScanner.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Daniel\\Desktop\\in.txt");
        Scanner scanner = null;

        if (!file.exists()) {
            System.out.println("Arquivo não encontrado: " + file.getAbsolutePath());
        } else if (!file.canRead()) {
            System.out.println("Arquivo não pode ser lido.");
        }

        try {
            scanner = new Scanner(file, "UTF-8");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if (scanner != null) {
                scanner.close();
        }
        }
    }
}
