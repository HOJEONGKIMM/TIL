package 백준.수학;

import java.util.Scanner;

public class b3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];
        int[] original = {1,1,2,2,2,8};

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            sb.append(original[i] - arr[i]).append(" ");    
        }

        System.out.print(sb);
    }
}
