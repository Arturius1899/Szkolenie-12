package pl.sda.java.basic.varargs;

import java.util.ArrayList;

/**
 * @author Michal Jaszczyk
 **/
public class Main {
    public static void main(String[] args) {
        VarargsExample varargsPrzyklad = new VarargsExample();
        ArrayList<String> lista = new ArrayList<>();
        lista.add("zxc");
        String[] jakasTablica = new String[]{"a", "b"};
        varargsPrzyklad.sklejWyrazy(); // Jedna metoda obsługuje nam wiele przypadków (bezparametrowy, tablica oraz dowolna lista argumentów tego samego typu)
        varargsPrzyklad.sklejWyrazy(jakasTablica);
        varargsPrzyklad.sklejWyrazy("q", "w", "e");

        int[] tablicaLiczb = new int[]{5, 6, 10};
        System.out.println(varargsPrzyklad.suma());
        System.out.println(varargsPrzyklad.suma(tablicaLiczb));
        System.out.println(varargsPrzyklad.suma(1, 6, 9, 10));


        varargsPrzyklad.suma(5); // Java dopasuje wywołanie do najbardziej odpowiedniego mimo, że w tym wypadku varargs też by zadziałało
    }
}
