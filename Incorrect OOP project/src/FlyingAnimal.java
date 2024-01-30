import java.time.LocalDate;

public class FlyingAnimal extends Animal {
    public FlyingAnimal(String name, LocalDate birthDay, Illness illness) {
        super(name, birthDay, illness);
    }

    @Override
    public boolean canFly() {
        return true;
    }
}
