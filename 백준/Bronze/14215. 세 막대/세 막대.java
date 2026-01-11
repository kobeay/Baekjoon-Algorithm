import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a <= 0 || b <= 0 || c <= 0) {
            return;
        }

        int max;
        if (a > b && a > c) {
            max = a;
            
            if (max < b + c) {
                System.out.print(max + b + c);
            }
            else {
                System.out.print((b + c) + (b + c - 1));
            }
        }
        else if (b > a && b > c) {
            max = b;

            if (max < a + c) {
                System.out.print(max + a + c);
            }
            else {
                System.out.print((a + c) + (a + c - 1));
            }
        }
        else {
            max = c;

            if (max < a + b) {
                System.out.print(max + a + b);
            }
            else {
                System.out.print((a + b) + (a + b - 1));
            }
        }

        sc.close();
    }
}