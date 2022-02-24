package Example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Reador {
    ArrayList<ArrayList<String>> toRead;
    int numberOfContributors ;
    int numberOfJobToDo ;
    ArrayList<Personnage> listOfPerso=new ArrayList<>();
    ArrayList<Skill> listOfSkill=new ArrayList<>();

    public Reador(){

    }
    void read(){
        numberOfContributors=Integer.parseInt(toRead.get(0).get(0));
        numberOfJobToDo=Integer.parseInt(toRead.get(0).get(1));
        
    }

}
