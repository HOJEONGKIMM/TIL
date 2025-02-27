package 백준.BruteForce;

import java.util.Scanner;

public class b1018 {

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        char[][] board = new char[N][M];
        boolean[][] visited = new boolean[N][M];

        // for(int i=0; i<N; i++){
        //     for(int j=0; j<M; j++){
        //         board[i][j] = sc.nextLine();
        //     }
        // }

        for(int i=0; i<N; i++){
            String line = sc.next();
            for(int j=0; j<M; j++){
                board[i][j] =line.charAt(j);
            }
        }

        int cnt = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){

                int x = i;
                int y = j;                
                
                while (true) { 
                    
                    int nextX = -1;
                    int nextY = -1;
                
                    for(int dir = 0; dir < 4; dir++){
                        int nx = x + dx[dir];
                        int ny = y + dy[dir];


                        if(board[x][y]=='B'){
                            if(nx>=0 && nx< N && board[nx][ny]!='W' && !visited[nx][ny]) {
                                board[nx][ny] = 'W';
                                cnt++;
                                visited[nx][ny] = true;
                                nextX = nx; nextY = ny;
                            }
                        }else{
                            if(nx>=0 && nx< N && board[nx][ny]!='B' && !visited[nx][ny]) {
                                board[nx][ny] = 'B';
                                cnt++;
                                visited[nx][ny] = true;
                                nextX = nx; nextY = ny;
                            }

                        }

                        if(nextX==-1) {
                            break;
                        }
                        x = nextX; y = nextY;

                    }
                }

            }
        }
        System.out.println(cnt);


    }
}
