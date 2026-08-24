package umamusume;

import java.util.ArrayList;

public class UniqueSkill extends Skill {
    private static UniqueSkillLevel level;

    public UniqueSkill(String name, SkillTypes type, String description, ArrayList<Double> effect) {
        super(name, type, description, effect);
    }

    // Enum stuff to handle the Unique skill levels.
    public enum UniqueSkillLevel {
        ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5);

        private final int value;

        // Builder
        UniqueSkillLevel(int value) {
            this.value = value;
        }

        // Getter
        public int getValue() {
            return value;
        }
    }
}
