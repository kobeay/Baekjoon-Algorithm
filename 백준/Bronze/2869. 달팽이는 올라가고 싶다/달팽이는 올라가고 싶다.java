import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        int day = (V - B) / (A - B);
        // 실질적으로 올라야 하는 높이 / 하루에 오를 수 있는 높이
        // = 며칠이 걸리는지 계산한 것

        if ((V - B) % (A - B) != 0) {
            day++;
        }

        System.out.print(day);

        sc.close();
    }
}