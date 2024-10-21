package Q3.ex3;

import java.io.*;

public class SharedFile {
    public static File file = new File("shared.txt");

    public static void writeToFile(String content) throws IOException {
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(content + "\n");
        }
    }

    public static void readFile() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
