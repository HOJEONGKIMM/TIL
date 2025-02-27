package 문제정리;

import java.util.*;

public class FinalIM {

	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<= T; t++) {
			int N = sc.nextInt();
			
			int[][] arr = new int[N][N];
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
	
			int longest = Integer.MIN_VALUE;
			
			for(int i=0; i<N; i++) {
                for(int j=0; j<N; j++) {
                    
                    int cnt = 1;            // 본인이 경로에 포함되며 시작
					int nextValue = 501;    // 최소값 비교해줄 변수
					
                    int x = i;              // 시작하는 건물의 좌표값
                    int y = j;

                    while(true){ 
                        
                        int nextX = -1;     // 새롭게 이동할 X의 좌표 (0이 안 되는 이유는 0,0이 있으니까)
                        int nextY = -1;     // 새롭게 이동할 Y의 좌표 (0이 안 되는 이유는 0,0이 있으니까)
                        
                        
                        for(int dir=0; dir<4; dir++) {
                            
                            int nx = x + dx[dir];       // 상하좌우 중 최소값 찾기
                            int ny = y + dy[dir];
                            
                                if(nx >= 0 && nx < N && ny >= 0 && ny < N) {
                                    if(nextValue > arr[nx][ny]) {
                                        nextValue = arr[nx][ny];
                                        nextX = nx;					// 최소값을 가진 좌표의 X값으로 이동할 곳의 좌표 업데이트
                                        nextY = ny;
                                    }
                                } 
                            }
							if(nextX == -1) break;						// 상하좌우에서 나보다 작은 값 없으면 while문 탈출
							
							x = nextX; y = nextY;
							cnt ++;						// 최소값 찾을 때마다 길이 +1
					}
					longest = Math.max(cnt, longest);
					
				}
			}
			System.out.println("#" + t + " " +longest);
			
		}
		
	}
}



