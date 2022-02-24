package Example;

import java.util.ArrayList;
import java.util.List;

public class Personnage {
    String name;
    List<Skill> skillList = new ArrayList<>();

    public Personnage(String name,List<Skill> skillList){
        this.name = name;
        this.skillList = skillList;
    }

}
