package 과제.swea;

import java.util.Arrays;
import java.util.Scanner;


// 평탄화 문제
public class swea1208 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 덤프 횟수 입력
        int N = sc.nextInt();
        sc.nextLine();

        // 상자 입력
        String[] input = sc.nextLine().split(" ");
        int L = input.length;
        int[] arr = new int[L];

        for (int i = 0; i < L; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        for(int i=0;i<N;i++) {
            Arrays.sort(arr);
            int max = arr[L-1];
            int min = arr[0];

        if(max - min<=1){break;}

        arr[L-1]--;
        arr[0]++;

        }
        Arrays.sort(arr);
        int result = arr[L-1] - arr[0];
        System.out.println(result);

        sc.close();
    }
}
