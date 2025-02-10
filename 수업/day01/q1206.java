package 수업.day01;
import java.util.Scanner;

public class q1206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		int sum = 0; // 조망권 확보된 세대 수 총계
		
		// arr 배열에 값 넣기
		for(int i=0; i<N;i++) {
			arr[i] = sc.nextInt();
		}
		
		// 배열 3번째 값부터 끝에서 3번째까지 중간값이 가능하도록 반복문 설정
		for(int i=2;i<arr.length-2;i++) {
			if((arr[i]>arr[i-2]) && (arr[i]>arr[i-1]) && (arr[i]>arr[i+1]) && (arr[i]> arr[i+2])) {
				// 주변 값들의 최대값 구하기
				// 왼쪽 최대 = temp1, 오른쪽 최대 = temp2
				// 그 둘 중 최대값 max로 구해서 arr[i]에서 뺌
				// 그 값을 sum에 더해주기
				int tem1 = Math.max(arr[i-2], arr[i-1]);
				int tem2 = Math.max(arr[i+1], arr[i+2]);
				if(arr[i] > Math.max(tem1, tem2))sum += arr[i] - Math.max(tem1, tem2);
			}

			
		}
		System.out.println(sum);
	}

}
