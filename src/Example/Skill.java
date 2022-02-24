package Example;

import java.util.Objects;

public class Skill {
    String name;
    int level;

    public Skill(String name, int level){
        this.name = name;
        this.level = level;
    }

    public int getLevel(){
        return level;
    }

    public String getName(){
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skill skill = (Skill) o;
        return skill.getName().equals(this.name);
    }


    public void upgrade() {
        level++;
    }
}
