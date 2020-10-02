/**
 * A basic building block for an opponent
 */
public class Creature {
    //INSTANCE VARIABLES aka "this"
    private String name;
    private int health = 100;
    private Treasure booty;
    
    /**
     * The Creature object's Constructor
     */
    public Creature (String name){
       System.out.println(name + " is born!");
       this.name = name;
    }
     /**
     * Overloaded Constructers
     */
    public Creature (String name, int health){
        this(name);
        this.health = health;
     }

    public Creature (){
        this("Villager");
    }

    public Creature (String name, Treasure t){
        this(name);
        booty = t;
    }

    // ACCESSORS -- part of the encapsulation concept

    public String name(){
        return this.name;
    }

    public int health(){
        return this.health;
    }

    public Treasure getTreasure() {
        return this.booty;
    }

    //MUTATORS -- another part of encapsulation
    public void name(String name){
        this.name = name;
    }

    //Runs when trying to call object
    @Override
    public String toString(){
        return this.name + " - Health:" + this.health;
    }

}
