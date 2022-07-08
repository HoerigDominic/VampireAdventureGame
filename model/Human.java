package model;

import java.util.UUID;
import java.util.Random;

public class Human {

    private String id;
    private int amountOfBlood;
    private String name;
    private boolean isOverwhelmd;


    /**
     * 
     */
    public Human () {

        this.id = UUID.randomUUID().toString();
        this.amountOfBlood = generateBlood();
        
    }

    /**
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * @return
     */
    public int getAmountOfBlood() {
        return amountOfBlood;
    }

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public boolean isOverwhelmd() {
        return isOverwhelmd;
    }

    /**
     * @param isOverwhelmd
     */
    public void setOverwhelmd(boolean isOverwhelmd) {
        this.isOverwhelmd = isOverwhelmd;
    }

 
    /**
     * @return
     */
    public boolean defend() {

        int probability = new Random().nextInt(5);
        boolean defend = false;

        if (probability <= 1) {
            
            defend = true;
            System.out.println("The human defended himself from your attack!");

        } else {
            System.out.println("The human missed to defend himself from your attack!");
        } 
        return defend;
    }

    /**
     * @return
     */
    public boolean flee() {

        int probability = new Random().nextInt(11);
        boolean fleeValue = false;

        if (probability <= 2) {
            System.out.println("The human fled!");
            fleeValue = true;

        } else {
            System.out.println("The human missed to flee!");
        } 
        return fleeValue;
    } 

    /**
     * @param amount
     * @param vampire
     */
    public void bloodloss (int amount, Vampire vampire) {

        this.amountOfBlood = amountOfBlood - amount;

        if (this.amountOfBlood < 5) {

            turnIntoVampire(vampire);
            System.out.println("A new Vampire has been born!");

        } else {

            System.out.println("You have drinken enough and let the human go his way....");
        } 
        
    }

    /**
     *  Methode noch unklar!
     * @param vampire
     */
    public void turnIntoVampire(Vampire vampire) {

        int randomzahl = new Random().nextInt(21);

        Vampire humanVampire = new Vampire("HumanVampire");
        
    }

    /**
     * @return
     * Definiert Blutmenge zwischen 6-8Liter als integer 
     */
    public int generateBlood() {

    Random randomNumber = new Random();
    int randomNumberValue = randomNumber.nextInt(9);

    while (randomNumberValue < 6 ) {
        randomNumberValue = randomNumber.nextInt(9);
    }

        return randomNumberValue;
    }

}
