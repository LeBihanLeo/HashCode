package Example;

import Example.Read.InputReader;
import Example.Read.Reador;
import Example.Society.Society;

import java.util.ArrayList;

//update
public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> input = InputReader.readInput();
        Reador reador=new Reador();
        Society society = new Society(reador.getListOfPerso(), reador.getListOfJob());
        String res = society.runLife();
        System.out.println(res);
        InputReader.writeOutput(res);
    }
}

