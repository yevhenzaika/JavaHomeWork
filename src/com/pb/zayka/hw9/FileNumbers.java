package com.pb.zayka.hw9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileNumbers {
    public static void main(String[] args) {

        createNumbersFile();
        createOddNumbersFile();

    }

    public static void createNumbersFile() {

        Path path = Paths.get("src/com/pb/zayka/hw9/numbers.txt");

        // write to file
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    writer.write((int) (Math.random() * 100) + " ");
                }
                writer.newLine();
            }
        } catch (Exception ex) {
            System.out.println("Error with file write: " + ex);
        }
        System.out.println("Write to file \"" + path.toAbsolutePath().normalize() + "\" done!");
    }

    public static void createOddNumbersFile() {

        Path path = Paths.get("src/com/pb/zayka/hw9/numbers.txt");
        String lineNum = "";

        // read from file
        System.out.println("Read text from file \"" + path.toAbsolutePath().normalize() + "\":");

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] arrayStr = line.split(" ");

                for (int i = 0; i < arrayStr.length; i++) {
                    if (Integer.parseInt(arrayStr[i]) % 2 == 0) {
                        arrayStr[i] = "0";
                    }
                }

                for (int i = 0; i < arrayStr.length; i++) {
                    lineNum += arrayStr[i] + " ";
                }
                //System.out.println(Arrays.toString(arrayStr));
                //System.out.println(line);

            }

        } catch (Exception ex) {
            System.out.println("Error with file read: " + ex);
        }
        System.out.println("Read from file done!");

        path = Paths.get("src/com/pb/zayka/hw9/odd-numbers.txt");
        String[] arrayStr = lineNum.split(" ");


        StringBuilder sb = new StringBuilder();
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (int i = 0; i < 100; i++) {
                if (i % 10 == 0 && i != 0) {
                    writer.newLine();
                }
                writer.write(arrayStr[i] + " ");
            }
        } catch (Exception ex) {
            System.out.println("Error with file write: " + ex);
        }
        System.out.println("Write to file \"" + path.toAbsolutePath().normalize() + "\" done!");

    }
}
