package model;

import java.util.UUID;
import java.util.Random;

public class VampireHunter {

    private String id = UUID.randomUUID().toString();
    private String name;
    private int experiencePoints = 0;
    private int energy = 1000;
    private boolean alive;

    public VampireHunter (String name) {

        this.name = name;
        this.id = UUID.randomUUID().toString();
        this.experiencePoints = 0;
        this.energy = 1000;
        this.alive = true;

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

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    

    //Operationen
    //attack
    public int attack(Vampire vampire) {

        int probability = new Random().nextInt(10);
        
        if (probability <= 5) {

            return vampire.getEnergy() - 3;
        } 

        return vampire.getEnergy();
    
    }

    //takeDamage
    public int takeDamage(int amount) {

        this.energy = this.energy - amount;

        return this.energy;
    }

    //alive
    public boolean alive() {

        if (this.energy <= 0) {

            this.alive = false;
            return this.alive;
        }
        return this.alive;
    }
    
}
