// Illness.java
public class Illness {
    private String name;

    public Illness(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Illness: " + (name != null ? name : "Нет болезни");
    }
}
