import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int total = 0;

        for (int i = 0; i < n; i++) {
            int pn = sc.nextInt();
            int count = 0;

            for (int j = 1; j <= pn; j++) {
                if (pn % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                total++;
            }
        }

        System.out.print(total);

        sc.close();
    }
}