package 수업.day01;

import java.util.*;

public class baek2750 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int[] arr = new int[a];
		
		for(int i = 0;i<a;i++) {
			arr[i] = sc.nextInt();
			
		}
		
		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));
	}

}
