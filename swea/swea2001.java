package swea;

import java.util.Scanner;

public class swea2001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arrM = new int[M][M];
        int[][] arrN = new int[N][N];

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                arrN[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0;i<N-M;i++){
            for(int j=0;j<N-M;j++){
                int sum=0;          // N * N 내부 원소의 합
                for(int a=0;a<M;a++){
                    for(int b=0;b<M;b++){
                        arrM[a][b] = arrN[i][j];
                        sum += arrM[a][b];
                        Math.max(sum, arrM[a][b]);
                    }
                }
                System.out.println(sum);
            }
        }
        
    }
}
