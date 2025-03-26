import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            char start = str.charAt(0);
            char end = str.charAt(str.length() - 1);

            System.out.println(start + "" + end);
        }

        sc.close();
    }
}