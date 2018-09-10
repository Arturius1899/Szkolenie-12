package pl.sda.training.java;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hellow world!");
        Osoba michalJaszczyk = new Osoba("Michal", "Jaszczyk", 18, 'M');
        Indeks indeksMichalaJaszczyka = new Indeks(michalJaszczyk);
        int[] ocenyMichalaJaszczyka = new int[]{5, 5, 5, 5, 4, 2};
        indeksMichalaJaszczyka.setOceny(ocenyMichalaJaszczyka);
        float sredniaOcenMichalaJaszczyka =
                indeksMichalaJaszczyka.obliczSrednia();
        System.out.println(sredniaOcenMichalaJaszczyka);
        System.out.println(indeksMichalaJaszczyka.isZagrozenie());
        System.out.println(indeksMichalaJaszczyka.hashCode());
        System.out.println(indeksMichalaJaszczyka.equals(indeksMichalaJaszczyka));
        System.out.println(michalJaszczyk.toString());
        System.out.println(michalJaszczyk);

        Osoba janKowalski = new Osoba("Jan", "Kowalski", 20, 'M');
        Osoba michalJaszczyk2 = new Osoba("Michal", "Jaszczyk", 18, 'M');
        System.out.println(michalJaszczyk.equals(michalJaszczyk2));

        int dziesiec = 10;
        float trzyipol = 3.5f;
        String alaMakota = "ala ma kota";
        System.out.println((float) dziesiec);
        System.out.println((int) trzyipol);
//        System.out.println((float) alaMakota); // niedozwolone
        List<Pies> listaPsow5 = new ArrayList<>();
        List<Pies> listaPsow3 = new LinkedList<>();
        List<Pies> listaPsow4 = new Vector<>();
        ArrayList<Pies> listaPsow2 = new ArrayList<>();

        ArrayList<Pies> listaPsow = new ArrayList<>();
        Sznaucer sznaucer = new Sznaucer();
        listaPsow.add(sznaucer);
        listaPsow.add(new Sznaucer());
        listaPsow.add(new Buldog());

        System.out.println(listaPsow.size());
        for (Pies pies : listaPsow) {
            System.out.println(pies.szczekaj());
        }

        listaPsow.remove(sznaucer);
        System.out.println(listaPsow.size());
        for (Pies pies : listaPsow) {
            System.out.println(pies.szczekaj());
        }

        listaPsow.remove(listaPsow.size() - 1);
        System.out.println(listaPsow.size());
        for (Pies pies : listaPsow) {
            System.out.println(pies.szczekaj());
        }

        LinkedHashSet<Integer> liczby = new LinkedHashSet<>();
        liczby.add(1);
        liczby.add(2);
        liczby.add(20);
        liczby.add(50);
        liczby.add(50);
        for (Integer liczba : liczby) {
            System.out.println(liczba);
        }

        HashMap<Integer,String> mapa = new HashMap<>();
        mapa.put(1, "cos");
        mapa.put(4, "cos4");
        mapa.put(40, "cos40");
        mapa.put(4, "cos Nowego");

        for (Map.Entry entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        List<Integer> liczbyCalkowite = new ArrayList<>();
        liczbyCalkowite.add(1);
        liczbyCalkowite.add(10);
        liczbyCalkowite.add(100);
        liczbyCalkowite.add(34);
        liczbyCalkowite.add(20);
        for (Integer integer : liczbyCalkowite) {
            System.out.println(integer);
        }
        System.out.println("------------------");
//        Collections collections = new Collections(); // blad
        Collections.sort(liczbyCalkowite);
        for (Integer integer : liczbyCalkowite) {
            System.out.println(integer);
        }

        List<String> slowa = new ArrayList<>();
        slowa.add("aaa");
        slowa.add("zzz");
        slowa.add("ddd");
        slowa.add("bbb");
        for (String integer : slowa) {
            System.out.println(integer);
        }
        System.out.println("------------------");
        Collections.sort(slowa);
        for (String integer : slowa) {
            System.out.println(integer);
        }

    }
}
