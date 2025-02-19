package 과제.swea;

import java.util.Scanner;

public class swea2805_농작물 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        
        String[][] matrix = new String[N][N];

        // for(int i=0; i<N; i++){
        //     matrix[i]= sc.nextLine().split("");
        // }

        for(int i=0; i<N; i++){
            String line = sc.nextLine();
            for(int j=0; j<N; j++){
                matrix[i][j] = String.valueOf(line.charAt(j));
            }
        }

        int[][] numbers = new int[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                numbers[i][j] = Integer.parseInt(matrix[i][j]);
            }
        }


        int sum =0;
        // 마름모꼴
        // 위의 삼각형
        
        for(int i=0; i<N; i+=2){
            for(int j=0; j<(N-i)/2; j++){
                numbers[i][j] = 0;
            }
            for(int j=0; j<i; j++){
                sum += numbers[i][j];
            }
        }
        // 아래의 역삼각형
        for(int i=N-1; i>=0; i-=2){
            for(int j=0; j<(N-i)/2; j++){
                numbers[i][j] = 0;
            }
            for(int j=0; j<i; j++){
                sum += numbers[i][j];
            }
        }
        


        System.out.println(sum);

    }
}
