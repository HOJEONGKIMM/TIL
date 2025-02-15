package 과제.swea;

import java.util.Scanner;

public class swea1204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        다음과 같은 수 분포가 있으면,
//        10, 8, 7, 2, 2, 4, 8, 8, 8, 9, 5, 5, 3
//        최빈수는 8이 된다.
//        최빈수를 출력하는 프로그램을 작성하여라

        int num = sc.nextInt(); // 테스트 케이스 번호
        int[] frequency = new int[101];

        for (int i = 0; i < num; i++) {
            frequency[sc.nextInt()]++;
        }

        int max = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > frequency[max]) {
                max = i;
            }
        }

        System.out.println(max);
    }
}