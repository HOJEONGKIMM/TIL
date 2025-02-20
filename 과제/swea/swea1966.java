package 과제.swea;

// 숫자를 정렬하자

import java.util.Arrays;
import java.util.Scanner;

// 주어진 N 길이의 숫자열을 오름차순으로 정렬하여 출력하라.
public class swea1966 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int t = 1; t <= T; t++){

            int N = sc.nextInt();
            int[] arr = new int[N];

            for(int i = 0; i < N; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < N; i++){
                sb.append(arr[i]).append(" ");
            }

            System.out.println("#"+t+" "+sb);
        }

        sc.close();
    }
}
