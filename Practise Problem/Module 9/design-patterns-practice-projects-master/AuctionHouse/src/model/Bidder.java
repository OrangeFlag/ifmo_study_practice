package model;


import java.util.Observable;
import java.util.Observer;
import java.util.Random;

public class Bidder implements Observer {
    private String name;
    private double personalBid;
    private double currentBid;
    private double maxBid;
    private final Random random = new Random();

    public Bidder(String name, double maxBid, Auctioneer auctioneer)
    {
        this(name, maxBid);
        auctioneer.addObserver(this);
    };

    public Bidder(String name, double maxBid)
    {
        this.name = name;
        personalBid = 0.0;
        currentBid = 0.0;
        this.maxBid = maxBid;
    };

    public double getPersonalBid() {
        return personalBid;
    }

    public double getCurrentBid() {
        return currentBid;
    }

    public double getMaxBid() {
        return maxBid;
    }

    public String getName() {
        return name;
    }

    public void makeBid(double currentBid){
        personalBid = currentBid + random.nextInt(9)+1;
    }


    @Override
    public void update(Observable auctioner, Object arg) {
        currentBid = (Double) arg;
        System.out.println("Bidder has been updated with the most recent high bid");
        if ((Double) arg < maxBid)
            makeBid((Double) arg);
        else
            System.out.println("I can't bid any higher!");

    }
}
