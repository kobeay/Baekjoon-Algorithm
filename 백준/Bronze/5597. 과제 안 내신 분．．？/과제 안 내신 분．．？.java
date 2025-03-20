import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[28];
        for (int i = 0; i <28; i++) {
            a[i] = sc.nextInt();
        }

        int[] check = new int[31];
        for (int i = 0; i < 28; i++) {
            check[a[i]] = 1;
        }

        for (int i = 1; i <= 30; i++) {
            if (check[i] != 1) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}