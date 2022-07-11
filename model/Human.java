package model;

import java.util.UUID;
import java.util.Random;

/**
 * Class Human
 *
 * @author Dominic Hörig
 * @author Sébastien Foly
 */

public class Human {

    private String id;
    private int amountOfBlood;
    private String name;
    private boolean isOverwhelmd;


    /**
     * konstrukor for human
     */
    public Human () {

        this.id = UUID.randomUUID().toString();
        this.amountOfBlood = generateBlood();
        
    }

    
    /**
     * @return String (id of human)
     */
    public String getId() {
        return id;
    }


    /**
     * @return Integer (amount of blood from human)
     */
    public int getAmountOfBlood() {
        return amountOfBlood;
    }


    /**
     * @return String (name of human)
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
     * @return boolean (if human is overwhelmed after vampire attack)
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
     * 25% chance to defend vampire attack
     * 
     * @return booelan (if human defend himself from vampire attack)
     */
    public boolean defend() {

        int probability = new Random().nextInt(5);

        if (probability <= 1) {
            
            System.out.println("The human defended himself from your attack!");
            return true;

        } else {
            System.out.println("The human missed to defend himself from your attack!");
            return false;
        } 
    }


    /**
     * 20% chance to flee from fight witch vampire
     * 
     * @return boolean (if human flee or not)
     */
    public boolean flee() {

        int probability = new Random().nextInt(11);

        if (probability <= 2) {

            return true;

        } else {
            
            return false;
        } 
        
    } 


    /**
     * human turn to vampire when amount of blood < 5
     * 
     * @param amount
     *
     */
    public void turnIntoVampire (int amount) {

        this.amountOfBlood = amountOfBlood - amount;

        if (this.amountOfBlood < 5) {

            System.out.println("A new Vampire has been born!");

        } else {

            System.out.println("You have drinken enough and let the human go his way....");
        } 
        
    }


    /**
     * defines random blood amount between 6-8 for a human
     * 
     * @return Integer (amount of blood from human)
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
