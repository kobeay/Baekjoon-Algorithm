import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        double totalCredit = 0;
        for (int i = 0; i < 20; i++) {
            String str = sc.nextLine();
            String[] words = str.split(" ");

            double product = 0;
            double n1 = Double.parseDouble(words[1]);

            if (words[2].equals("P")) continue;

            switch (words[2]) {
                case "A+":
                    product = n1 * 4.5;
                    break;
                case "A0":
                    product = n1 * 4.0;
                    break;
                case "B+":
                    product = n1 * 3.5;
                    break;
                case "B0":
                    product = n1 * 3.0;
                    break;
                case "C+":
                    product = n1 * 2.5;
                    break;
                case "C0":
                    product = n1 * 2.0;
                    break;
                case "D+":
                    product = n1 * 1.5;
                    break;
                case "D0":
                    product = n1 * 1.0;
                    break;
                case "F":
                    product = n1 * 0.0;
                    break;
            }

            total += product;
            totalCredit += n1;
        }

        double avg =total / totalCredit;

        System.out.printf("%.6f\n", avg);

        sc.close();
    }
}