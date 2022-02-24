package Example.Society;

import Example.Skill;

import java.util.ArrayList;
import java.util.List;

public class Personnage {
    String name;
    int nbOfSkill;
    List<Skill> skillList = new ArrayList<>();

    Job currentJob;

    public Personnage(String name, int nbOfSkill) {
        this.name = name;
        this.nbOfSkill = nbOfSkill;
    }

    public void setSkillList(List<Skill> skillList) {
        this.skillList = skillList;
    }

    public void setJob(Job job) {
        this.currentJob = job;
    }

}
