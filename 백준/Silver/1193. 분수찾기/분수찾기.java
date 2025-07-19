import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        int sum = 0;
        int line = 0;

        while (sum < X) {
            line++;
            sum += line;
        }

        int pre_sum = sum - line;

        if (line % 2 != 0) {
            int a = 1;
            int b = line;

            for (int i = pre_sum + 1; i <= sum; i++) {
                if (i == X) {
                    System.out.print(b + "/" + a);
                }
                else {
                    a++;
                    b--;
                }
            }
        }
        else {
            int a = line;
            int b = 1;

            for (int i = pre_sum + 1; i <= sum; i++) {
                if (i == X) {
                    System.out.print(b + "/" + a);
                }
                else {
                    a--;
                    b++;
                }
            }
        }

        sc.close();
    }
}