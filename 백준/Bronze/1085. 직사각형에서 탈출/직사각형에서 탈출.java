import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        if (x <= y && x <= (w - x) && x <= (h - y)) {
            System.out.print(x);
        }
        else if (y <= x && y <= (w - x) && y <= (h - y)) {
            System.out.print(y);
        }
        else if ((w - x) <= x && (w - x) <= y && (w - x) <= (h - y)) {
            System.out.print((w - x));
        }
        else {
            System.out.print((h - y));
        }

        sc.close();
    }
}