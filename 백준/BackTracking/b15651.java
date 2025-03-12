package 백준.BackTracking;

import java.util.Scanner;

public class b15651 {

    static int N;
    static int M;
    static int[] arr;
    static boolean [] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[M];
        visited = new boolean  [M + 1];

    }
    
    static void perm(int idx, int sidx) {
        // 종료 조건
        if (idx == M) {
            for (int i = 0; i < M; i++) {
                System.out.println(arr[i] + 1);
            }
            System.out.println();
            return;

        }
        
        for(int i=1; i<N; i++){

            if (!visited[sidx]) {
                visited[sidx] = true;
                arr[idx] = i;
                perm(idx, sidx + 1);
            }
        }

    }
}
