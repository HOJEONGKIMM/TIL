package 과제.swea;

import java.util.Scanner;

public class swea1209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열 생성
        int[][] arr = new int[100][100];

        
        for(int T=1;T<=10;T++){
            int abc = sc.nextInt();


            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                    arr[i][j] = sc.nextInt();
                }
            }

            int N = arr.length;

            // 행
            int rowMax = Integer.MIN_VALUE;
            for(int i=0;i<N;i++){
                int row = 0; 
                for(int j=0;j<N;j++){
                    row += arr[i][j];
                }
                rowMax = Math.max(row, rowMax);
            }

            // 열
            int colMax = Integer.MIN_VALUE;    
            for(int i=0;i<N;i++){
                int col = 0;
                for(int j=0;j<N;j++){
                    col += arr[j][i];
                }
                colMax = Math.max(col,colMax);
            }
    
            int rightDiagonal = 0;      // 오른쪽 대각선 
            int leftDiagonal = 0;       // 왼쪽 대각선
            for(int i=0;i<N;i++){
                rightDiagonal += arr[i][i];
                leftDiagonal += arr[i][N-i-1];
            }


            
            int ans = Math.max(Math.max(rowMax, colMax), Math.max(rightDiagonal, leftDiagonal));


            System.out.println("#" +  T + " " + ans);

        }
    }
}
