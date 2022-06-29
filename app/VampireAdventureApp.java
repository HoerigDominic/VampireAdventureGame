package app;

import java.util.Scanner;

/**
 * @author vemaj
 *
 */
public class VampireAdventureApp {

    private static Scanner scanner = new Scanner(System.in);

    /**
     * @param args mainklasse
     */
    public static void main(String[] args) {

        while (true) {
            showMenu();
            int choice = readUserInput();
            handle(choice);
            System.out.println("============");
        }           // Schleife aktiviert @Team
    }

    /**
     * 
     * @return
     */
    private static int readUserInput() {
        System.out.print("\nPlease choose a number between 1 and 6:\t");
        int choiceInternal = 0;
        try{
         choiceInternal = scanner.nextInt();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            scanner.nextLine(); //@author Team
        }

        return choiceInternal;
    }

    /**
     * 
     * @param choice
     */
    private static void handle(int choice) {
        switch (choice) {
            case 1:
                createVampire();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                quitGame(); // Funktion Team
                break;
            default: {
                System.out.println("Invalid input. Please choose a correct number between 1 and 6");
                showMenu();
            }
                break;

        }
    }

    /**
     * 
     */
    private static void showMenu() {

        String[] menuItems = { "", "(1)\t Create Vampire", "(2)\t Show Selected Vampire", "(3)\t List all Vampire", "(4)\t Delete Vampire", "(5)\t Start Nightly Adventure", "(6)\t Quit"};
        //Menupunkte Team
        System.out.println("\nVampire Adventures 1.0\n");
        for (int i = 1; i < menuItems.length; i++) {
            System.out.println(menuItems[i]);
        }

    }

    private static void createVampire() {
        System.out.println(
                "\nLeider hat die Methode noch keinen Code. Aber Du kannst hoffentlich nachvollziehen wie der Ablauf ist. Hier sollst Du einen Vampir anlegen.\n");
    }

    // Team
    private static void quitGame() {
        System.out.println("\nThe Game has been closed!\n");
        System.exit(0);

    }
    
}
