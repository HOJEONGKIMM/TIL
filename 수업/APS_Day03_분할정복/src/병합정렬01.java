import java.util.Arrays;

public class 병합정렬01 {

	static int[] arr = { 1, 5, 9, 6, 7, 56, 76 };
	static int N = arr.length;

	// 임시공간
	static int[] tmp = new int[N];

	public static void main(String[] args) {
		
		mergeSort(0, N-1);
		System.out.println(Arrays.toString(arr));
		
	}

	static void mergeSort(int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(start, mid);
			mergeSort(mid + 1, end);
			merge(start, mid, end);
		}
	}

	static void merge(int start, int mid, int end) {
		// 정렬하고자 하는 부분 배열들의 시작 위치를 초기화
		int L = start;
		int R = mid + 1;

		int idx = start; // 임시 공간의 인덱스

		while (L <= mid && R <= end) {
			if (arr[L] <= arr[R]) {
				tmp[idx++] = arr[L++];
			} else {
				tmp[idx++] = arr[R++];
			}
		} // 한쪽 구간 전부 끝

		if (L <= mid) {
			for (int i = L; i <= mid; i++) {
				tmp[idx++] = arr[i];
			}
		} else {
			for (int i = R; i <= end; i++) {
				tmp[idx++] = arr[i];
			}
		} // 남은 구간 다 털기

		for (int i = start; i <= end; i++) {
			arr[i] = tmp[i];
		}

	}

}
