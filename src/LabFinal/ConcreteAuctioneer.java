package LabFinal;

import java.util.ArrayList;
import java.util.List;

class ConcreteAuctioneer implements Auctioneer {
    private List<Bidder> bidders = new ArrayList<>();
    private double highestBid;
    private String highestBidder;

    @Override
    public void registerBidder(Bidder bidder) {
        bidders.add(bidder);
    }

    @Override
    public void removeBidder(Bidder bidder) {
        bidders.remove(bidder);
    }

    @Override
    public void notifyBidders() {
        for (Bidder bidder : bidders) {
            bidder.update(highestBidder, highestBid);
        }
    }

    @Override
    public void acceptBid(String bidderName, double bidAmount) {
        if (bidAmount > highestBid) {
            highestBid = bidAmount;
            highestBidder = bidderName;
            System.out.println("\nAuctioneer: " + bidderName + " placed the highest bid of $" + highestBid);
            notifyBidders();
        } else {
            System.out.println("\nAuctioneer: Bid of $" + bidAmount + " is lower than the current highest bid.");
        }
    }
}