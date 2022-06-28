package model;

import java.util.UUID;

public class Vampire {
 
    private String id=UUID.randomUUID().toString();
    private String name;
    private int grandness=0;
    private int hunger=5;
    private CreatorVampire creator;
    private boolean isDrinkingBlood;
    private boolean inFight;
    private boolean canControllInstincts;
    private int energy=10;
    private boolean finallyDead;
    
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

    public Vampire(String name) {

        this.name = name;
        this.id = UUID.randomUUID().toString();
        this.grandness = 0;
        this.hunger = 5;
        this.isDrinkingBlood = false;
        this.inFight = false;
        this.canControllInstincts = false;
        this.energy = 10;
        this.finallyDead = false;
    }


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



    public int getHunger() {
        return hunger;
    }



    public void setHunger(int hunger) {
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


    
    

}
