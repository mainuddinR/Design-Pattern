package StateLab09_2;

class AggressiveBehavior implements Behavior {
    @Override
    public void act(Robot robot) {
        System.out.println(robot.getName() + " is behaving aggressively.");
        System.out.println("Charging towards the target!");
    }
}

