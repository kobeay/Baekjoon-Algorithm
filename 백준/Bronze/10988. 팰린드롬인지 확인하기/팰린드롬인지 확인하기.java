import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            int len = str.length();
            boolean isPalindrome = true;

            for (int i = 0; i < len / 2; i++) {
                if (str.charAt(i) != str.charAt(len - 1 -i)) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }
        }

        sc.close();
    }
}