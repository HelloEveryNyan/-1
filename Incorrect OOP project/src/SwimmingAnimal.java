import java.time.LocalDate;

public class SwimmingAnimal extends Animal {
    public SwimmingAnimal(String name, LocalDate birthDay, Illness illness) {
        super(name, birthDay, illness);
    }

    @Override
    public boolean canSwim() {
        return true;
    }
}
