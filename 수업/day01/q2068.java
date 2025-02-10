package 수업.day01;
import java.util.Scanner;

public class q2068 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
		int[] arr = new int[10];
		int temp = 0;
		
		for(int i = 0;i<10;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=9;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr[0]);
		

	}

}
