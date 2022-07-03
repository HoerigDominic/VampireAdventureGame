package model;

import java.util.UUID;
import java.util.Random;
-

public class Human {
    
    private String id = UUID.randomUUID().toString();
    private double amountOfBlood = generateRandom();

    public Human (double amountOfBlood) {

        this.amountOfBlood = amountOfBlood;
        this.id = UUID.randomUUID().toString();

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //defend

    //flee

    //turnIntoVampire
    public void turnIntoVampire(Vampire vampire) {

        if (this.amountOfBlood < 5) {
            Vampire humanToVampire = new Vampire();
            vampire.getName();
            humanToVampire.setCreator();

            //Creator setzen für den neuen Vampir ?

            
        }
    }

    // Definiert Blutmenge zwischen 6-8Liter als Double 
    public int generateRandom() {

    Random randomNumber = new Random();
    int randomNumberValue = randomNumber.nextInt(8);

    while (randomNumberValue < 6 ) {
        randomNumberValue = randomNumber.nextInt(8);
    } 
    return randomNumberValue;
    }


}
