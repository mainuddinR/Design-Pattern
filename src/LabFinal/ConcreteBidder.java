package LabFinal;

class ConcreteBidder implements Bidder {
    private String name;

    public ConcreteBidder(String name) {
        this.name = name;
    }

    @Override
    public void update(String bidderName, double newBid) {
        System.out.println(name + " received update: " + bidderName + " placed a new bid of $" + newBid);
    }

    @Override
    public String getName() {
        return name;
    }
}
