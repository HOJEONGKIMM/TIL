package 과제.swea;

// 회문2

import java.util.Scanner;

public class swea1216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] arr = new char[100][];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				String chars = sc.nextLine();
                arr[i] = chars.toCharArray();
			}
		}
        int maxSum1 = 0;
        int maxSum2 = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                int sum1 = 1;
                if(j-1>=0 && j+1<=arr.length){
                    while(arr[i][j-1]==arr[i][j+1]){
                        sum1+=2;
                    }
                }
                maxSum1 = Math.max(maxSum1, sum1);
                
                int sum2 = 1;
                if(i-1>=0 && i+1<=arr.length){
                    while(arr[j][i-1]==arr[j][i+1]){
                        sum2+=2;
                    }
                }
                maxSum2 = Math.max(maxSum2, sum2);
            }
        }
        int ans = 0;
        ans = Math.max(maxSum1, maxSum2);
		System.out.println(ans);
    }
}
