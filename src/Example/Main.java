package Example;

import Example.Read.InputReader;
import Example.Read.Reador;

import java.util.ArrayList;

//update
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        ArrayList<ArrayList<String>> input = InputReader.readInput();
        Reador reador=new Reador();
        System.out.println(input);
        InputReader.writeOutput("Hello World");
    }
}

