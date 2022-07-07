package model;

import java.util.UUID;
import java.util.Random;

public class Human {
    
    //Attribute
    private String id;
    private int amountOfBlood;
    private String name;
    private boolean isOverwhelmd;


    //Konstruktor
    public Human () {

        this.id = UUID.randomUUID().toString();
        this.amountOfBlood = generateBlood();
        
    }

    //Getter & Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmountOfBlood() {
        return amountOfBlood;
    }

    public void setAmountOfBlood(int amountOfBlood) {
        this.amountOfBlood = amountOfBlood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOverwhelmd() {
        return isOverwhelmd;
    }

    public void setOverwhelmd(boolean isOverwhelmd) {
        this.isOverwhelmd = isOverwhelmd;
    }

    //Operationen
    //defend
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

    //flee
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

    //looseBlood
    public void bloodloss (int amount, Vampire vampire) {

        this.amountOfBlood = amountOfBlood - amount;

        if (this.amountOfBlood < 5) {

            turnIntoVampire(vampire);
            System.out.println("A new Vampire has been born!");

        } else {

            System.out.println("You have drinken enough and let the human go his way....");
        } 
        
    }

    //turnIntoVampire
    public void turnIntoVampire(Vampire vampire) {

        

        
    
            
        }
    }

    //Definiert Blutmenge zwischen 6-8Liter als Double 
    public int generateBlood() {

    Random randomNumber = new Random();
    int randomNumberValue = randomNumber.nextInt(9);

    while (randomNumberValue < 6 ) {
        randomNumberValue = randomNumber.nextInt(9);
    }

        return randomNumberValue;
    }



}
