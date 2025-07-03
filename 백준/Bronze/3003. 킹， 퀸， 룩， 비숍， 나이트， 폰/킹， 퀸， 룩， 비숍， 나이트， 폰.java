import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[6];

        for (int i = 0; i < 6; i++){
            a[i] = sc.nextInt();
        }

        if (a[0] != 1) {
            a[0] = 1 - a[0];
        }
        else {
            a[0] = 0;
        }
        if (a[1] != 1) {
            a[1] = 1 - a[1];
        }
        else {
            a[1] = 0;
        }
        if (a[2] != 2) {
            a[2] = 2 - a[2];
        }
        else {
            a[2] = 0;
        }
        if (a[3] != 2) {
            a[3] = 2 - a[3];
        }
        else {
            a[3] = 0;
        }
        if (a[4] != 2) {
            a[4] = 2 - a[4];
        }
        else {
            a[4] = 0;
        }
        if (a[5] != 8) {
            a[5] = 8 - a[5];
        }
        else {
            a[5] = 0;
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}