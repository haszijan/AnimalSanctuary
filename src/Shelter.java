import java.util.ArrayList;
import java.util.List;

public class Shelter {

    private List<Animal> animals;
    private int shelterCapacity = 10;

    public Shelter() {
        animals = new ArrayList<>(shelterCapacity);
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public int getShelterCapacity() {
        return shelterCapacity;
    }

    public void setShelterCapacity(int shelterCapacity) {
        this.shelterCapacity = shelterCapacity;
    }
}
