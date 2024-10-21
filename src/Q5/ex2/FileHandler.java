package Q5.ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandler {
    public void readFile(String fileName) {
        File file = new File(fileName);

        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            if (!file.canRead()) {
                throw new SecurityException();
            }
            System.out.println("File read successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (SecurityException e) {
            System.out.println("Error: Insufficient permissions to read the file.");
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred.");
        }
    }
}
