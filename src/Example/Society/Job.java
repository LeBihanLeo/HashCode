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
    List<Personnage> peopleWorkOn;


    boolean assign = false;

    public Job(String name, int nbOfDays, int scoreAwarded, int bestBefore, int numberOfRoles) {
        this.name = name;
        this.nbOfDays = nbOfDays;
        this.scoreAwarded = scoreAwarded;
        this.bestBefore = bestBefore;
        this.numberOfRoles = numberOfRoles;
        skillTaskList = new ArrayList<>();
        peopleWorkOn = new ArrayList<>();

    }

    public boolean projectIsEnd(){
        if(nbOfDays == 0 ) return true;
        return false;
    }

    public void addSkillTaskList(Skill skillTask) {
        this.skillTaskList.add(skillTask);
    }

    public List<Skill> getJob() {
        return this.skillTaskList;
    }

    public int differenceDeJ() {
        return bestBefore - nbOfDays;
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
        Job job2 = (Job) o;
        return (this.differenceDeJ() - job2.differenceDeJ());
    }


    public void setAssign(boolean work) {
        this.assign = work;
    }

    public boolean getAssign() {
        return this.assign;
    }

    //associer une/plusieurs personne compétente à ce job
    //trouver les personnes compétentes FAUX
    //trouver le nombre de personne à associer au projet
    //associer les personnes au projet

    public void associate(ArrayList<Personnage> personnages){
        for(int i = 0 ; i < numberOfRoles ; i++){
            peopleWorkOn.add(personnages.get(i));
            personnages.get(i).setJob(this);
        }
    }

    public boolean canDoItBool(ArrayList<Personnage> personnages) {
        if (this.canDoIt(personnages).size() == this.getSkillTaskList().size()) return true;
        return false;
    }

    public ArrayList<Personnage> canDoIt(ArrayList<Personnage> personnages) {
        ArrayList<Personnage> personnagesAssign = new ArrayList<>();

        for (int i = 0; i < skillTaskList.size(); i++) {
            boolean someoneCanWorkOnIt = false;
            for (int j = 0; j < personnages.size(); j++) {
                if (!(someoneCanWorkOnIt) && personnages.get(j).isEligible(this) && personnages.get(i).getCanWork()) {
                    someoneCanWorkOnIt = true;
                    personnagesAssign.add(personnages.get(j));
                }
            }
        }
        return personnagesAssign;
    }

    public void passDay() {
        nbOfDays--;
    }

    public List<Personnage> getPeopleWorkOn() {
        return peopleWorkOn;
    }

    public String getWorker() {
       String res = "";
        for(int i = 0 ; i < peopleWorkOn.size() -1 ; i++){
            res+=peopleWorkOn.get(i).getName()+" ";
        }
        res+=peopleWorkOn.get(peopleWorkOn.size() -1).getName()+"\n";
        return res;
    }

    public void upgradeWorkers() {
        for(Skill currentSkill : skillTaskList){
            for(Personnage personnage : peopleWorkOn){
                personnage.upgradeSkill(currentSkill);
            }
        }
    }

    @Override
    public String toString() {
        return "Job{" +
                "name='" + name + '\'' +
                '}';
    }
}
