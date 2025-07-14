import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next().toUpperCase();
        int b = sc.nextInt();

        int len = str.length() -1;
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int n;

            if (Character.isDigit(c)) {
                n = c - '0';
            }
            else {
                n = c - 'A' + 10;
            }

            sum = sum + n * (int)Math.pow(b, len);
            len--;
        }

        System.out.println(sum);

        sc.close();
    }
}