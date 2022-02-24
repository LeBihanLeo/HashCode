package Example;

import Example.Read.InputReader;

import java.util.ArrayList;

//update
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        ArrayList<ArrayList<String>> input = InputReader.readInput();
        System.out.println(input);
    }
}

