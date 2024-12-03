package writer.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};

        String path = "C:\\Users\\Daniel\\Desktop\\out.txt";

        try (BufferedWriter br = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                br.write(line);
                br.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
