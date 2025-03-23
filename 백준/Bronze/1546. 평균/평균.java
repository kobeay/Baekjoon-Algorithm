import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] grade = new int[n];
        for (int i = 0; i < n; i++) {
            grade[i] = sc.nextInt();
        }

        int max = grade[0];
        for (int i = 1; i < n; i++) {
            if (max < grade[i]) {
                max = grade[i];
            }
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (double) grade[i] / max * 100;
        }
        double avg = sum / n;

        System.out.println(avg);

        sc.close();
    }
}