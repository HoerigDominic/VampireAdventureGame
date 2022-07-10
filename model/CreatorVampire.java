package model;

import java.util.Random;

public class CreatorVampire extends Vampire {

    private Vampire[] descendants;
    private int atk;

    /**
     * @param name
     */
    public CreatorVampire(String name) {
        super (name);
        this.atk = 300;
    }

    /**
     * @return
     */
    public Vampire[] getDescendants() {
        return descendants;
    }

    /**
     * @param descendants
     */
    public void setDescendants(Vampire[] descendants) {
        this.descendants = descendants;
    }

    /**
     * @return
     */
    public int getAtk() {
        return atk;
    } 
    
   
    
    /**
     * 
     */
    public void listAllDescendants() {

        for (int i = 0; i < descendants.length; i++) {

            if(descendants[i] != null) {
                System.out.println("\n=====Your descendants=====\n");
                System.out.println("\nName: "+descendants[i].getName()+"\tEnergy: "+descendants[i].getEnergy()+"\tHunger: "+descendants[i].getHunger()+"\tDead: "+descendants[i].isFinallyDead()+"\n");

            }
        }

    }

    
    /**
     * @param vampire
     * @param human
     */
    public void commandToAttack(Vampire vampire, Human human) {

        vampire.attackHuman(human);

    }

    
    /**
     * @param vampire
     * @param amount
     * @param human
     */
    public void commandToDrinkBlood(int amount, Human human, Vampire vampire) {

            if(human.isOverwhelmd() == true) {
                vampire.drinkBlood(amount,human);
                System.out.println(vampire.getName() + " drunk " + amount + "L of the human blood!");
        }

        System.out.println("\nYou have to overwhelme the human before drinking his blood!\n");
    }
    

    /**
     * @param vampireHunter
     */
    public void attackVampireHunter(VampireHunter vampirehunter) {

        int probability = new Random().nextInt(11);
        
        if (probability <= 5) {
            
            vampirehunter.setEnergy(vampirehunter.getEnergy()-this.atk);

            if (vampirehunter.getEnergy() <= 0) {

                vampirehunter.setAlive(false);
                
            } 
        } 
    
    }

    /** 
     * 
     * @param vampire
     */
    public void sacrifice(Vampire vampire) {

        for (int i = 0; i < descendants.length; i++) {

            if (descendants[i] == vampire) {
                descendants[i] = null;
            }
        } 
    }


    /**
     * 
     */
    public boolean flee() {

        int probability = new Random().nextInt(11);
        boolean fleeValue = false;

        if (probability <= 4) {
            System.out.println("You fled successfully from the Vampirehunter!");
            fleeValue = true;

        } else {
            System.out.println("You missed to fled from the Vampirehunter!");
        } 
        return fleeValue;
    } 

}

