package 수업.조합;

import java.util.Arrays;
import java.util.Scanner;

public class 조합 {

    static int N;
    static int R;
    static String[] selected;
    static String[] ingredient;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        R = sc.nextInt();
    }

    public static void combination(int idx, int sidx){

        // 종료 조건
        // R개의 재료를 모두 선택했으면 출력
        if(sidx == R){
            System.out.println(Arrays.toString(selected));
        }
        // 재귀 조건
        else if(idx == N){

        }
        else{
            selected[sidx] = ingredient[idx];
            combination(idx+1, sidx+1);

            combination(idx+1, sidx);
        }

    }
}
