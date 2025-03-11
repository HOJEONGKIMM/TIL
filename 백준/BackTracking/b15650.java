package 백준.BackTracking;

import java.util.Scanner;

public class b15650 {

    static int N;
    static int M;
    static int[] arr;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[M];

        comb(0, 1);
    }

    static void comb(int idx, int sidx) {
        // 종료 조건
        if (idx == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = sidx; i <= N; i++) {
            arr[idx] = i;
            comb(idx+1, i+1);
        }
    }
}
