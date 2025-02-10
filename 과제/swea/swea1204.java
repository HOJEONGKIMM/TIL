package 과제.swea;

<<<<<<< HEAD
=======
import java.util.Arrays;
>>>>>>> f28ba5582aa314f8e0298c6a9cc9fcdc4fa07372
import java.util.Scanner;

public class swea1204 {
    public static void main(String[] args) {
<<<<<<< HEAD
        Scanner sc = new Scanner(System.in);
=======
        // 최빈수 구하기
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int N = input.length;

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        // 입력된 수 정렬
        Arrays.sort(arr);

        // 최빈값 계산
        int current = arr[0]; // 현재 숫자
        int cnt = 1;          // 현재 숫자의 빈도
        int maxCount = 1;     // 최댓값 빈도
        int mode = arr[0];    // 최빈값

        for (int i = 1; i < N; i++) {
            if (arr[i] == current) { // 동일한 숫자면 카운트 증가
                cnt++;
            } else { // 다른 숫자라면
                if (cnt > maxCount || (cnt == maxCount && current > mode)) { // 기존 최빈값보다 빈도가 높으면 갱신
                    maxCount = cnt;
                    mode = current;
                }
                // 새로운 숫자로 갱신
                current = arr[i];
                cnt = 1;
            }
        }

        // 마지막 숫자도 최빈값 확인
        if (cnt > maxCount || (cnt == maxCount && current > mode)) {
            maxCount = cnt;
            mode = current;
        }

        // 최빈값과 빈도 출력
        System.out.println(mode);
>>>>>>> f28ba5582aa314f8e0298c6a9cc9fcdc4fa07372
    }
}
