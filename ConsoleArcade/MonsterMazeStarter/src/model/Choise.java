package model;

public abstract class Choise {
    protected String optionMessage;

    //EFFECTS: prints a message representing this possible next choice
    public void printOptionMessage() {
        System.out.println(optionMessage);
    }

    public abstract boolean printOutcome();

    public Choise getChoise(int i) {
        return null;
    }

    public int getChoiseRange() {
        return 0;
    }
}
