import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[9];
        int n;
        for (int i = 0; i < 9; i++) {
            a[i] = sc.nextInt();
        }

        int max = a[0];
        int line = 1;
        for (int i = 1; i < 9; i++) {
            if (max < a[i]) {
                max = a[i];
                line = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(line);
    }
}
