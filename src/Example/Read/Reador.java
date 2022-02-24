package Example.Read;

import Example.Skill;
import Example.Society.Job;
import Example.Society.Personnage;

import java.util.ArrayList;
import java.util.Collections;

public class Reador {
    ArrayList<ArrayList<String>> toRead;
    int numberOfContributors ;
    int numberOfJobToDo ;
    ArrayList<Personnage> listOfPerso=new ArrayList<>();
    ArrayList<Job> listOfJob=new ArrayList<>();

    public Reador(){
        this.toRead=InputReader.readInput();
        read();
        Collections.sort(listOfJob);
    }

    void read(){
        int ligne=0;
        numberOfContributors=Integer.parseInt(toRead.get(0).get(0));
        numberOfJobToDo=Integer.parseInt(toRead.get(0).get(1));
        ligne++;
        while (listOfJob.size()==numberOfJobToDo){
            Personnage personnage=new Personnage(toRead.get(ligne).get(0),Integer.parseInt(toRead.get(ligne).get(1)));
            while
        }
        while (listOfPerso.size()==numberOfContributors){
        }
    }

}
