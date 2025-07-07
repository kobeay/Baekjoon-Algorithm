import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] alpha = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};
        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length();) {
            boolean check = false;

            for (String a : alpha) {
                if (i + a.length() <= str.length() && str.substring(i, i + a.length()).equals(a)) {
                    check = true;
                    i += a.length();
                    break;
                }
            }

            if (!check) {
                i += 1;
            }

            count++;
        }

        System.out.println(count);

        sc.close();
    }
}