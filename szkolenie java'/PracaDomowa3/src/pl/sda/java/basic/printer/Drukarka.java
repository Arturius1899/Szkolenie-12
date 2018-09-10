package pl.sda.java.basic.solution.homework3.printer;

/**
 * @author Michal Jaszczyk
 **/
public class Drukarka {

    public static void piatka() {
        System.out.println("#####");
        System.out.println("#");
        System.out.println("####");
        System.out.println("    #");
        System.out.println("    #");
        System.out.println("####");
    }

    public static void kot() {
        System.out.println("" +
                "      \\    /\\\n" +
                "       )  ( ')\n" +
                "      (  /  )\n" +
                "       \\(__)|" +
                "");
    }

    public static void choinka(int wysokosc) {
        // pętla dla każdego rzędu choinki
        for (int i = 1; i <= wysokosc; i++) {
            // dodajemy tyle spacji ile wynosi wysokość choinki odjąć aktualny numer rzędu
            for (int spacje = wysokosc; spacje > i; spacje--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Dodajemy tyle gwiazdek ile wynosi numer rzędu
            }
            System.out.println();
        }
    }
}
