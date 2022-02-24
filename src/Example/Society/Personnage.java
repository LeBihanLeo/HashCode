package Example.Society;

import Example.Skill;

import java.util.ArrayList;
import java.util.List;

public class Personnage {
    String name;
    int nbOfSkill;
    List<Skill> skillList = new ArrayList<>();

    Job currentJob;

    Job job = null;

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

    public boolean getCanWork(){
       if (this.job == null) return true;
       return false;
    }

    public List<Skill> getSkill(){
        return this.skillList;
    }

    public boolean isEligible(Job job){
        job
    }

}
