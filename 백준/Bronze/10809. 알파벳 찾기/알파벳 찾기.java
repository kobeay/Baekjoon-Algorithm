import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int[] index = new int[26];
        int alpha_n;

        for (int i = 0; i < 26; i++) {
            index[i] = -1;
        }

        for (int i = 0; i < str.length(); i++) {
            alpha_n = str.charAt(i) - 'a';
            if (index[alpha_n] == -1) {
                index[alpha_n] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(index[i] + " ");
        }

        sc.close();
    }
}