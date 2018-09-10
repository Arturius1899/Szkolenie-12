package pl.sda.java.basic.lesson.lesson3;

public class MainTablicaLiczbCalkowitych {
    public static void main(String[] args) {
        int[] jakiesLiczby = new int[]{200, 2, 150, 1410, 13, 532, 999};
        TablicaLiczbCalkowitych tablica
                = new TablicaLiczbCalkowitych(jakiesLiczby);
        tablica.wypisz2nawiekszeINajmniejsze();
    }
}
