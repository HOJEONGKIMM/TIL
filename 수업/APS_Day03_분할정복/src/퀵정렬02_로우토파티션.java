
public class 퀵정렬02_로우토파티션 {

	static int[] arr = { 1, 5, 9, 6, 7, 56, 76 };
	static int N = arr.length;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static void quickSort(int start, int end) {
		if (start < end) {
			int pivot = partition(start, end);
			quickSort(start, pivot - 1);
			quickSort(pivot + 1, end);
		}
	}

	static int partition(int start, int end) {
		int pivot = arr[start];

		int L = start + 1;
		int R = end;

		while (L <= R) {
			// L : pivot보다 큰 값을 찾을 때까지 이동
			while(L <= R && arr[L] <= pivot) L++;
			
			// R : pivot보다 작거나 같은 값을 찾을 때까지 이동
			while(arr[R] > pivot) R--;
			
			// 아직 교차 X
			if(L < R) {
				int tmp = arr[L];
				arr[L] = arr[R];
				arr[R]  = arr[L];
			}
		}
		
		// 마지막에 R과 피봇 위치 교환
		int tmp = arr[start];
		arr[start] = arr[R];
		arr[R] = tmp;

		return 0;
	}

}
