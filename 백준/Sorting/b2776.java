package 백준.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class b2776 {
    public static void main(String[] args) {
        // 테스트 케이스 개수 T
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int a = 0; a < T; a++) {
            int N = sc.nextInt();
            int[] arrN = new int[N];
            for(int i=0;i<N;i++) {
                arrN[i] = sc.nextInt();
            }

            Arrays.sort(arrN);

            int M = sc.nextInt();
            int[] arrM = new int[M];
            for(int i=0;i<M;i++) {
                arrM[i] = sc.nextInt();
            }

            for (int i = 0; i < M; i++) {
                int left = 0, right = N - 1;
                boolean found = false;
                int target = arrM[i];

                while (left <= right) {
                    int mid = (left + right) / 2;

                    if (arrN[mid] == target) {
                        found = true;
                        break;
                    } else if (arrN[mid] < target) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }

                // 결과 출력
                if (found) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            }

        }
    }
}
