import java.util.Arrays;

public class 순열04_비트마스킹 {
	static int[] nums;
	static int N;
	static int[] result; 	// 결과 배열
	static boolean[] visited; // 방문 체크

	public static void main(String[] args) {
		nums = new int[] { 0, 1, 1 };
		N = nums.length;

		result = new int[N];
		visited = new boolean[N];
		permutation(0, 0);
	}

	// idx : 내가 채울 위치
	static void permutation(int idx, int visited) {
		// 기저조건
//		if(visited == (1 << N) - 1)
		if (idx == N) {
			System.out.println(Arrays.toString(result));
			return;
		}

		// 비트 마스킹
		for (int j = 0; j < N; j++) {
			// 사용했니
			if((visited & (1<<j)) != 0) { // 사용함
				continue;
			}
			result[idx] = nums[j];
			//visited = visited | (1 << j);
			permutation(idx + 1, visited | (1 << j));
			
			// 원상복구
			
		}
	}


}
