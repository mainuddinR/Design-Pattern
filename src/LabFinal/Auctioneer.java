package LabFinal;

interface Auctioneer {
    void registerBidder(Bidder bidder);
    void removeBidder(Bidder bidder);
    void notifyBidders();
    void acceptBid(String bidderName, double bidAmount);
}