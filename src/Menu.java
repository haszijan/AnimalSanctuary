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
        System.out.println("=============== MENU ===============");
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
                System.out.print("Enter name: ");
                animal.setName(scanner.nextLine());
                System.out.println("Choose species.");
                System.out.println("C: CAT");
                System.out.println("D: DOG");
                chooseSpecies();
                addAnimal();
                printAnimals();
                break;

            case "2":
                printAnimals();
                System.out.print("Enter name of animal to remove it from the list: ");
                String name = scanner.nextLine();
                removeAnimal(name);
                printAnimals();
                break;

            case "0":
                System.exit(0);
            }

        }

    void chooseSpecies () {
        String chosenSpecies = scanner.nextLine();
        switch (chosenSpecies) {
            case "C":
                animal.setSpecies(Species.CAT);
                System.out.println("New cat has been added.");
                break;
            case "D":
                animal.setSpecies(Species.DOG);
                System.out.println("New dog has been added.");
                break;
            default:
                System.out.println("Choose C for CAT or D for DOG.");
        }
    }

    void addAnimal() {
        shelter.getAnimals().add(new Animal(animal.getName(), animal.getSpecies()));
    }

    void printAnimals() {
        System.out.println(shelter.getAnimals());
    }

    void removeAnimal(String name) {
        
    }
}
