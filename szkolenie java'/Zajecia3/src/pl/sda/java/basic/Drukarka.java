package pl.sda.java.basic;

public class Drukarka {

    public void drukuj() {
        System.out.println("Pusta strona");
    }

    public void drukuj(int liczbaStron) {
        for (int i = 1; i <= liczbaStron; i++) {
            drukuj();
        }
    }

    public void drukuj(String trescStrony) {
        System.out.println(trescStrony);
    }

    public void drukuj(String trescStrony, int iloscStron) {
        for (int i = 1; i <= iloscStron; i++) {
            System.out.println(trescStrony);
        }
    }

    public static void main(String[] args) {
        Drukarka mojaDrukarka = new Drukarka();
        mojaDrukarka.drukuj();
        mojaDrukarka.drukuj(1);
    }
}
