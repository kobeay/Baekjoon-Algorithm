import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int len = str.length();

        int count = 0;
        boolean word = false;

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                if (!word) {
                    count++;
                    word = true;
                }
            }
            else {
                word = false;
            }
        }

        System.out.print(count);

        sc.close();
    }
}