package model;

import java.util.UUID;
import java.util.Random;

public class VampireHunter {

    private String id = UUID.randomUUID().toString();
    private String name;
    private int experiencePoints = 0;
    private int energy = 1000;
    private boolean alive;

    /**
     * @param name
     */
    public VampireHunter (String name) {

        this.name = name;
        this.id = UUID.randomUUID().toString();
        this.experiencePoints = 0;
        this.energy = 1000;
        this.alive = true;

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
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public int getExperiencePoints() {
        return experiencePoints;
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
    public boolean isAlive() {
        return alive;
    }

    /**
     * @param alive
     */
    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    
    /**
     * @param vampire
     */
    public void attack(Vampire vampire) {

        int probability = new Random().nextInt(11);
        
        if (probability <= 5) {
            
            vampire.setEnergy(vampire.getEnergy()-3);

            if (vampire.getEnergy() <= 0) {

                vampire.setFinallyDead(true);
                this.experiencePoints++;
                
            } 
        } 
    
    }

    /**
     * @param amount
     * @return
     */
    public void takeDamage(int amount) {

        this.energy = this.energy - amount;

        if (this.energy <= 0) {

            this.alive = false;
            System.out.println(this.name +" is dead !");

        }
    }

    /**
     * @return
     */
    public boolean alive() {

        if (this.energy <= 0) {

            this.alive = false;
        
        }
        
        return this.alive;
    }
    
}
