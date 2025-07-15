import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();

        Stack<Character> stack = new Stack<>();

        while (n != 0) {
            int r = n % b;
            n = n / b;

            if (r >= 0 && r <= 9) {
                stack.push((char)('0' + r));
            }
            else {
                stack.push((char)('A' + (r - 10)));
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

        sc.close();
    }
}