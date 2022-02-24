package Example.Society;

import Example.Skill;

import java.util.ArrayList;
import java.util.List;

public class Personnage {
    String name;
    int nbOfSkill;
    List<Skill> skillList = new ArrayList<>();

    Job currentJob;

    public Personnage(String name, List<Skill> skillList, int nbOfSkill) {
        this.name = name;
        this.skillList = skillList;
        this.nbOfSkill = nbOfSkill;
    }

    public void setJob(Job job) {
        this.currentJob = job;
    }

}
