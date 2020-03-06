package designpattern.command;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public abstract class FileUtil {

    public static void writeToFile(File file, String newContent) {
        try {
            PrintWriter writer = new PrintWriter(file);
            writer.write(newContent);
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String readFile(File file) {
        try {
            Scanner reader = new Scanner(file);
            StringBuilder sb = new StringBuilder();

            while (reader.hasNext())
                sb.append(reader.next());

            return sb.toString();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static File getFileOject(String fileName) {
        File file = new File(fileName);
        if (!file.exists())
            throw new RuntimeException("File: " + fileName + " does not exist");
        return file;
    }
}