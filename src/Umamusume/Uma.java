package Umamusume;

import java.util.HashMap;
import java.util.Map;

public class Uma extends BaseUma {
    private static String title;
    private static int stars;
    private static int speed;
    private static int stamina;
    private static int power;
    private static int guts;
    private static int wit;
    private static Map<String, Double> bonuses;
    private static Map<String, String> aptitudes;
    private static UniqueSkill uniqueSkill;
    private static HashMap<String, Skill> skills;
    private static HashMap<String, Skill> potentialSkills;


    /**
     * Uma builder.
     *
     * @param builder Builder stuff.
     */
    private Uma(UmaBuilder builder) {
        super(builder.name, builder.birthday, builder.height, builder.measurements);
        this.title = builder.title;
        this.stars = builder.stars;

        this.speed = builder.speed;
        this.stamina = builder.stamina;
        this.power = builder.power;
        this.guts = builder.guts;
        this.wit = builder.wit;
        this.bonuses = builder.bonuses;
        this.aptitudes = builder.aptitudes;

        this.uniqueSkill = builder.uniqueSkill;
        this.skills = builder.skills;
        this.potentialSkills = builder.potentialSkills;
    }

    /**
     * Aptitude array list setter.
     *
     * @param T  Turf aptitude.
     * @param D  Dirt aptitude.
     * @param S  Sprint aptitude.
     * @param Mi Mile aptitude.
     * @param Me Medium aptitude.
     * @param Lo Long aptitude.
     * @param F  Front runner aptitude.
     * @param P  Pace chaser aptitude.
     * @param La Late surger aptitude.
     * @param E  End closer aptitude.
     * @return Array list filled with the Uma's aptitudes.
     */
    private static Map<String, String> SetAptitudes(String T, String D,
                                                    String S, String Mi, String Me, String Lo,
                                                    String F, String P, String La, String E) {
        Map<String, String> aptitudeList = new HashMap<>();

        aptitudeList.put("Turf", T);
        aptitudeList.put("Dirt", D);

        aptitudeList.put("Sprint", S);
        aptitudeList.put("Mile", Mi);
        aptitudeList.put("Medium", Me);
        aptitudeList.put("Long", Lo);

        aptitudeList.put("Front Runner", F);
        aptitudeList.put("Pace Chaser", P);
        aptitudeList.put("Late Surger", La);
        aptitudeList.put("End Closer", E);

        return aptitudeList;
    }

    // Uma builder.
    public static class UmaBuilder {
        // Base Uma shii
        private String birthday;
        private String height;
        private String measurements;

        private String name;
        private String title;
        private int stars;
        private int speed;
        private int stamina;
        private int power;
        private int guts;
        private int wit;
        private Map<String, Double> bonuses;
        private Map<String, String> aptitudes;
        private UniqueSkill uniqueSkill;
        private HashMap<String, Skill> skills;
        private HashMap<String, Skill> potentialSkills;

        // Setters + builder.
        public UmaBuilder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public UmaBuilder setStamina(int stamina) {
            this.stamina = stamina;
            return this;
        }

        public UmaBuilder setPower(int power) {
            this.power = power;
            return this;
        }

        public UmaBuilder setGuts(int guts) {
            this.guts = guts;
            return this;
        }

        public UmaBuilder setWit(int wit) {
            this.wit = wit;
            return this;
        }

        public UmaBuilder setAptitudes(Map<String, String> aptitudes) {
            this.aptitudes = aptitudes;
            return this;
        }

        public UmaBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UmaBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public UmaBuilder setStars(int stars) {
            this.stars = stars;
            return this;
        }

        public UmaBuilder setUniqueSkill(UniqueSkill uniqueSkill) {
            this.uniqueSkill = uniqueSkill;
            return this;
        }

        public UmaBuilder setSkills(HashMap<String, Skill> skills) {
            this.skills = skills;
            return this;
        }

        public UmaBuilder setPotentialSkills(HashMap<String, Skill> potentialSkills) {
            this.potentialSkills = potentialSkills;
            return this;
        }

        public UmaBuilder setBonuses(Map<String, Double> bonuses) {
            this.bonuses = bonuses;
            return this;
        }

        public Uma build() {
            return new Uma(this);
        }
    }
}
