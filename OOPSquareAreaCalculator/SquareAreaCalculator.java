import java.util.Scanner;

public class Main {
  
    static class Polygon {
        private int sideLength;

        public void setSideLength(int sideLength) {
            this.sideLength = sideLength;
        }

        public int getSideLength() {
            return sideLength;
        }
    }

    static class Square extends Polygon {
        public int calculateArea() {
            int oneSide = getSideLength(); 
            return oneSide * oneSide;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sideLength = scanner.nextInt();

        Square square = new Square();

        square.setSideLength(sideLength);

        System.out.println(square.calculateArea());
    }
}
