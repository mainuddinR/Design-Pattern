package StateLab09_2;

class Robot {
    private String name;
    private int position;
    private String nearbyObstacles;
    private Behavior currentBehavior;

    public Robot(String name) {
        this.name = name;
        this.currentBehavior = new NormalBehavior(); // Default behavior
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getNearbyObstacles() {
        return nearbyObstacles;
    }

    public void setNearbyObstacles(String nearbyObstacles) {
        this.nearbyObstacles = nearbyObstacles;
    }

    public void setBehavior(Behavior behavior) {
        this.currentBehavior = behavior;
    }

    public void performAction() {
        currentBehavior.act(this);
    }
}