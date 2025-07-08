import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            boolean[] visited = new boolean[26];
            boolean isGroup = true;

            char pre = ' ';

            for (int j = 0; j < str.length(); j++) {
                char cur = str.charAt(j);

                if (cur != pre) {
                    if (visited[cur - 'a']) {
                        isGroup = false;
                        break;
                    }

                    visited[cur - 'a'] = true;
                }

                pre = cur;
            }

            if (isGroup) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}