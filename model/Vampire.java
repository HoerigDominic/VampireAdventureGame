package model;

import java.util.UUID;
import java.util.Random;

public class Vampire {

    //Attribute
    private String id=UUID.randomUUID().toString();
    private String name;
    private int grandness;
    private double hunger;
    private CreatorVampire creator;
    private boolean isDrinkingBlood;
    private boolean inFight;
    private boolean canControllInstincts;
    private int energy;
    private boolean finallyDead;
    
    //Konstruktor für normale jung Vampire
    public Vampire(String name, CreatorVampire creator){

        this.name = name;
        this.creator = creator;
        this.id = UUID.randomUUID().toString();
        this.grandness = 0;
        this.hunger = 5;
        this.isDrinkingBlood = false;
        this.inFight = false;
        this.canControllInstincts = false;
        this.energy = 10;
        this.finallyDead = false;
    }

    //Konstruktor für Creator Vampire
    public Vampire(String name) {

        this.name = name;
        this.id = UUID.randomUUID().toString();
        this.grandness = 0;
        this.hunger = 5;
        this.isDrinkingBlood = false;
        this.inFight = false;
        this.canControllInstincts = true;
        this.energy = 10;
        this.finallyDead = false;
    }

    //Konstruktor für  verwandelte Menschen in Vampire
    public Vampire() {

        this.id = UUID.randomUUID().toString();
        this.creator = null;
        this.grandness = 0;
        this.hunger = 5;
        this.isDrinkingBlood = false;
        this.inFight = false;
        this.canControllInstincts = false;
        this.energy = 10;
        this.finallyDead = false;
    }

    //Getter & Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrandness() {
        return grandness;
    }

    public void setGrandness(int grandness) {
        this.grandness = grandness;
    }

    public double getHunger() {
        return hunger;
    }

    public void setHunger(double hunger) {
        this.hunger = hunger;
    }

    public CreatorVampire getCreator() {
        return creator;
    }

    public void setCreator(CreatorVampire creator) {
        this.creator = creator;
    }

    public boolean isDrinkingBlood() {
        return isDrinkingBlood;
    }

    public void setDrinkingBlood(boolean isDrinkingBlood) {
        this.isDrinkingBlood = isDrinkingBlood;
    }

    public boolean isInFight() {
        return inFight;
    }

    public void setInFight(boolean inFight) {
        this.inFight = inFight;
    }

    public boolean isCanControllInstincts() {
        return canControllInstincts;
    }

    public void setCanControllInstincts(boolean canControllInstincts) {
        this.canControllInstincts = canControllInstincts;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public boolean isFinallyDead() {
        return finallyDead;
    }

    public void setFinallyDead(boolean finallyDead) {
        this.finallyDead = finallyDead;
    }

    //Operationen
    //attackHuman
    public boolean attackHuman(Human human) {

        int overwhelmHumanValue = new Random().nextInt(10); 
        boolean overwhelmHuman = false;

        if (overwhelmHumanValue <= 6 && human.defend() == overwhelmHuman) {
            System.out.println("The Vampire" + this.name + " overwhelmed the Human! Now he could drink blood!");
            overwhelmHuman = true;

        } else {
            System.out.println("The Vampire" + this.name + " failed to overhelm the Human! ");

        }
        return overwhelmHuman;

    }

    //drinkBlood 
    public double drinkBlood(double amount) {

        this.isDrinkingBlood = true;
        this.hunger = this.hunger - amount;

        if (this.hunger <= 0) {
            System.out.println("The Vampire " + this.name + " satisfied his hunger!");     
        
        } else {
            System.out.println("The Vampire " + this.name + " needs more blood to satisfy his hunger!"); 

        } 

        return this.hunger;
        
    }

    //takeDamage
    public int takeDamage(int damage) {

        this.energy = this.energy - damage;

        if (this.energy <= 0) {

            System.out.println(this.name +" is dead !");
            this.finallyDead = true;
        } 
            
        return this.energy;

    }
    
    //print Methode aller Attribute eines Vampires
    public void print() {

        System.out.println("Name"+this.name+"\tGrandness:"+this.grandness+"\tBloodhunger (liter):"+this.hunger+"\nEnergy:"+this.energy+"\tCreator:"+this.creator);

    }

}



    
    

