package model;

import java.util.UUID;
import java.util.Random;

public class Human {
    
    //Attribute
    private String id;
    private double amountOfBlood = generateRandom();

    //Konstruktor
    public Human (double amountOfBlood) {

        this.id = UUID.randomUUID().toString();
        this.amountOfBlood = amountOfBlood;
        
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

    public void setAmountOfBlood(double amountOfBlood) {
        this.amountOfBlood = amountOfBlood;
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

    //turnIntoVampire
    public void turnIntoVampire(Vampire vampire) {

        if (this.amountOfBlood < 5) {
            new Vampire();
            
        }
    }

    //Definiert Blutmenge zwischen 6-8Liter als Double 
    public double generateRandom() {

    Random randomNumber = new Random();
    double randomNumberValue = randomNumber.nextDouble()*9;

    while (randomNumberValue < 6 ) {
        randomNumberValue = randomNumber.nextDouble()*9;
    }

        return randomNumberValue;
    }

}
