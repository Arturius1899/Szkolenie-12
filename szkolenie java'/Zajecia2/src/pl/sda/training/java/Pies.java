package pl.sda.training.java;

public class Pies extends Zwierze {

    private String rasa;

    public Pies(String rasa) {
        super("pies");
    }

    public String getRasa() {
        return rasa;
    }

    public String szczekaj() {
        return "hau";
    }
}
