package Example.Society;

import Example.Skill;

import java.util.List;

public class Job implements Comparable{
    String name;
    int nbOfDays;
    int scoreAwarded;
    int bestBefore;
    int numberOfRoles;
    List<Skill> skillTaskList;



    public Job(String name, List<Skill> skillList, int nbOfDays, int scoreAwarded, int bestBefore, int numberOfRoles) {
        this.name = name;
        this.skillTaskList = skillList;
        this.nbOfDays = nbOfDays;
        this.scoreAwarded = scoreAwarded;
        this.bestBefore = bestBefore;
        this.numberOfRoles = numberOfRoles;

    }

    public List<Skill> getJob() {
        return this.skillTaskList;
    }

    public int differenceDeJ() {
        return bestBefore-nbOfDays;
    }

    @Override
    public int compareTo(Object o) {
        Job job2=(Job) o ;
        return(this.differenceDeJ()-job2.differenceDeJ());
    }
}
