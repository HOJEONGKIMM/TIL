package 과제.swea;


import java.util.Scanner;

public class swea9490 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] arr = new int[N][M];
		int ans =0;
		
		// 델타 탐색용 
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};

		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				arr[i][j] = sc.nextInt();// 숫자 받기
				
			}
			
		}
		
		int maxSum = Integer.MIN_VALUE;
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				// 합
				for(int round =0; round<arr[i][j]; round++) {
					int sum = 0;
					for(int a=0;a<4;a++) {
						// 반복문 한 번 더 돌려야 되는 것 같음........ 
						// 근데 조건 어케 써야될지 모르겠음
						
						int nx = arr[i][j] + dx[a];
						int ny = arr[i][j] + dy[a];
						
						if(nx>=0 & nx<=N && ny>=0 && ny<=M) {
							sum += nx + ny;
							
						}
					}
					ans = Math.max(maxSum, sum) - arr[i][j];
				}
				
			}
				
		}
		System.out.println(ans);
		
	}
}
