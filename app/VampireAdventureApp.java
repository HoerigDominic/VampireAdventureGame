package app;

import java.util.Scanner;
import java.util.Random;
        
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
    private static CreatorVampire[] creator = new CreatorVampire[1];
    private static Vampire[] team = new Vampire [3];
    private static Vampire[] descendants2 = new Vampire[10];

    /**
     * @param args mainklasse
     */
    public static void main(String[] args) {
        
        CreatorVampire standardCreator = new CreatorVampire("Graf Dolmeva");
        standardCreator.setCreator(standardCreator);
        creator[0] = standardCreator;
        team[0] = standardCreator; 
    

        Vampire standardVampire1 = new Vampire("Serafim", standardCreator);
        team[1] = standardVampire1;
        descendants2[0] = standardVampire1;
        
        Vampire standardVampire2 = new Vampire("Gondalf", standardCreator);
        team[2] = standardVampire2;
        descendants2[1] = standardVampire2;

        standardCreator.setDescendants(descendants2);

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
                startNightlyAdventure();
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

    /**
     * 
     */
    private static void showMenuFightHuman() {

        String[] menuItems = { "", "(1)\tCommand Vampire to attack", "(2)\tDrinkblood by yourself", "(3)\tCommand Vampire to drink blood", "(4)\tList All Vampires"};
        
        System.out.println("\n-----Menu Fight against Human-----\n");
        for (int i = 1; i < menuItems.length; i++) {
            System.out.println(menuItems[i]);
        }


    }

    /**
     * 
     */
    private static void showMenuFightVampireHunter() {

        String[] menuItems = { "", "(1)\tAttack", "(2)\tSacrifice a Vampire", "(3)\tFlee", "(4)\tList all Vampires"};
        
        System.out.println("\n-----Menu Fight against Vampirehunter-----\n");
        for (int i = 1; i < menuItems.length; i++) {
            System.out.println(menuItems[i]);
        }


    }


    /**
     * 
     */
    private static void createVampire() {

        System.out.println("(1)\t Creator Vampire (2)\t Minions Vampire");
        System.out.print("\nBEWARE! If you choose Creator Vampire, your whole Team will be reseted!\n");
        System.out.print("\nPlease select a type of Vampire: ");
        int choice = scanner.nextInt();

        if (choice == 1) {

            System.out.print("\nPlease enter a Name for your Creator Vampire: ");
            CreatorVampire player = new CreatorVampire(scanner.next());
            team[0] = player;
            creator[0] = player;
            player.setCreator(player);

            System.out.print("\nPlease enter a Name for your first Minion Vampire: ");
            Vampire vampire1 = new Vampire(scanner.next(), player);
            team[1] =vampire1;
            descendants2[0] = vampire1;


            System.out.print("\nPlease enter a Name for your second Minion Vampire: ");
            Vampire vampire2 = new Vampire(scanner.next(), player);
            team[2]= vampire2;
            descendants2[1] = vampire2;

        System.out.println("\nWell done "+player.getName()+"! \nTogether with your two descendents you can start a Nightly Adventure!\n");
        
        }  
        
        if (choice == 2) {

            System.out.print("\nPlease enter a Name for your Minion Vampire: ");
            Vampire vampire3 = new Vampire(scanner.next());

            for (int i = 0; i < team.length; i++) {

                if (team[i] == null) {
                    team[i] = vampire3;
                    descendants2[i-1] = vampire3;
                }
            }

        } 
        else {

            System.out.println("Invalid input. Please choose a correct number between 1 and 2");
        }

    } 


    /**
     * 
     */
    private static void showSelectedVampire() {
        
        System.out.print("\n=====Your Vampire Team====\n");
        System.out.println("(1)\t"+ team[0].getName()+"\n(2)\t"+ team[1].getName());
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

    
    /**
     * 
     */
    public static void listAllVampires() {

        for (int i =0; i < team.length; i++) {

            if(team[i] != null) {
                team[i].print();
            }
        }
    }

    
    /**
     * 
     */
    public static void deleteVampire() {

        System.out.print("\n=====Your Vampire Team=====\n");
        System.out.println("(1)\t"+ team[0].getName()+"\n(2)\t"+ team[1].getName()+"\n(3)\t"+ team[2].getName());
        System.out.print("\nBEWARE! If you choose (1) your Main character will be deleted!\n");
        System.out.print("\nYou have to create a new Creator Vampire and Team!\n");
        System.out.print("\nPlease choose a number between 1 and 3 to delete the Vampire:\t");
        int choice = scanner.nextInt();

        if (choice == 1) {
            team[0] = null;

        }  
        else if (choice == 2) {
            team[1] = null;
            descendants2[0] = null;
        } 
        else if (choice == 3) {
            team[2] = null; 
            descendants2[1] = null;       
        }

    }

    public static void startNightlyAdventure() {

        Vampire[] gameVampireTeam = new Vampire[18];

        for (int i = 0; i < team.length;i++) {

            gameVampireTeam[i] = team[i];
        }
        System.out.print("\n==========================\n");
        System.out.print("\nRise vampires, the sun has gone down and there is lots that needs to be done.\nTime is running: Round 1\n");

        int maxRound = 1;

        while(maxRound <= 15) {

            int probability = new Random().nextInt(11);
            
            if (probability <=7) {
                Human human = new Human();
        
               if (human.flee()== true) {
                System.out.println("\nGreat you meet a Human!");
                System.out.println("The human fled!");
                maxRound++;
                System.out.println("\nRound: "+maxRound);

            } else {

                System.out.println("\nThe human missed to flee!");
                showMenuFightHuman();
                System.out.print("\nPlease choose a number between 1 and 4:\t");
                int choice = scanner.nextInt();
                 
                if (choice == 1) {
                    
                    System.out.println("\nWhich Vampire should attack ?");
                    System.out.println("(1)\t"+ gameVampireTeam[1].getName()+"\n(2)\t"+ gameVampireTeam[2].getName());
                    System.out.print("\nPlease select Position number of the minion which should attack: ");
                    int choice1 = scanner.nextInt();

                    for (int z = 1; z < gameVampireTeam.length; z++) {

                        if (choice1 == z) {
                            gameVampireTeam[z].attackHuman(human);
                        }
                    }
                    showMenuFightHuman();

                } 
                  }
            }
        }
    }
            
    


    /**
     * 
     */
    private static void quitGame() {
        System.out.println("\nThe Game has been closed!\n");
        System.out.println("\n=========================\n");
        System.exit(0);

    }
  
}
