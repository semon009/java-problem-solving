public class Main {
    public static void main(String[] args) {
        // Test Case 1: Start at (0, 0) facing UP, target (3, 0)
        Robot robot1 = new Robot(0, 0, Direction.UP);
        System.out.println("Initial State 1: X=" + robot1.getX() + ", Y=" + robot1.getY() + ", Dir=" + robot1.getDirection());
        Move.moveRobot(robot1, 3, 0);
        System.out.println("Final State 1:   X=" + robot1.getX() + ", Y=" + robot1.getY() + ", Dir=" + robot1.getDirection());

        System.out.println("------------------------------------");

        // Test Case 2: Start at (1, 1) facing RIGHT, target (0, -1)
        Robot robot2 = new Robot(1, 1, Direction.RIGHT);
        System.out.println("Initial State 2: X=" + robot2.getX() + ", Y=" + robot2.getY() + ", Dir=" + robot2.getDirection());
        Move.moveRobot(robot2, 0, -1);
        System.out.println("Final State 2:   X=" + robot2.getX() + ", Y=" + robot2.getY() + ", Dir=" + robot2.getDirection());
    }
}
