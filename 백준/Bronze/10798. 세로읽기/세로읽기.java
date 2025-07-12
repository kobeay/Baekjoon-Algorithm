import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextLine();
        }

        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if (j < arr[i].length()) {
                    System.out.print(arr[i].charAt(j));
                }
            }
        }

        sc.close();
    }
}