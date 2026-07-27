import java.util.Scanner;

/*
Chocolate Bar Problem
Determines if it's possible to break off exactly K segments from an N x M 
chocolate bar using a single straight horizontal or vertical cut.
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // Width (number of columns)
        int M = scanner.nextInt(); // Height (number of rows)
        int K = scanner.nextInt(); // Target segments to break off

        // A single cut is valid if:
        // 1. K does not exceed total available segments (N * M)
        // 2. K can be formed by complete rows (K % N == 0) OR complete columns (K % M == 0)
        if (K <= N * M && (K % M == 0 || K % N == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
