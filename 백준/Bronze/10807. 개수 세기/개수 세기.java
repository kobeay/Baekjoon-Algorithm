import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MAX = 100;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[MAX];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int v = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == v) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}