package 백준.BackTracking;

import java.util.Scanner;

public class b1629 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.println(multi(A, B, C));
    }


    static int multi(int A, int B, int C) {
        // 종료 조건
        if (B == 1) {
            return A % C;
        }

        int val = multi(A, B / 2, C);
        val = val * val % C;

        if (B % 2 == 0) {   // 제곱하는 수가 짝수일 경우
            return val;
        }        
        return val * A  % C;
    }
}
