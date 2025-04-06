import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        StringBuffer sb1 = new StringBuffer(str1);
        String reversedStr1 = sb1.reverse().toString();

        String str2 = sc.next();
        StringBuffer sb2 = new StringBuffer(str2);
        String reversedStr2 = sb2.reverse().toString();

        int n1 = Integer.parseInt(reversedStr1);
        int n2 = Integer.parseInt(reversedStr2);

        if (n1 < n2) {
            System.out.print(n2);
        }
        else {
            System.out.print(n1);
        }

        sc.close();
    }
}