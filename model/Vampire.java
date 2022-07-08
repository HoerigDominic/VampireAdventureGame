package model;

import java.util.UUID;
import java.util.Random;

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
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @return
     */
    public int getGrandness() {
        return grandness;
    }

    /**
     * @return 
     */
    public double getHunger() {
        return hunger;
    }

    /**
     * @return
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
     * @return
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
     * @return
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
     * @return
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
     * @return
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
     * @return
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
     * @param human
     */
    public void attackHuman(Human human) {

        int overwhelmHumanValue = new Random().nextInt(11); 

        if (overwhelmHumanValue <= 6 && human.defend() == true) {
            System.out.println("The Vampire" + this.name + " overwhelmed the Human! Now he could drink blood!");
            human.setOverwhelmd(true);

        } else {
            System.out.println("The Vampire" + this.name + " failed to overhelm the Human! ");

        }

    }

     /**
     * @param amount
     */
    public void drinkBlood(int amount, Human human, Vampire vampire) {

        human.bloodloss(amount, vampire);
        this.hunger = this.hunger - amount;


        if (this.hunger <= 0) {
            System.out.println("The Vampire " + this.name + " satisfied his hunger!");     
        
        } else {
            System.out.println("The Vampire " + this.name + " needs more blood to satisfy his hunger!"); 

        } 
        
    }

    
    /**
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
     * 
     */
    public void print() {

        System.out.println("\nName: "+this.name+
                        "\nGrandness: "+this.grandness+
                        "\nBloodhunger: "+this.hunger+
                        "\nEnergy: "+this.energy+
                        "\nCreator: "+this.creator.getName());


    }


}



    
    

