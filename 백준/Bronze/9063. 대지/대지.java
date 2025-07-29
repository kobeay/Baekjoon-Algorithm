import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max_x = -10000;
        int max_y = -10000;

        int min_x = 10000;
        int min_y = 10000;

        for (int i = 0; i < n; i++) {
            if (arr[i][0] > max_x) {
                max_x = arr[i][0];
            }

            if (arr[i][1] > max_y) {
                max_y = arr[i][1];
            }

            if (arr[i][0] < min_x) {
                min_x = arr[i][0];
            }

            if (arr[i][1] < min_y) {
                min_y = arr[i][1];
            }
        }

        int result = (max_x - min_x) * (max_y - min_y);

        System.out.print(result);

        sc.close();
    }
}