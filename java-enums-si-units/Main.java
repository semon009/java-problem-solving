public class Main {
    public static void main(String[] args) {
        for (SI unit : SI.values()) {
            System.out.println(unit.name() + " represents: " + unit.getQuantityName());
        }
    }
}
