package Example.Read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class InputReader {
    public static ArrayList<ArrayList<String>> readInput(){
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
            return records;
        } catch (Exception e) {
            System.err.format("Exception occurred trying to read '%s'.", filename);
            e.printStackTrace();
            return null;
        }
    }
}