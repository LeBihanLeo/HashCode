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

    public void addSkillList(Skill skill) {
        this.skillList.add(skill);
    }

    public void setJob(Job job) {
        this.currentJob = job;
    }

    public String getName() {
        return name;
    }

    public int getNbOfSkill() {
        return nbOfSkill;
    }

    public Job getCurrentJob() {
        return currentJob;
    }

    public List<Skill> getSkillList() {
        return skillList;
    }
    public int getSkillListSize() {
        return skillList.size();
    }

}
