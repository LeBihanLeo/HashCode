package Example.Society;

import Example.Skill;

import java.util.ArrayList;
import java.util.List;

public class Personnage{
    String name;
    int nbOfSkill;
    List<Skill> skillList = new ArrayList<>();

    Job currentJob = null;


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

    public boolean getCanWork() {
        if (this.currentJob == null) return true;
        return false;
    }

    public List<Skill> getSkill() {
        return this.skillList;
    }

    public boolean isEligible(Job job) {
        for (Skill skillJob : job.getSkillTaskList()) {
            for (Skill skill : skillList) {
                if (skillJob.getLevel() >= skill.getLevel() && skillJob.getName().equals(skill.getName())) {
                    return true;
                }
            }
        }
        return false;
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

    //Eligible =
    //Possèder le skill
    //avoir le bon niveau (>= niveau demandé)
    public boolean isEligibleForSkill(Skill skill) {
        for(Skill currentSkill : skillList){
            if(getCanWork() && currentSkill.equals(skill) && currentSkill.getLevel() >= skill.getLevel()){
                return true;
            }
        }
        return false;
    }


    public void endWork() {
        this.currentJob = null;
    }

    public void upgradeSkill(Skill skill) {
        if(skillList.contains(skill)){
            int index = skillList.indexOf(skill);
            skillList.get(index).upgrade();
        }
    }
}
