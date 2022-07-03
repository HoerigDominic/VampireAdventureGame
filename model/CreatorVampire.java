package model;

public class CreatorVampire extends Vampire {

    private int descendants = 0;

    public CreatorVampire(String name) {
        super (name);
        this.descendants = 0; 
    }

    public int getDescendants() {
        return descendants;
    }

    public void setDescendants(int descendants) {
        this.descendants = descendants;
    }
    
    //Operation
    //listAllDescendants
    public void listAllDescendants() {

        System.out.println("" + this.getDescendants());
    }

    //commandToDrinkBlood
    public void commandToDrinkBlood(Vampire vampire, int amount) {

        vampire.drinkBlood(amount);
        System.out.println(vampire.getName() + " drunk " + amount + "L of the human blood!");

        // Verbindung mit Human to Vampire 
    }

    //commandToAttack
    public void commandToAttack(Vampire vampire) {

        // Human ????
        vampire.attackHuman(Human);
    }

    //sacrifice
    public void sacrifice(Vampire vampire) {

        vampire.setEnergy(0);
        vampire.setFinallyDead(true);
        //Wie kann Vampir gesperrt werden dann ???! 
        /*Der Vampirjäger löscht den geopferten Vampir aus und lässt
        den CreatorVampir mit einer Wahrscheinlichkeit von 50% in Frieden. Mit einer
        Wahrscheinlichkeit von 50% greift er ihn jedoch weiter an. */
        if ()
    }

    //flee
    
}

