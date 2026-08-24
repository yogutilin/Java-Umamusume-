package umamusume;

public interface SkillTypes {
    enum Standard implements SkillTypes {
        UNIQUE, SPEED, ACCEL, RECOVERY, STARTING, LANECHANGE, OBSERVATION
    }

    enum Passives implements SkillTypes {
        SPEED, STAMINA, POWER, GUTS, WIT, ALLROUNDER
    }

    enum Debuff implements SkillTypes {
        SPEED, ACCEL, STAMINA, OBSERVATION, PANIC
    }
}
