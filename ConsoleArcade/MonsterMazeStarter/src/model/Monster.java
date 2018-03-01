package model;

public class Monster extends Choise {

    private Treasure treasure;


    public Monster() {
        this.optionMessage = "Fight a monster.";
        treasure = null;
    }


    //MODIFIES: this
    //EFFECTS: sets the treasure to t
    public void setTreasure(Treasure t) {
        this.treasure = t;
    }

    //EFFECTS: prints the result of choosing this choice
    public boolean printOutcome() {
        if (treasure == null) {
            System.out.println("Ha! I killed you!");
        } else {
            System.out.println("Ahh! You killed me!");
            treasure.printOutcome();
        }
        return true;
    }

}
