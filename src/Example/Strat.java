package Example;

import Example.Society.Job;
import Example.Society.Personnage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static sun.jvm.hotspot.runtime.BasicObjectLock.size;

public class Strat {
    ArrayList<Personnage> personnages;
    ArrayList<Job> jobs;

    String solution = "three projects are planned";

    public Strat(ArrayList<Personnage> personnages, ArrayList<Job> jobs) {
        this.personnages = personnages;
        this.jobs = jobs;

        solution += jobs.size() + " three projects are planned";
    }

    public void dayAfterDay(){
        for (int i=0;i<100;i++){
            this.assignJob();
        }
    }

    public void assignJob() {

        ArrayList<Personnage> personnagesCanWork = new ArrayList<Personnage>
                (this.personnages.stream().filter(p -> p.getCanWork()).collect(Collectors.toList()));

        ArrayList<Job> jobCanWork = new ArrayList<Job>
                (this.jobs.stream().filter(j -> !(j.getAssign())).collect(Collectors.toList()));

        for (int i = 0; i < jobCanWork.size(); i++) {
            jobCanWork.forEach(j->{
                if ()
            });
        }
    }

}
