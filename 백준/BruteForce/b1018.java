package 백준.BruteForce;

import java.util.Scanner;

public class b1018 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        char[][] board = new char[N][M];
        boolean[][] visited = new boolean[N][M];


        for(int i=0; i<N; i++){
            String line = sc.next();
            for(int j=0; j<M; j++){
                board[i][j] =line.charAt(j);
            }
        }

        


    }
}
