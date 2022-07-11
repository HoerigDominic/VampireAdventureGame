package model;

import java.util.UUID;
import java.util.Random;

/**
 * Class Vampirehunter
 *
 * @author Dominic Hörig
 * @author Sébastien Foly
 */

public class VampireHunter {

    private String id = UUID.randomUUID().toString();
    private String name;
    private int experiencePoints = 0;
    private int energy = 1000;
    private boolean alive;

    /**
     * konstruktor for vampirehunter
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
     * @return String (id of vampirehunter)
     */
    public String getId() {
        return id;
    }


    /**
     * @return String (name of vampirehunter)
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
     * @return Integer (espereince points of vampirehunter)
     */
    public int getExperiencePoints() {
        return experiencePoints;
    }

    /**
     * @return Integer (ernergy of vampirehunter)
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
     * @return boolean (if vampirehunter is alive or not)
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
     * 50% chance vampirehunter attack vampire succesfully
     * vampirehunter attack vampire
     * 
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
     * vampirehunter take amount of damage from vampire
     * 
     * @param amount
     */
    public void takeDamage(int amount) {

        this.energy = this.energy - amount;

        if (this.energy <= 0) {

            this.alive = false;
            System.out.println(this.name +" is dead !");

        }
    }

}
