package model;

public class CreatorVampire extends Vampire {

    //zusaätzliches Attribut 
    private int descendants;

    //Konstruktor
    public CreatorVampire(String name) {
        super (name);
        this.descendants = 0; 
    }


    //Getter & Setter 
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
    public void commandToDrinkBlood(Vampire vampire, int amount, Human human) {

        if (vampire.attackHuman(human) == true) {
            vampire.drinkBlood(amount);
        }

        System.out.println(vampire.getName() + " drunk " + amount + "L of the human blood!");
    }

    //commandToAttack
    public void commandToAttack(Vampire vampire, Human human) {

        
    }

    //sacrifice
    public void sacrifice(Vampire vampire) {

        vampire.setEnergy(0);
        vampire.setFinallyDead(true);
        
    }

    //flee
    public void flee() {

    }
}

