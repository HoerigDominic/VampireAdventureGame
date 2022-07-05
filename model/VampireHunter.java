package model;

import java.util.UUID;

public class VampireHunter {

    private String id = UUID.randomUUID().toString();
    private String name;
    private int experiencePoints = 0;
    private int energy = 1000;

    public VampireHunter (String name) {

        this.name = name;
        this.id = UUID.randomUUID().toString();
        this.experiencePoints = 0;
        this.energy = 1000;

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

    




    
}
