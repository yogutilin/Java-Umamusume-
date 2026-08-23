package Umamusume;

import java.util.ArrayList;

public class Skill {
    private final String name;
    private final SkillTypes type;
    private final String description;
    private final ArrayList<Double> effect;

    public Skill(String name, SkillTypes type, String description, ArrayList<Double> effect) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.effect = effect;
    }
}
