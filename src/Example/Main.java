package Example;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//update
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String filename = System.getProperty("user.dir")+"\\input.txt";
        ArrayList<ArrayList<String>> records = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] currentLine = line.split(" ");
                ArrayList<String> list = new ArrayList<>(Arrays.asList(currentLine));
                records.add(list);
            }
            reader.close();
            System.out.println(records);
        } catch (Exception e) {
            System.err.format("Exception occurred trying to read '%s'.", filename);
            e.printStackTrace();
        }
    }
}

