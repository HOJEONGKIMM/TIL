package 과제.swea;

import java.util.Scanner;

public class swea2805_농작물수확하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] arr = new int[N][N];

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                sum += arr[i][j];
            }
        }

        // 왼쪽위
        int leftUp = 0;
        for(int i=0; i<N/2; i++){
            for(int j=N/2; j>0; j--){
                leftUp += arr[i][j];
            }
        }

        // 오른쪽위
        int rightUp = 0;
        for(int i =0; i<N/2; i++){
            for(int j=(N/2)+1; j<N; j++){
                rightUp += arr[i][j];
            }
        }

        // 왼쪽아래
        int leftDown = 0;
        for(int i=0; i<N/2; i++){
            for(int j=(N/2)+1; j<N; j++){
                leftDown = arr[j][i];
            }
        }

        // 오른쪽아래

    }
}
