package Example;

import java.util.List;

public class Job {
    String name;
    List<Skill> skillTaskList;

    public Job(String name, List<Skill> skillList) {
        this.name = name;
        this.skillTaskList = skillTaskList;
    }

    public List<Skill> getJobs() {
        return this.skillTaskList;
    }
}
