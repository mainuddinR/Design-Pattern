package StateLab09_2;

public class RobotSimulation {
    public static void main(String[] args) {
        // Create robots
        Robot robot1 = new Robot("Robot1");
        Robot robot2 = new Robot("Robot2");

        // Assign initial behaviors
        robot1.setBehavior(new AggressiveBehavior());
        robot2.setBehavior(new DefensiveBehavior());

        // Perform actions
        robot1.performAction();
        robot2.performAction();

        // Change behaviors dynamically
        System.out.println("\nChanging Robot1's behavior to Defensive...");
        robot1.setBehavior(new DefensiveBehavior());

        System.out.println("Changing Robot2's behavior to Normal...");
        robot2.setBehavior(new NormalBehavior());

        // Perform actions again
        robot1.performAction();
        robot2.performAction();
    }
}