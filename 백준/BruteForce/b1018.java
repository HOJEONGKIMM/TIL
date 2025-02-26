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
        boolean[][] visited = new boolean[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                board[i][j] = sc.nextLine();
            }
        }

        int cnt = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){

                for(int dir = 0; dir < 4; dir++){
                    int nx = i + dx[dir];
                    int ny = j + dy[dir];


                    if(board[i][j].equals("B")){
                        if(nx>=0 && nx< N && !board[nx][ny].equals("W") && !visited[nx][ny]) {
                            board[nx][ny] = "W";
                            cnt++;
                            visited[nx][ny] = true;
                        }
                    }else{
                        if(nx>=0 && nx< N && !board[nx][ny].equals("B") && !visited[nx][ny]) {
                            board[nx][ny] = "B";
                            cnt++;
                            visited[nx][ny] = true;
                        }

                    }

                }

            }
        }
        System.out.println(cnt);


    }
}
