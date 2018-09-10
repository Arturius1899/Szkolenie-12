package pl.sda.java.basic.interfacing;

public interface Jadalny extends Smaczny { // Interfejs może rozszerzać inny interfejs, ale nie może żadnego implementować

    public static final String BIALY = "bialy"; // W interfejsie tylko stałe statyczne

    public void zjedz(); // Wszystkie metody w interfejsie są publiczne

    // Od Javy 8 możemy dodać domyślną implementację metody
    default void obierz() {
        System.out.println("obieram grzyba");
    }
}
