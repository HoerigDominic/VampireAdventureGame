package model;

import java.util.UUID;
import java.util.Random;

public class Human {
    
    private String id = UUID.randomUUID().toString();
    Random amountOfBlood = new Random();
    double amountOfBloodValue = amountOfBlood.nextDouble()*8;


    public Human () {

        this.amountOfBlood = amountOfBlood;
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAmountOfBlood() {
        return amountOfBlood;
    }

    public void setAmountOfBlood(int amountOfBlood) {
        this.amountOfBlood = amountOfBlood;
    }

    



}
