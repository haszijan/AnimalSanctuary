import java.util.ArrayList;
import java.util.List;

public class Shelter {

    private List<Animal> animals;

    public Shelter() {
        animals = new ArrayList<>();
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
