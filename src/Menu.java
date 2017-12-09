import java.util.Scanner;

public class Menu {

    private Shelter shelter;
    private Scanner scanner;
    private Animal animal;

    public Menu() {
        shelter = new Shelter();
        scanner = new Scanner(System.in);
        animal = new Animal();
    }

    void start() {
        do {
            menulayout();
        } while (true);
    }

    void menulayout() {
        System.out.println("\n=============== MENU ===============");
        System.out.println("1. Add animal");
        System.out.println("2. Remove animal");
        System.out.println("3. Status");
        System.out.println("0. Exit");

        String answer = scanner.nextLine();
        parseAnswer(answer);
    }

    void parseAnswer(String answer) {
        switch (answer) {
            case "1":
                isAnyFreeSlot();
                if (isAnyFreeSlot() == true) {
                    System.out.print("Enter name: ");
                    animal.setName(scanner.nextLine());
                    chooseSpecies();
                    addAnimal();
                }
                else {
                    System.out.println("No vacancies.");
                }
                printAnimals();
                break;

            case "2":
                printAnimals();
                System.out.print("Enter name of animal to remove it from the list: ");
                animal.setName(scanner.nextLine());
                chooseSpecies();
                removeAnimal();
                printAnimals();
                break;

            case "3":
                amountofFreeSlots();
                break;

            case "0":
                System.exit(0);
            }

        }

    void chooseSpecies () {
        System.out.println("Choose species.");
        System.out.println("C: CAT");
        System.out.println("D: DOG");
        String chosenSpecies = scanner.nextLine();
        switch (chosenSpecies) {
            case "C":
                animal.setSpecies(Species.CAT);
                break;
            case "D":
                animal.setSpecies(Species.DOG);
                break;
            default:
                System.out.println("Choose C for CAT or D for DOG.");
        }
    }

    void addAnimal() {
        shelter.getAnimals().add(new Animal(animal.getName(), animal.getSpecies()));
    }

    void printAnimals() {
        for (Animal animal : shelter.getAnimals()) {
            System.out.println(animal);
        }
    }

    void removeAnimal() {
        System.out.println(shelter.getAnimals().remove(animal));
    }

    void amountofFreeSlots() {
        System.out.println(shelter.getAnimals().size());
        if (shelter.getAnimals().size() < shelter.getShelterCapacity()) {
            System.out.println("We have still free slots.");
        }
        else {
            System.out.println("No vacancies.");
        }
    }

    boolean isAnyFreeSlot() {
        if (shelter.getAnimals().size() < shelter.getShelterCapacity()) {
            return true;
        } else return false;
    }
}
