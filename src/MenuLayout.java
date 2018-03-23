import java.util.Scanner;

public class MenuLayout {

    Scanner scanner;

    public MenuLayout() {
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("========= MENU =========");
        System.out.println("1. Add animal.");
        System.out.println("2. Remove animal.");
        System.out.println("3. List all animals.");
        System.out.println("4. Show shelter's status.");
        System.out.println("0. Exit");
        System.out.print(":>");

        String answer = scanner.nextLine();
        parseAnswer(answer);

    }

    public void parseAnswer(String answer) {

        switch (answer) {
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "0":
                System.exit(0);
            default:
                System.out.println("Illegal operation");
                break;
        }
    }
}
