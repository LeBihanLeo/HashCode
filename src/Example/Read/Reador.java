package Example.Read;

import Example.Skill;
import Example.Society.Job;
import Example.Society.Personnage;

import java.util.ArrayList;
import java.util.Collections;

public class Reador {
    ArrayList<ArrayList<String>> toRead;
    int numberOfContributors ;
    int numberOfJobToDo ;
    ArrayList<Personnage> listOfPerso=new ArrayList<>();
    ArrayList<Job> listOfJob=new ArrayList<>();

    public Reador(){
        this.toRead=InputReader.readInput();
        read();
        Collections.sort(listOfJob);
    }

    void read(){
        int ligne=0;
        numberOfContributors=Integer.parseInt(toRead.get(0).get(0));
        numberOfJobToDo=Integer.parseInt(toRead.get(0).get(1));
        ligne++;
        while (listOfPerso.size()!=numberOfContributors){
            Personnage personnage=new Personnage(toRead.get(ligne).get(0),Integer.parseInt(toRead.get(ligne).get(1)));
            ligne++;
            while (personnage.getSkillListSize()<personnage.getNbOfSkill()){
                personnage.addSkillList(new Skill(toRead.get(ligne).get(0),Integer.parseInt(toRead.get(ligne).get(1))));
                ligne++;
            }
            this.listOfPerso.add(personnage);
        }
        while (listOfJob.size()!=numberOfJobToDo){
            Job job=new Job(toRead.get(ligne).get(0),Integer.parseInt(toRead.get(ligne).get(1)),Integer.parseInt(toRead.get(ligne).get(2)),Integer.parseInt(toRead.get(ligne).get(3)),Integer.parseInt(toRead.get(ligne).get(4)));
            ligne++;
            while (job.getSkillTaskListSize()<job.getNumberOfRoles()){
                job.addSkillTaskList(new Skill(toRead.get(ligne).get(0),Integer.parseInt(toRead.get(ligne).get(1))));
                ligne++;
            }
            this.listOfJob.add(job);
        }
    }

    public ArrayList<ArrayList<String>> getToRead() {
        return toRead;
    }

    public void setToRead(ArrayList<ArrayList<String>> toRead) {
        this.toRead = toRead;
    }

    public int getNumberOfContributors() {
        return numberOfContributors;
    }

    public void setNumberOfContributors(int numberOfContributors) {
        this.numberOfContributors = numberOfContributors;
    }

    public int getNumberOfJobToDo() {
        return numberOfJobToDo;
    }

    public void setNumberOfJobToDo(int numberOfJobToDo) {
        this.numberOfJobToDo = numberOfJobToDo;
    }

    public ArrayList<Personnage> getListOfPerso() {
        return listOfPerso;
    }

    public void setListOfPerso(ArrayList<Personnage> listOfPerso) {
        this.listOfPerso = listOfPerso;
    }

    public ArrayList<Job> getListOfJob() {
        return listOfJob;
    }

    public void setListOfJob(ArrayList<Job> listOfJob) {
        this.listOfJob = listOfJob;
    }
}

