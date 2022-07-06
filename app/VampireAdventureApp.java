package app;

import java.util.Scanner;
        
import model.CreatorVampire;
import model.Vampire;
import model.Human;
import model.VampireHunter;

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
                showSelectedVampire();
                break;
            case 3:
                listAllVampires();
                break;
            case 4:
                deletVampire();
                break;
            case 5:
                startNighltyAdventure();
                break;
            case 6:
                quitGame(); 
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
        
        System.out.println("\nVampire Adventures 1.0\n");
        for (int i = 1; i < menuItems.length; i++) {
            System.out.println(menuItems[i]);
        }

    }

    //createVampire
    private static void createVampire() {

        System.out.print("\nPlease enter a Name for your Creator Vampire: ");
        CreatorVampire player = new CreatorVampire(scanner.next());

        System.out.print("\nPlease enter a Name for first Descandent: ");
        Vampire vampire1 = new Vampire(scanner.next(), player);

        System.out.print("\nPlease enter a Name for second Descandent: ");
        Vampire vampire2 = new Vampire(scanner.next(), player);
        
        Vampire[] team = new Vampire [3];
        team[0] = player; 
        team[1] = vampire1;
        team[2] = vampire2;
        System.out.println("\nWell done "+player.getName()+"! \nTogether with your two descendents you can start a Nightly Adventure!\n");
        
    } 

    //showSelectedVampire
    private static void showSelectedVampire() {

        System.out.print("\nPlease select a Vampire to show the stats: ");
    
        scanner.next();

    }
    
    //listAllVampires
    public static void listAllVampires() {

    }

    //deleteVampire
    public static void deletVampire() {

    }

    //startNighltyAdventure
    public static void startNighltyAdventure() {

    }

    //quit
    private static void quitGame() {
        System.out.println("\nThe Game has been closed!\n");
        System.exit(0);

    }
  
}
