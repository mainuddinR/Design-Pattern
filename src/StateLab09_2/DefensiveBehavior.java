package StateLab09_2;

class DefensiveBehavior implements Behavior {
    @Override
    public void act(Robot robot) {
        System.out.println(robot.getName() + " is behaving defensively.");
        System.out.println("Retreating to a safer position.");
    }
}