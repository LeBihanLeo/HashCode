package Example.Society;

import Example.Skill;

import java.util.ArrayList;
import java.util.List;

public class Job implements Comparable{
    String name;
    int nbOfDays;
    int scoreAwarded;
    int bestBefore;
    int numberOfRoles;
    List<Skill> skillTaskList;



    public Job(String name, int nbOfDays, int scoreAwarded, int bestBefore, int numberOfRoles) {
        this.name = name;
        this.nbOfDays = nbOfDays;
        this.scoreAwarded = scoreAwarded;
        this.bestBefore = bestBefore;
        this.numberOfRoles = numberOfRoles;
        skillTaskList=new ArrayList<>();

    }

    public void addSkillTaskList(Skill skillTask) {
        this.skillTaskList.add(skillTask);
    }

    public List<Skill> getJob() {
        return this.skillTaskList;
    }

    public int differenceDeJ() {
        return bestBefore-nbOfDays;
    }

    public String getName() {
        return name;
    }

    public int getBestBefore() {
        return bestBefore;
    }

    public int getNbOfDays() {
        return nbOfDays;
    }

    public int getNumberOfRoles() {
        return numberOfRoles;
    }

    public int getScoreAwarded() {
        return scoreAwarded;
    }

    public List<Skill> getSkillTaskList() {
        return skillTaskList;
    }
    public int getSkillTaskListSize() {
        return skillTaskList.size();
    }

    @Override
    public int compareTo(Object o) {
        Job job2=(Job) o ;
        return(this.differenceDeJ()-job2.differenceDeJ());
    }
}
