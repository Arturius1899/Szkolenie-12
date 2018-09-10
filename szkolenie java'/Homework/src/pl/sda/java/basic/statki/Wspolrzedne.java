package pl.sda.java.basic.statki;

/**
 * @author Michal Jaszczyk
 **/
public class Wspolrzedne {
    private int x;
    private int y;

    public Wspolrzedne(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean jestWZakresieOdZeraDo(int x, int y) {
        return this.x >= 0 && this.y >= 0 && this.x < x && this.y < y;
    }
}
