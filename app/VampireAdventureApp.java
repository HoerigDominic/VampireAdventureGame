package app;

import java.util.Scanner;
        
import model.CreatorVampire;
import model.Vampire;

/**
 * @author vemaj
 *
 */
public class VampireAdventureApp {

    private static Scanner scanner = new Scanner(System.in);
    private static Vampire[] team = new Vampire [10];

    /**
     * @param args mainklasse
     */
    public static void main(String[] args) {
        
        CreatorVampire standardCreator = new CreatorVampire("Graf Dolmeva");
        Vampire standardVampire1 = new Vampire("Serafim", standardCreator);
        Vampire standardVampire2 = new Vampire("Gondalf", standardCreator);
        
        team[0] = standardCreator; 
        team[1] = standardVampire1;
        team[2] = standardVampire2;

        while (true) {
            showMenu();
            int choice = readUserInput();
            handle(choice);
            System.out.println("============");
        }           
        
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
            scanner.nextLine(); 
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
                deleteVampire();
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
        team[0] = player;

        System.out.print("\nPlease enter a Name for your first Descandent: ");
        Vampire vampire1 = new Vampire(scanner.next(), player);
        team[1] =vampire1;

        System.out.print("\nPlease enter a Name for your second Descandent: ");
        Vampire vampire2 = new Vampire(scanner.next(), player);
        team[2]= vampire2;

        System.out.println("\nWell done "+player.getName()+"! \nTogether with your two descendents you can start a Nightly Adventure!\n");

    } 

    //showSelectedVampire
    private static void showSelectedVampire() {
        
        System.out.print("\n=====Your Vampire Team====\n");
        System.out.println("(1)\t"+ team[0].getName()+"\n(2)\t"+ team[1].getName()+"\n(3)\t"+ team[2].getName());
        System.out.print("\nPlease choose a number between 1 and 3:\t");
        int choice = scanner.nextInt();

        if (choice == 1) {
            team[0].print();
        }  
        else if (choice == 2) {
            team[1].print();
        } 
        else if (choice == 3) {
            team[2].print();
        } 
        else {
            System.out.println("\nInvalid Input, Please choose a correct number between 1 and 3:\t");
        }    

    }  

    //listAllVampires
    public static void listAllVampires() {

        for (int i =0; i < team.length; i++) {

            if(team[i] != null) {
                team[i].print();
            }
        }
    }

    //deleteVampire
    public static void deleteVampire() {

    }

    //startNighltyAdventure
    public static void startNighltyAdventure() {

    }

    //quit
    private static void quitGame() {
        System.out.println("\nThe Game has been closed!\n");
        System.out.println("\n=========================\n");
        System.exit(0);

    }
  
}
