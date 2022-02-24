package Example;

import Example.Society.Job;
import Example.Society.Personnage;

import java.util.ArrayList;



public class Strat {
    ArrayList<Personnage> personnages;
    ArrayList<Job> jobs;
    ArrayList<Job> startJob;
    String log;


    String solution = "three projects are planned";

    public Strat(ArrayList<Personnage> personnages, ArrayList<Job> jobs) {
        this.personnages = personnages;
        this.jobs = jobs;

        solution += jobs.size() + " three projects are planned";
        startJob = new ArrayList<>();
        log = String.valueOf(jobs.size())+"\n";
    }



    //Ordonner la liste
    //

    //définier personnes compétente
    // une personne est compétente Pour un skill:
    //  Bon skill
    //  Bon niveau
    public ArrayList<Personnage> findCompetentePersonnageForSkill(Skill skill){
        ArrayList<Personnage> competentePersonnage = new ArrayList<>();
        for(Personnage currentPers : personnages){
            if(currentPers.isEligibleForSkill(skill))
                competentePersonnage.add(currentPers);
        }
        return competentePersonnage;
    }

    //Pour chaque skill requis une personne compétente
    public ArrayList<Personnage> findBestPersonnageForAJob(Job job){
        ArrayList<Personnage> bestPersonnes = new ArrayList<>();
        for(Skill skillNeeded : job.getSkillTaskList()){
            ArrayList<Personnage> competentesPersonnages = findCompetentePersonnageForSkill(skillNeeded);
            if(!competentesPersonnages.isEmpty())
                bestPersonnes.add(competentesPersonnages.get(0));
        }
        return bestPersonnes;
    }
    public void associatePersonnagesToJob(ArrayList<Personnage> bestPersonnes, Job job){
        job.associate(bestPersonnes);
        startJob.add(job);
    }


    public void assignJob() {
        //regarde tout les jobs qui ne sont pas asignés
        //si on peut assigner des personnes alors on assigne
        for(Job currentJob : jobs){
            if(!startJob.contains(currentJob) && findBestPersonnageForAJob(currentJob).size() == currentJob.getNumberOfRoles()){
                associatePersonnagesToJob(findBestPersonnageForAJob(currentJob), currentJob);
                log+=currentJob.getName()+"\n";
                log+=currentJob.getWorker();
            }
        }
    }

    public void passTheDay() {
        ArrayList<Job> loopJob = (ArrayList<Job>) startJob.clone();
        for(Job currentJob : loopJob){
            currentJob.passDay();
            if(currentJob.projectIsEnd()){
                ArrayList<Personnage> workerJob = (ArrayList<Personnage>) currentJob.getPeopleWorkOn();
                for(Personnage worker:workerJob){
                    worker.endWork();
                }
                currentJob.upgradeWorkers();
                jobs.remove(currentJob);
                startJob.remove(currentJob);
            }
        }
    }

    public String getLog() {
        return log;
    }
}
