package Example.Society;

import Example.Strat;

import java.util.ArrayList;

public class Society {
    ArrayList<Personnage> personnages;
    ArrayList<Job> jobs;
    Strat strategy;
    int nbrDay;

    public Society(ArrayList<Personnage> personnages, ArrayList<Job> jobs) {
        this.personnages = personnages;
        this.jobs = jobs;
        strategy = new Strat(personnages, jobs);
    }

    public String runLife(){
        System.out.println("Start");

        while(!jobs.isEmpty()){
            System.out.println("List jobs"+jobs);
            strategy.assignJob();
            strategy.passTheDay();
        }
        System.out.println("END");
        return strategy.getLog();
    }

    public ArrayList<Personnage> getPersonnages() {
        return personnages;
    }

    public void setPersonnages(ArrayList<Personnage> personnages) {
        this.personnages = personnages;
    }
}
