package 과제.swea;

import java.util.Scanner;

public class swea1209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열 생성
        int[][] arr = new int[101][101];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int mid = arr[50][50];
        int N = arr.length;
        // 행
        int rowMax = Integer.MIN_VALUE;
        int row = 0; 
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                row += arr[i][j];
            }
            rowMax = Math.max(row, rowMax);
        }
        // 열
        int colMax = Integer.MIN_VALUE;    // 열의 최대값
        int col = 0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                col += arr[j][i];
            }
            colMax = Math.max(col,colMax);
        }

        int[] dxD = {-1,-1,1,1};
        int[] dyD = {-1,1,1,-1};
        
        // 오른쪽 대각선 
        int rightDiagonal = 0; 
        // 왼쪽 대각선
        int leftDiagonal = 0;  
        for(int i=0;i<N;i++){
            int nx = mid + dxD[i];
            int ny = mid + dyD[i];
            rightDiagonal += nx;
            leftDiagonal += ny;
        }

        
        System.out.println(Math.max(Math.max(rowMax, colMax),Math.max(rightDiagonal, leftDiagonal)));


    }
}
