import java.util.ArrayList;

public class Uma {
    private static int speed;
    private static int stamina;
    private static int power;
    private static int guts;
    private static int wit;
    private static ArrayList<String> aptitudes;

    /**
     * Uma builder.
     *
     * @param builder Builder stuff.
     */
    private Uma(UmaBuilder builder) {
        speed = builder.speed;
        stamina = builder.stamina;
        power = builder.power;
        guts = builder.guts;
        wit = builder.wit;
        aptitudes = builder.aptitudes;
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
    private static ArrayList<String> SetAptitudes(String T, String D,
                                                  String S, String Mi, String Me, String Lo,
                                                  String F, String P, String La, String E) {
        ArrayList<String> aptitudeList = new ArrayList<>();

        aptitudeList.add(T);
        aptitudeList.add(D);

        aptitudeList.add(S);
        aptitudeList.add(Mi);
        aptitudeList.add(Me);
        aptitudeList.add(Lo);

        aptitudeList.add(F);
        aptitudeList.add(P);
        aptitudeList.add(La);
        aptitudeList.add(E);

        return aptitudeList;
    }

    // Uma builder.
    public static class UmaBuilder {
        private int speed;
        private int stamina;
        private int power;
        private int guts;
        private int wit;
        private ArrayList<String> aptitudes;

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

        public UmaBuilder setAptitudes(ArrayList<String> aptitudes) {
            this.aptitudes = aptitudes;
            return this;
        }

        public Uma build() {
            return new Uma(this);
        }
    }
}
