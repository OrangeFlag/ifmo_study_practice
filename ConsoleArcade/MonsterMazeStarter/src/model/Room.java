package model;

import java.util.ArrayList;
import java.util.List;

public class Room extends Choise {

    private List<Choise> choises;
    private int id;


    public Room(int id) {
        optionMessage = "Enter Room " + id + ".";
        this.id = id;
        choises = new ArrayList<>();
    }


    //EFFECTS: prints all possible next choices
    public boolean printOutcome() {
        System.out.println("You are now in Room " + id + ".\n");
        System.out.println("You have the following options: ");

        int counter = 1;

        for (Choise c: choises) {
            System.out.print("\tOption " + counter + ": ");
            c.printOptionMessage();
            counter++;
        }
        return false;
    }


    //MODIFIES: this
    //EFFECTS: adds t to next possible treasures
    public void addChoise(Choise t) {
        choises.add(t);
    }

    //getters for gameplay
    public Choise getChoise(int i) {
        return choises.get(i);
    }

    public int getChoiseRange() {
        return choises.size();
    }

}
