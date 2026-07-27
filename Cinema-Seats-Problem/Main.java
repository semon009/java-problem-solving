import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int count = 0;
            
            for (int j = 0; j < m; j++) {
                if (array[i][j] == 0) {
                    count++;

                    if (count == k) {
                        System.out.println(i+1);
                        return;
                    }
                } else {count = 0;}
            }
        }
        System.out.println(0);
    }
}
