package Example;

import java.util.ArrayList;

public class Reador {
    ArrayList<ArrayList<String>> toRead;
    int numberOfContributors ;
    int numberOfJobToDo ;
    public Reador(){

    }
    void read(){
        numberOfContributors=Integer.parseInt(toRead.get(0).get(0));
        numberOfJobToDo=Integer.parseInt(toRead.get(0).get(1));
        
    }

}
