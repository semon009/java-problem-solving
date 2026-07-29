import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int N = sc.nextInt();

        for (int i = 0; i < A; i++) {
            if (!sb.isEmpty() && sb.charAt(sb.length() - 1) == 'A') {
                sb.append('B');
            } else {
                sb.append('A');
            }
        }

        for (int i = 0; i < B; i++) {
            if (!sb.isEmpty() && sb.charAt(sb.length() - 1) == 'a') {
                sb.append('b');
            } else {
                sb.append('a');
            }
        }

        for (int i = 0; i < C; i++) {
            if (!sb.isEmpty() && sb.charAt(sb.length() - 1) == '1') {
                sb.append('2');
            } else {
                sb.append('1');
            }
        }

        while (sb.length() < N) {
            if (!sb.isEmpty() && sb.charAt(sb.length() - 1) == 'A') {
                sb.append('B');
            } else {
                sb.append('A');
            }
        }

        System.out.println(sb);
    }
}
