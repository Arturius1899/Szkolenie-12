package pl.sda.java.basic.lesson;

/**
 * @author Michal Jaszczyk
 **/
@SuppressWarnings("All")
public class Lesson4 {
    /*
    1. Wypisz wszystkie liczby z zakresu 20 do 123.
    2. Wypisz wszystkie liczby z zakresu -40 do 15.
    3. Wypisz wszystkie liczby z zakresu 1 do 100 w kolejności od największej do najmniejszej
    4. Wypisz wszystkie liczby parzyste z przedziału 0 do 100.
    5. Dla liczb z przedziału 0 do 100 podaj informację, czy są podzielne przez 2, 3 i 5, w następujący sposób:
        0, podzielne przez: 2, 3, 5
        1
        2, podzielne przez: 2
        3, podzielne przez: 3
        4, podzielne przez: 2
        5, podzielne przez: 5
        6, podzielne przez: 2, 3
        7
        8, podzielne przez: 2
        9, podzielne przez: 3
        10, podzielne przez: 2, 5
     */
    /*
    1. Stwórz klasę KonwerterOcen
    2. Dodaj metodę konwertujOcene zwracającą łańcuch znakowy oraz przyjmujący
        jako argument liczbę całkowitą
    3. Powyższa metoda powinna zamieniać oceny z zakresu 1 do 6 na
        odpowiedniki słowne (dla 4 dobry, 2 mierny, itd.)
        w innym wypadku ma zwracać wartość "nieznana"
    4. Skorzystaj z warunku logicznego switch
     */
    /*
    1. Stwórz klasę Owoc
    public class Owoc {
    }
    2. Dodaj następujące metody zwracające łańcuch znakowy: smak, BIALY, wielkosc
    public class Owoc {
        public String smak() {
            return "slodki";
        }
        public String BIALY() {
            return "czerwony";
        }
        public String wielkosc() {
            return "maly";
        }
    }
    3. Dodaj klasy Jablko, Truskawka, Wisnia, które rozszerzają klasę Owoc
    public Jablko extends Owoc {

    }
    4. Zdefiniuj własne implementacje metod smak i wielkosc w powyższych klasach
        (BIALY niech korzysta z domyślnej implementacji klasy owoc)
    public Jablko extends Owoc {
        public String smak() {
            return "slodko-kwasny";
        }
        public String wielkosc() {
            return "srednia";
        }
    }
    5. Stwórz klasę Main wraz z metodą main (psvm)
    6. Stwórz po jednym obiekcie klasy Owoc, Jablko, Truskawka, Wisnia
    7. Stwórz ArrayList w metodzie main, która przechowuje obiekty typu Owoc
    8. Dodaj stworzone wcześniej owoce do powyższej listy
    9. Wyświetl smak, BIALY oraz wielkosc kazdego owocu z listy
    ------------------
    10. Stwórz kolekcję typu HashSet, która przechowuje obiekty typu Owoc
    11. Dodaj wcześniej stworzone owoce do powyższej kolekcji
    12. Wyświetl smak każdego owocu w kolekcji
    ------------------
    13. Zmień klasę Owoc na klasę abstrakcyjną (public abstract class Owoc {)
    14. Popraw błedy kompilacji (usuń utworzenie obiektu Owoc w klasie Main)
    15. Zmień implementację metody BIALY w klasie Owoc na abstrakcyjną (abstract)
    16. Zaobserwuj co się stało oraz napraw błędy kompilacji
    ------------------
    17. Stwórz klasę abstrakcyjną Grzyb
        public abstract class Grzyb {
    18. Zdefiniuj w niej metodę zbierz wraz z domyślną implementacją
        public abstract class Grzyb {
            public void zbierz() {
                System.out.println("zebrałem grzyba");
            }
    19. Stwórz klasy Prawdziwek, Pieczarka oraz Muchomor, które rozszerzają klasę Grzyb
    -------------------
    20. Stwórz interfejs o nazwie Jadalny (public interface NazwaInterfejsu)
    21. Zdefiniuj metodę zjedz w powyższym interfejsie
    22. Zaimplementuj interfejs Jadalny w klasach Prawdziwek oraz Pieczarka (implements Jadalny)
    23. Stwórz klasę MainGrzyby oraz metodę psvm
    24. Stwórz obiekt typu Prawdziwek i Pieczarka
    25. Stwórz ArrayList przechowującą obiekty typu Jadalny
    26. Dodaj stworzone obiekty prawdziwka i pieczarki do powyższej listy
     */
}
