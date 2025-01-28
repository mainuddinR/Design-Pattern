package StateLab09_2;

class NormalBehavior implements Behavior {
    @Override
    public void act(Robot robot) {
        System.out.println(robot.getName() + " is behaving normally.");
        System.out.println("Moving cautiously and avoiding obstacles.");
    }
}
