package Example.Society;

import Example.Skill;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Job implements Comparable {
    String name;
    int nbOfDays;
    int scoreAwarded;
    int bestBefore;
    int numberOfRoles;
    List<Skill> skillTaskList;

    boolean assign = false;

    public Job(String name, List<Skill> skillList, int nbOfDays, int scoreAwarded, int bestBefore, int numberOfRoles) {
        this.name = name;
        this.nbOfDays = nbOfDays;
        this.scoreAwarded = scoreAwarded;
        this.bestBefore = bestBefore;
        this.numberOfRoles = numberOfRoles;

    }

    public void setSkillTaskList(List<Skill> skillTaskList) {
        this.skillTaskList = skillTaskList;
    }

    public List<Skill> getJob() {
        return this.skillTaskList;
    }

    public int differenceDeJ() {
        return bestBefore - nbOfDays;
    }

    @Override
    public int compareTo(Object o) {
        Job job2 = (Job) o;
        return (this.differenceDeJ() - job2.differenceDeJ());
    }


    public void setAssign(boolean work) {
        this.assign = work;
    }

    public boolean getAssign() {
        return this.assign;
    }

    public boolean canDoIt(ArrayList<Personnage> personnages) {
        ArrayList<Personnage> personnagesAssign = new ArrayList<>();

        this.skillTaskList.forEach(s -> {
            personnages.forEach(p -> {
                p.getSkill().forEach(s1 -> {
                    if (s1.getLevel() >= s.getLevel() && s1.getName().equals(s.getName())) {
                        personnages.add(p);
                    }
                });
            });
        });

        ArrayList<Personnage> personnagesAssignBest = new ArrayList<>();

        for (int i = 0; i < skillTaskList.size(); i++) {

            ArrayList<Job> jobCanWork = new ArrayList<Job>
                    (personnagesAssign.stream().filter(p -> p.getSkill().contains(skillTaskList.get(i)

                    )).collect(Collectors.toList()));

        }

    }

}
