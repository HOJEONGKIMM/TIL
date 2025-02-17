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

        System.out.println(sum);

        
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
                leftDown += arr[j][i];
            }
        }

        // 오른쪽아래
        int rightDown = 0;
        for(int i=N-1; i>N/2; i--){
            for(int j=(N/2)+1; j<N; j++){
                rightDown += arr[j][i];
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.println(arr[i][j] + " ");
            }
        }

        System.out.println(sum);

    }
}


// import java.util.*;
// class Solution
// {
//     final static Scanner sc = new Scanner(System.in);
//     public static void main(String args[]) throws Exception
//     {
//         int T = sc.nextInt();
//         for (int t=1;t<=T;t++) {
//             System.out.println("#" + t + " " + run());
//         }
//     }
//     private static String run() {
//         int n = sc.nextInt(); 
//         byte[][] arr = new byte[n][n];
//         long sum=0;
//         for (int i=0;i<n;i++) {
//             String str = sc.next();
//             for (int j=0;j<n;j++) {
//                 arr[i][j] = (byte)Character.getNumericValue(str.charAt(j));
//             }
//         }
//         for (int i=0;i<n;i++) {
//             int diff = Math.min(i, n-i-1);
//             for (int j=n/2-diff;j<n/2+1+diff;j++) {
//                 sum+=arr[i][j];
//             }
//         }
//         return String.valueOf(sum);
//     }
// }