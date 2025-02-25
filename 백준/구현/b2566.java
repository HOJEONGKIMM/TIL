package 백준.구현;

import java.util.Scanner;

public class b2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix= new int[9][9];

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                matrix[i][j] = sc.nextInt();

            }
        }

        int max = 0;
        int newI = 0;
        int newJ = 0;
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                    newI = i;
                    newJ = j;
                }
               
            }
            
        }


        System.out.println(matrix[newI][newJ]);
        System.out.println(newI + 1 + " " + (newJ + 1));

        sc.close();
    }
}
