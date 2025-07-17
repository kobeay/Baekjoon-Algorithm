import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int d = (int)Math.pow(2, n) + 1;
        int result = d * d;

        System.out.print(result);

        sc.close();
    }
}