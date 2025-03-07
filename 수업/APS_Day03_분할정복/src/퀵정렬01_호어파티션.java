import java.util.Arrays;

public class 퀵정렬01_호어파티션 {

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
		int pivot = arr[end];

		int i = start - 1;
		for (int j = start; j < end; j++) {
			if (arr[j] <= pivot) {
				i++;
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
		
		int tmp = arr[start];
		arr[i+1] = arr[end];
		arr[end] = tmp;
		
		return i+1;
	}

}
