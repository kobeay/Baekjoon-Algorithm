import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n == -1) {
                break;
            }

            int[] arr = new int[n];
            int idx = 0;
            int sum = 0;

            for (int i  = 1; i < n; i++) {
                if (n % i == 0) {
                    arr[idx++] = i;
                    sum += i;
                }
            }

            if (sum == n) {
                System.out.print(n + " = ");

                for (int i = 0; i < idx; i++) {
                    System.out.print(arr[i]);

                    if (i < idx - 1) {
                        System.out.print(" + ");
                    }
                }

                System.out.println();
            }
            else {
                System.out.println(n + " is NOT perfect.");
            }
        }

        sc.close();
    }
}