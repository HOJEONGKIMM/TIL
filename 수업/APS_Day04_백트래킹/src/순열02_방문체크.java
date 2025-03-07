import java.util.Arrays;

public class 순열02_방문체크 {

	static int[] nums;
	static int N;
	static int[] result; 	// 결과 배열
	static boolean[] visited; // 방문 체크

	public static void main(String[] args) {
		nums = new int[] { 0, 1, 2 };
		N = nums.length;

		result = new int[N];
		visited = new boolean[N];
		permutation(0);
	}

	// idx : 내가 채울 위치
	static void permutation(int idx) {
		// 기저조건
		if (idx == N) {
			System.out.println(Arrays.toString(result));
			return;
		}

		// 재귀부분
		for (int i = 0; i < N; i++) {
			// 사용하지 않은 원소를 사용해야 됨
			// 1. 사용했으면 쳐내기
			if(visited[i] == true) continue;
			result[idx] = nums[i];
			visited[i] = true;
			permutation(idx+1);
			//result[idx] = 0;
			visited[i] = false;	// 원상복구
			// 2. 사용하지 않았으면 해라
//			if(!visited[i]) {코드}
		}
	}



}
