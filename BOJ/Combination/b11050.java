package BOJ.Combination;

import java.util.Scanner;

public class b11050 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        while (true) {
            if (K == 0)
                break;
            int ans = fac(N) / (fac(N - K) * fac(K));
            int result = ans % 10_007;
            System.out.println(result);
            break;
        }
    }

    static int fac(int n) {
        if (n == 1||n==0) {
            return 1;
        }
        return fac(n - 1) * n;
    }
}
