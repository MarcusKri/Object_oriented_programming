import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    private final Scanner input;
    private final ArrayList<Animal> animal;
    File animals = new File("observations.txt");

    public Program() throws IOException {
        input = new Scanner(System.in);
        animal = new ArrayList<>();
        readFromFile();
    }

    public void handleUserInteraction() throws IOException {
        int choice = 0;
        while (choice != 5) {
            printMainMenu();
            choice = getIntegerFromUser();
            switch (choice) {
                case 1 -> printAllAnimals();
                case 2 -> getNumberOfObservations();
                case 3 -> printCats();
                case 4 -> printObservations();
                case 5 -> quit();
            }
        }
    }

    private void printAllAnimals() {
        System.out.println("-------------------------");
        System.out.println("      ALL ANIMALS        ");
        System.out.println("-------------------------");
        for (Animal a :
                animal) {
            System.out.println(a);
        }
    }

    public void getNumberOfObservations() {
        long lineCount = 0;

        Path path = Paths.get(String.valueOf(animals));

        try {
            lineCount = Files.lines(path).count();
        }
        catch (IOException ioex) {
            ioex.printStackTrace();
        }

        System.out.println("-------------------------");
        System.out.println(" NUMBER OF OBSERVATIONS  ");
        System.out.println("-------------------------");
        System.out.println("{Number of observations is: " + lineCount + "}");
        for (Animal a :
                animal) {
            System.out.println("Animal observation is:" + a.getClass());
        }
    }

    private void printCats() {
        System.out.println("-------------------------");
        System.out.println("      PRINT CATS        ");
        System.out.println("-------------------------");
        for (Animal a :
                animal) {
            if(a instanceof Cat){
                System.out.println(a);
            }
        }
    }

    private void printObservations(){
        System.out.println("-------------------------");
        System.out.println("     UNDER MAINTANCE     ");
        System.out.println("-------------------------");
    }

    private void quit() {
        System.out.println("-------------------------");
        System.out.println("          QUIT           ");
        System.out.println("-------------------------");
        System.out.println("Thank you for using this amazing program. Bye bye!");
    }

    public void readFromFile() throws FileNotFoundException {
        Scanner reader = new Scanner(animals);
        while (reader.hasNextLine()) {
            String animal = reader.nextLine();

            switch (animal) {
                case "Hvalross" -> createWalrus(reader);
                case "Katt" -> createCat(reader);
                case "Hund" -> createDog(reader);
                case "Fugl" -> createBird(reader);
            }
        }
    }

    private void createWalrus(Scanner reader) {
        String where = reader.nextLine();
        String dateString = reader.nextLine();
        LocalDateTime when = LocalDateTime.parse(dateString);
        String comment = reader.nextLine();
        int intactFangs = Integer.parseInt(reader.nextLine());
        Walrus w = new Walrus(where, when, comment, intactFangs);
        animal.add(w);
    }

    private void createBird(Scanner reader) {
        String where = reader.nextLine();
        String dateString = reader.nextLine();
        LocalDateTime when = LocalDateTime.parse(dateString);
        String comment = reader.nextLine();
        String birdType = reader.nextLine();
        int number = Integer.parseInt(reader.nextLine());
        Bird b = new Bird(where, when, comment, birdType, number);
        animal.add(b);
    }

    private void createDog(Scanner reader) {
        String where = reader.nextLine();
        String dateString = reader.nextLine();
        LocalDateTime when = LocalDateTime.parse(dateString);
        String comment = reader.nextLine();
        boolean leash = Boolean.parseBoolean(reader.nextLine());
        String breed = reader.nextLine();
        Dog d = new Dog(where, when, comment, leash, breed);
        animal.add(d);
    }

    private void createCat(Scanner reader) {
        String where = reader.nextLine();
        String dateString = reader.nextLine();
        LocalDateTime when = LocalDateTime.parse(dateString);
        String comment = reader.nextLine();
        String color = reader.nextLine();
        Cat c = new Cat(where, when, comment, color);
        animal.add(c);
    }

    private int getIntegerFromUser() {
        String errorMessage = "That is not a number between " + 1 + " and " + 5;
        int choice = 0;
        while (choice < 1 || choice > 5) {
            System.out.println("Make your choice:");
            try {
                choice = input.nextInt();
            } catch (InputMismatchException inputMismatchException) {
                System.out.println(errorMessage);
            }
            if (choice < 1 || choice > 5) {
                System.out.println(errorMessage);
            }
        }
        input.nextLine();
        return choice;
    }
    private void printMainMenu() {
        System.out.println("-------------------------");
        System.out.println("          MENU           ");
        System.out.println("-------------------------");
        System.out.println("1: Print all animals");
        System.out.println("2: Print number of observations");
        System.out.println("3: Print all cats");
        System.out.println("4: Print observations in a given time room");
        System.out.println("5: Quit program");
    }
}
