package model;

import java.util.UUID;
import java.util.Random;

/**
 * Class Vampire
 *
 * @author Dominic Hörig
 * @author Sébastien Foly
 */

public class Vampire {

    private String id;
    private String name;
    private int grandness;
    private double hunger;
    private CreatorVampire creator;
    private boolean isDrinkingBlood;
    private boolean inFight;
    private boolean canControllInstincts;
    private int energy;
    private boolean finallyDead;
    
    /**
     * Konstruktor for Minion Vampire
     * @param name
     * @param creator
     */
    public Vampire(String name, CreatorVampire creator){

        this.name = name;
        this.creator = creator;
        this.id = UUID.randomUUID().toString();
        this.grandness = 0;
        this.hunger = 5;
        this.energy = 10;
        this.finallyDead = false;
    }

    /**
     * Konstruktor for Creator Vampire and Human-Vampire 
     * @param name
     */
    public Vampire(String name) {
    
        this.name = name;
        this.id = UUID.randomUUID().toString();
        this.grandness = 0;
        this.hunger = 5;
        this.energy = 10;
        this.finallyDead = false;
    }

        
    /**
     * @return String (id of Vampire) 
     */
    public String getId() {
        return id;
    }


    /**
     * @return String (name of Vampire)
     */
    public String getName() {
        return name;
    }

    
    /**
     * @return Integer (grandness of Vampire)
     */
    public int getGrandness() {
        return grandness;
    }


    /**
     * @return double (hunger of Vampire)
     */
    public double getHunger() {
        return hunger;
    }


    /**
     * @return creator (creator of Vampire)
     */
    public CreatorVampire getCreator() {
        return creator;
    }


    /**
     * @param creator
     */
    public void setCreator(CreatorVampire creator) {
        this.creator = creator;
    }


    /**
     * @return boolean (if Vampire drink blood or not)
     */
    public boolean isDrinkingBlood() {
        return isDrinkingBlood;
    }

    
    /**
     * @param isDrinkingBlood 
     */
    public void setDrinkingBlood(boolean isDrinkingBlood) {
        this.isDrinkingBlood = isDrinkingBlood;
    }


    /**
     * @return boolean (if Vampire is in Fight or not)
     */
    public boolean isInFight() {
        return inFight;
    }

    /**
     * @param inFight 
     */
    public void setInFight(boolean inFight) {
        this.inFight = inFight;
    }

    /**
     * @return boolean (if Vampire can controll instincts or not)
     */
    public boolean isCanControllInstincts() {
        return canControllInstincts;
    }

    /**
     * @param canControllInstincts
     */
    public void setCanControllInstincts(boolean canControllInstincts) {
        this.canControllInstincts = canControllInstincts;
    }


    /**
     * @return integer (Energy of Vampire)
     */
    public int getEnergy() {
        return energy;
    }


    /**
     * @param energy
     */
    public void setEnergy(int energy) {
        this.energy = energy;
    }


    /**
     * @return boolean (if Vampire is dead or not)
     */
    public boolean isFinallyDead() {
        return finallyDead;
    }


    /**
     * @param finallyDead
     */
    public void setFinallyDead(boolean finallyDead) {
        this.finallyDead = finallyDead;
    
    }


    /**
     * vampire attacks human
     * 60% vampire overwhelme human
     * 25% human defend the attack 
     * 
     * @param human
     */
    public void attackHuman(Human human) {
    
        int overwhelmHumanValue = new Random().nextInt(11); 
        boolean result;
    
        if (overwhelmHumanValue <= 6) {
            result =human.defend();
            
            if (result == false) {
    
            System.out.println("The Vampire " + this.name + " overwhelmed the Human! Now he could drink blood!");
            human.setOverwhelmd(true); 
    
            } else {
                
                System.out.println("The Vampire " + this.name + " failed to overhelm the Human! ");
            
            }
    
        }
    
    }

     /**
     * when attackHuman is true 
     * vampire drink amount of blood from the human 
     * 
     * @param amount
     * @param human
     */
    public void drinkBlood(int amount, Human human) {
    
        this.hunger = this.hunger - amount;
        human.turnIntoVampire(amount);
    
    
        if (this.hunger <= 0) {
            System.out.println("The Vampire " + this.name + " satisfied his hunger!");     
        
        } else {
            System.out.println("The Vampire " + this.name + " needs more blood to satisfy his hunger!"); 
    
        } 
        
    }

    
    /**
     * vampire take damage from vampirehunter attack
     * 
     * @param damage
     */
    public void takeDamage(int damage) {
    
        this.energy = this.energy - damage;
    
        if (this.energy <= 0) {
    
            System.out.println(this.name +" is dead !");
            this.finallyDead = true;
        } 
    
    }
    
    
    /**
     * print attributes of a vampire
     */
    public void print() {
    
        System.out.println("\nName: "+this.name+
                        "\nGrandness: "+this.grandness+
                        "\nBloodhunger: "+this.hunger+
                        "\nEnergy: "+this.energy+
                        "\nCreator: "+this.creator.getName());
    
    
    }


}   



    
    

