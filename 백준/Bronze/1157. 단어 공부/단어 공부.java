import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().toUpperCase();
        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            arr[ch - 'A'] += 1;
        }

        int max = 0;
        int maxChar = 0;
        boolean isDuplicate = false;
        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxChar = i;
                isDuplicate = false;
            } else if (arr[i] == max) {
                isDuplicate = true;
            }
        }

        if (isDuplicate) {
            System.out.println("?");
        } else {
            System.out.println((char) (maxChar + 'A'));
        }

        sc.close();
    }
}
