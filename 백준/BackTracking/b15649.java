package 백준.BackTracking;

import java.util.*;

public class b15649 {

    static int N;
    static int M;
    static int[] arr;
    static int[] result;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i+1;
        }

        result = new int[M];    // M크기의 결과 배열열
        
        comb(0, 0);
    }

    static void comb(int idx, int selectedIdx) {
        if (selectedIdx == M) {

            for (int i = 0; i < N; i++) {
                System.out.println(result[i] + " ");
            }
            return;
        }
        if (idx == N) {
            // System.out.println(Arrays.toString(result));
             return;
        }
        else {
            // 결과 배열에 현재 있는 배열의 인덱스 값에 맞춰서 넣어주기
            result[selectedIdx] = arr[idx];

            // 
            comb(idx + 1, selectedIdx + 1);
            comb(idx + 1, selectedIdx);

        }
    }

}
