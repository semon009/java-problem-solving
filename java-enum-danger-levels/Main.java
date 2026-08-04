public class Main {
    public static void main(String[] args) {
        DangerLevel high = DangerLevel.HIGH;
        DangerLevel medium = DangerLevel.MEDIUM;
        DangerLevel low = DangerLevel.LOW;

        System.out.println("Is HIGH > MEDIUM? " + (high.getLevel() > medium.getLevel()));
        System.out.println("Is LOW < MEDIUM? " + (low.getLevel() < medium.getLevel()));   

        for (DangerLevel danger : DangerLevel.values()) {
            System.out.println(danger.name() + " level is: " + danger.getLevel());
        }
    }
}
