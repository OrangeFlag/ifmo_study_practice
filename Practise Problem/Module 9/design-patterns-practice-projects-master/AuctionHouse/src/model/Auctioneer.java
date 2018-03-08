package model;

import java.util.Observable;
import java.util.Observer;

public class Auctioneer extends Observable {
    private String name;
    private double currentBid;

    public Auctioneer(String name)
    {
        this.name = name;
    };

    public String getName() {
        return name;
    };

    public double getCurrentBid() {
        return currentBid;
    };

    public void acceptBid(double bid) {
        if (bid > currentBid){
            currentBid = bid;
            notifyObservers(currentBid);
        } else{
            System.out.println("That bid isn't larger than the current bid of: $" + currentBid);
        };
    }

    public void notifyObservers(double newBidAmt)
    {
        this.setChanged();
        super.notifyObservers((Double) newBidAmt);

    };

}
