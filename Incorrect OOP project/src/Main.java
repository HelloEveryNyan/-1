import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        Animal runningAnimal = new RunningAnimal("Мурзик", LocalDate.of(2022, 04, 18), new Illness("А"));
        Animal bird = new FlyingAnimal("Голубь", LocalDate.of(2021, 06, 02), new Illness("Б"));
        Animal fish = new SwimmingAnimal("Сом", LocalDate.of(2020, 04, 22), new Illness("В"));

        animals.add(runningAnimal);
        animals.add(bird);
        animals.add(fish);

        for (Animal animal : animals) {
            System.out.println("===================================");
            System.out.println("Животное: " + animal.getName());
            animal.lifeCycle();
            animal.toGo();
            animal.fly();
            animal.swim();
        }
    }
}
