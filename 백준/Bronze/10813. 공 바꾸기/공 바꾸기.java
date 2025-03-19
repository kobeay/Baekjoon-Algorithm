import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            int b = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;

            int temp = a[b];
            a[b] = a[c];
            a[c] =temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}