/**
 * Proyecto por ocio con el cual planeo mejorar en Java
 * hecho por negro.aweonao en ig
 */

import java.util.Random;
import java.util.Scanner;

public class Umamusume {
        /**Definiendo Mecánicas base:
         *  - entrenamientos
         *  - sistema de amistad
         *  - descanso
         *  - recreación
         */

        static Random random = new Random();
        static boolean game = true; //para mantener el código funcional pq soy un pajero

        // Condiciones positivas
        static boolean practicePerfect;
        static boolean charming;
        // Condiciones negativas
        static boolean practicePoor; //5% prob de fallo
        static boolean migraine; // no puede subir el ánimo
        static boolean nightOwl; // % random de bajar energía por 10 / bajar ánimo
        static boolean slowMetabolism; // No puede subir spd
        static boolean slacker; // La uma puede no mostrarse a entrenar

        //moods
        private static String[] moods = {"Awful", "Bad", "Normal", "Good", "Great"};

        // Energía, mood
        static int energia = 100;
        static String mood = moods[2];

        //stats
        static int[] stats = new int[5];

        public static void genStats() {
                for (int i = 0; i < 5; i++) {
                        stats[i] = random.nextInt(80, 120);
                }
        }

        public static void showStats(){
                String[] nombresStats = {"spd", "sta", "pwr", "guts", "wit"};
                for (int i = 0; i < stats.length; i++) {
                        String rango;
                        int v = stats[i];
                        if (v < 50) rango = "Rango G+";
                        else if (v <= 100) rango = "Rango F";
                        else if (v < 150) rango = "Rango F+";
                        else if (v < 200) rango = "Rango E";
                        else if (v < 300) rango = "Rango E+";
                        else if (v < 350) rango = "Rango D";
                        else if (v < 400) rango = "Rango D+";
                        else if (v < 500) rango = "Rango C";
                        else if (v < 600) rango = "Rango C+";
                        else if (v < 700) rango = "Rango B";
                        else if (v < 800) rango = "Rango B+";
                        else if (v < 900) rango = "Rango A";
                        else if (v < 1000) rango = "Rango A+";
                        else if (v < 1050) rango = "Rango S";
                        else if (v < 1100) rango = "Rango S+";
                        else if (v < 1150) rango = "Rango SS";
                        else rango = "Rango SS+";

                        System.out.printf("%s %d | %s\n", nombresStats[i], v, rango);
                }
        }



        //Lo que permite que el usuario juegue
        static void main(String[] args){
                //Pre-juego setups
                Scanner user = new Scanner(System.in);
                genStats();

                while (game) {
                        //Stats del usuario
                        System.out.println("\nStats:");
                        System.out.println("Energía: " + energia);
                        System.out.println("Mood: " + mood);
                        showStats();

                        System.out.print("Ingrese el turno que desee: ");
                        int turno = user.nextInt();

                        //Entrenamiento
                        if (turno == 1) {
                                System.out.println("Entrenamiento");
                        }
                        else if (turno == 2) {
                                System.out.println("Recreacion");
                        }
                        else if (turno == 9) {
                                game = false;
                        }

                }

        }


}
