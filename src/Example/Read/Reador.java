package Example.Read;

import Example.Skill;
import Example.Society.Job;
import Example.Society.Personnage;

import java.util.ArrayList;

public class Reador {
    ArrayList<ArrayList<String>> toRead;
    int numberOfContributors ;
    int numberOfJobToDo ;
    ArrayList<Personnage> listOfPerso=new ArrayList<>();
    ArrayList<Job> listOfJob=new ArrayList<>();

    public Reador(){
        this.toRead=InputReader.readInput();
    }

    void read(){
        int ligne=0;
        numberOfContributors=Integer.parseInt(toRead.get(0).get(0));
        numberOfJobToDo=Integer.parseInt(toRead.get(0).get(1));
        while (listOfJob.size()==numberOfJobToDo){
        }
        while (listOfPerso.size()==numberOfContributors){
        }
    }

}
