import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr_A = new int[n][m];
        int[][] arr_B = new int[n][m];

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                arr_A[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                arr_B[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
               System.out.print(arr_A[i][j] + arr_B[i][j] + " ");
            }
            System.out.println();
        }


        sc.close();
    }
}