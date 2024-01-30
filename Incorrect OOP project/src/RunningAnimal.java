import java.time.LocalDate;

public class RunningAnimal extends Animal {
    public RunningAnimal(String name, LocalDate birthDay, Illness illness) {
        super(name, birthDay, illness);
    }

    @Override
    public boolean canToGo() {
        return true;
    }
}
