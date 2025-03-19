import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            for (int j = b - 1; j <= c - 1; j++) {
                a[j] = d;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        
        sc.close();
    }
}