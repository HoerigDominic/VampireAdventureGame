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
    
    

    
}
