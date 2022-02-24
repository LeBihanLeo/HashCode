package Example;

import Example.Society.Job;
import Example.Society.Personnage;

import java.util.ArrayList;



public class Strat {
    ArrayList<Personnage> personnages;
    ArrayList<Job> jobs;

    String solution = "three projects are planned";

    public Strat(ArrayList<Personnage> personnages, ArrayList<Job> jobs) {
        this.personnages = personnages;
        this.jobs = jobs;

        solution += jobs.size() + " three projects are planned";
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
    public void findBestPersonnageForAJob(Job job){
        ArrayList<Personnage> bestPersonnes = new ArrayList<>();
        for(Skill skillNeeded : job.getSkillTaskList()){
            ArrayList<Personnage> competentesPersonnages = findCompetentePersonnageForSkill(skillNeeded);
            bestPersonnes.add(competentesPersonnages.get(0));
        }
        job.associate(bestPersonnes);
    }



}
