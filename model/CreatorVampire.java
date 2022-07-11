package model;

import java.util.Random;

/**
 * Class Creatorvampire
 *
 * @author Dominic Hörig
 * @author Sébastien Foly
 */


public class CreatorVampire extends Vampire {

    private Vampire[] descendants;
    private int atk;

    /**
     * use superkontruktor from vampire class 
     * 
     * @param name
     */
    public CreatorVampire(String name) {
        super (name);
        this.atk = 300;
    }

    /**
     * @return array (descendants of creatorvampire)
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
     * @return Integer (atk of the creatorvampire)
     */
    public int getAtk() {
        return atk;
    } 
    
   
    
    /**
     * list all descendants of a vampire and their stats
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
     * command a minion vampire to attack human
     * 
     * @param vampire
     * @param human
     */
    public void commandToAttack(Vampire vampire, Human human) {

        vampire.attackHuman(human);

    }

    
    /**
     * command a minion vampire to drink blood 
     * 
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
     * creator vampire attack vampirehunter
     * 
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
     * scrifice a vampire during fight with vampirehunter
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
     * @return boolean (if creator vampire fled from vampirehunter or not)
     */
    public boolean flee() {

        int probability = new Random().nextInt(11);

        if (probability <= 4) {
            System.out.println("You fled successfully from the Vampirehunter!");
            return true;

        } else {
            System.out.println("You missed to fled from the Vampirehunter!");
            return false;
        } 

    } 

}

