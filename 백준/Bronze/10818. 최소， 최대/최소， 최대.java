import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static int max(int[] a, int n) {
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }

        return max;
    }

    public static int min(int[] a, int n) {
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(br.readLine());

            String[] arr = br.readLine().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(arr[i]);
            }

            int maxValue = max(a, n);
            int minValue = min(a, n);

            System.out.println(minValue + " " + maxValue);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
