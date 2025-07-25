import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int sum = 0;
        int min = n;

        boolean check = false;

        for (int i = m; i <= n; i++) {
            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                check = true;
                sum += i;

                if (min > i) {
                    min = i;
                }
            }
        }

        if (check) {
            System.out.println(sum);
            System.out.println(min);
        }
        else {
            System.out.println("-1");
        }

        sc.close();
    }
}