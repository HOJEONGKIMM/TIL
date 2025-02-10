package 수업.day01;
import java.util.*;

public class q1984 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int sum = 0;
		
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i=1;i<arr.length-1;i++) {
			sum += arr[i];
		}
		
		System.out.println(sum/(arr.length-2));
		// System.out.println("#" +test_case +""+sum/(arr.length-2));

	}

}
