import java.util.Objects;
import java.time.LocalDate;



public class Animal {
    protected String name;
    protected LocalDate birthDay;
    protected Illness illness;

    public Animal(String name, LocalDate birthDay, Illness illness) {
        this.name = name;
        this.birthDay = birthDay;
        this.illness = illness;
    }

    public Animal() {
        this("Вася", LocalDate.now(), new Illness("Болезнь"));
    }

    public void toGo() {
        if (canToGo()) {
            System.out.println(getType() + " двигается");
        }
    }

    public void fly() {
        if (canFly()) {
            System.out.println(getType() + " летает");
        }
    }

    public void swim() {
        if (canSwim()) {
            System.out.println(getType() + " плавает");
        }
    }

    private void wakeUp() {
        System.out.println(getType() + " проснулся");
    }

    private void hunt() {
        System.out.println(getType() + " охотится");
    }

    private void eat() {
        System.out.println(getType() + " кушает");
    }

    private void sleep() {
        System.out.println(getType() + " спит");
    }

    public void lifeCycle() {
        wakeUp();
        hunt();
        eat();
        sleep();

        toGo();
        fly();
        swim();
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    public String getName() {
        return name;
    }

    public boolean canToGo() {
        return true;
    }
    public boolean canFly() {
        return false;
    }
    public boolean canSwim() {
        return false;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public Illness getIllness() {
        return illness;
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("name = %s, birthday = %s, illness = %s", name, birthDay, illness);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) &&
                Objects.equals(birthDay, animal.birthDay) &&
                Objects.equals(illness, animal.illness);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthDay, illness);
    }
}
