
import java.util.Scanner;

public class swea1217 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int t = 1; t <= 10; t++) {
            int T = sc.nextInt();

            int n = sc.nextInt();
            int c = sc.nextInt();

            System.out.println("#" + T + " " + pow(n, c));

        }
    }

    static int pow(int n, int c) {
        // c가 0이면 1
        if (c == 0) {
            return 1;

        }
        // c가 홀수
        if (c % 2 == 1) {
            int temp = pow(n, (c - 1) / 2);
            return n * temp * temp;
        }

        // c가 짝수
        if (c % 2 == 0) {
            int temp = pow(n, c / 2);
            return temp * temp;
        }

        return 0;
    }

}
