package LabFinal;

public class AuctionSystem {
    public static void main(String[] args) {
        // Create Auctioneer
        Auctioneer auctioneer = new ConcreteAuctioneer();

        // Create Bidders
        Bidder bidder1 = new ConcreteBidder("Mainudddin");
        Bidder bidder2 = new ConcreteBidder("Atikul");
        Bidder bidder3 = new ConcreteBidder("Maria");

        // Register Bidders
        auctioneer.registerBidder(bidder1);
        auctioneer.registerBidder(bidder2);
        auctioneer.registerBidder(bidder3);

        // Start Bidding
        auctioneer.acceptBid("Mainuddin", 100);
        auctioneer.acceptBid("Atikul", 150);
        auctioneer.acceptBid("Maria", 200);
        auctioneer.acceptBid("Mainuddin", 250);
        auctioneer.removeBidder(bidder2);
        auctioneer.acceptBid(bidder3.getName(), 300);
    }
}