package fileJava;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class fileExamples {
    public static void main(String[] args) throws IOException {

        // File path Comparison
        System.out.println("File path Comparison:");
        File file1 = new File("C:/File/demo1.txt");
        File file2 = new File("C:/java/demo1.txt");

        if (file1.compareTo(file2) == 0) {
            System.out.println("Both paths are same!");
        } else {
            System.out.println("Paths are not same!");
        }

        try {
            File file = new File("D:/FileJava/myfile.txt");

            if (file.createNewFile())
                System.out.println("Success!");
            else
                System.out.println("Error, file already exists.");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        //

        createFileUsingFileClass();
        createFileUsingFileOutputStreamClass();
        createFileIn_NIO();

    }

    private static void createFileUsingFileClass() throws IOException {
        File file = new File("D:/FileJava/testFile1.txt");

        // Create the file
        if (file.createNewFile()) {
            System.out.println("File is created!");
        } else {
            System.out.println("File already exists.");
        }

        // Write Content
        FileWriter writer = new FileWriter(file);
        writer.write("Test data");
        writer.close();
    }

    private static void createFileUsingFileOutputStreamClass() throws IOException {
        String data = "Test data";
        FileOutputStream out = new FileOutputStream("D:/FileJava/testFile2.txt");
        out.write(data.getBytes());
        out.close();
    }

    private static void createFileIn_NIO() throws IOException {
        String data = "Test data";
        Files.write(Paths.get("D:/FileJava/testFile3.txt"), data.getBytes());
        List<String> lines = Arrays.asList("1st line", "2nd line");
        Files.write(Paths.get(
                "file6.txt"), lines, StandardCharsets.UTF_8,
                StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }

}
