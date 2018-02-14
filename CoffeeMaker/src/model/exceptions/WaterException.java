package model.exceptions;

public class WaterException extends Exception {
    private double cups;
    public WaterException(double cups){
        super(cups + " cups in machine. Is not enough water");
        this.cups = cups;
    };


}
