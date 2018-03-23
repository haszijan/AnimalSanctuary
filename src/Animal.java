import java.util.Objects;

public class Animal {

    private String name;
    private Species species;

    public Animal(String name, Species species) {
        this.name = name;
        this.species = species;
    }

    public Animal(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) &&
                species == animal.species;
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, species);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", species=" + species +
                '}';
    }
}
