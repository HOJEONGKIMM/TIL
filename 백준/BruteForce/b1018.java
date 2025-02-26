package 백준.BruteForce;

import java.util.Scanner;

public class b1018 {

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        String[][] board = new String[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                board[i][j] = sc.nextLine();
            }
        }

        


    }
}
